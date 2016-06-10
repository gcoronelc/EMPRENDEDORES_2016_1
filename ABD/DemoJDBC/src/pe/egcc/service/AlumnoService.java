package pe.egcc.service;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Types;
import pe.egcc.db.AccesoDB;
import pe.egcc.domain.Alumno;

public class AlumnoService {

  public void insertar(Alumno alumno) {
    Connection cn = null;
    try {
      // Obtener una conexión
      cn = AccesoDB.getConnection();
      // Deshabilitar el manejo de TX, lo realiza el SP
      cn.setAutoCommit(true);
      // Preparar el SP
      String sql = "{call usp_alumno_insert(?,?,?,?,?,?)}";
      CallableStatement cstm = cn.prepareCall(sql);
      cstm.registerOutParameter(1, Types.VARCHAR);
      cstm.setString(2, alumno.getApellido());
      cstm.setString(3, alumno.getNombre());
      cstm.setString(4, alumno.getDireccion());
      cstm.setString(5, alumno.getTelefono());
      cstm.setString(6, alumno.getEmail());
      // Ejecutando el SP
      cstm.executeUpdate();
      alumno.setId(cstm.getString(1));
    } catch (Exception e) {
      String msg = "Error en el proceso.";
      if( e != null && e.getMessage() != null){
        msg += "\n" + e.getMessage();
      }
      throw new RuntimeException(msg);
    } finally{
      try {
        cn.close();
      } catch (Exception e) {
      }
    }
  }
}
