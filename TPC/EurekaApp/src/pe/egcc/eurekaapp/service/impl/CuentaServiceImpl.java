package pe.egcc.eurekaapp.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import pe.egcc.eurekaapp.db.AccesoDB;
import pe.egcc.eurekaapp.service.espec.CuentaServiceEspec;

public class CuentaServiceImpl implements CuentaServiceEspec{

  @Override
  public void regDeposito(String cuenta, double importe, String codEmp) {
    Connection cn = null;
    try {
      // Abrir conexión
      cn = AccesoDB.getConnection();
      // Inicio de Tx
      cn.setAutoCommit(false);
      // Leer datos de cuenta
      String sql = "select dec_cuensaldo, int_cuencontmov "
              + "from cuenta "
              + "WITH (XLOCK, ROWLOCK, HOLDLOCK) "
              + "where chr_cuencodigo = ?";
      PreparedStatement pstm = cn.prepareStatement(sql);
      pstm.setString(1, cuenta);
      ResultSet rs = pstm.executeQuery();
      if(!rs.next()){
        throw new Exception("Cuenta no existe.");
      }
      double saldo = rs.getDouble("dec_cuensaldo");
      int cont = rs.getInt("int_cuencontmov");
      rs.close();
      pstm.close();
      // Actualiza datos de cuenta
      saldo += importe;
      cont++;
      sql = "update cuenta set dec_cuensaldo = ?, int_cuencontmov = ?"
              + " where chr_cuencodigo = ? ";
      pstm = cn.prepareStatement(sql);
      pstm.setDouble(1, saldo);
      pstm.setInt(2, cont);
      pstm.setString(3, cuenta);
      pstm.executeUpdate();
      pstm.close();
      // Insertar movimiento
      sql = "insert into movimiento(chr_cuencodigo,int_movinumero,"
              + "dtt_movifecha,chr_emplcodigo,chr_tipocodigo,"
              + "dec_moviimporte) values(?,?,GETDATE(),?,'003',?)";
      pstm = cn.prepareStatement(sql);
      pstm.setString(1, cuenta);
      pstm.setInt(2, cont);
      pstm.setString(3, codEmp);
      pstm.setDouble(4, importe);
      pstm.executeUpdate();
      pstm.close();
      // Confirmar Tx
      cn.commit();
    } catch (Exception e) {
      try {
        cn.rollback();
      } catch (Exception e1) {
      }
      String texto = "Error en proceso.";
      if (e != null && !e.getMessage().isEmpty()) {
        texto += "\n" + e.getMessage();
      }
      throw new RuntimeException(texto);
    } finally {
      try {
        // Cerrar conexión
        cn.close();
      } catch (Exception e) {
      }
    }
  
  }
  
}
