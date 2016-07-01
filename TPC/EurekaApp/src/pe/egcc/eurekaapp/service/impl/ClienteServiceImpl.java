package pe.egcc.eurekaapp.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import pe.egcc.eurekaapp.db.AccesoDB;
import pe.egcc.eurekaapp.domain.Cliente;
import pe.egcc.eurekaapp.service.espec.ClienteServiceEspec;

public class ClienteServiceImpl implements ClienteServiceEspec{

  @Override
  public void insertar(Cliente bean) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public void actualizar(Cliente bean) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public void eliminar(String codigo) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Cliente traerPorCodigo(String codigo) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public List<Cliente> traerVarios(Cliente bean) {
    List<Cliente> lista = new ArrayList<>();
    Connection cn = null;
    try {
      // Objeto Connection
      cn = AccesoDB.getConnection();
      // La consulta
      String sql = "select chr_cliecodigo, vch_cliepaterno, "
              + "vch_cliematerno, vch_clienombre, chr_cliedni, "
              + "vch_clieciudad, vch_cliedireccion, "
              + "vch_clietelefono, vch_clieemail "
              + "from dbo.Cliente  "
              + "where chr_cliecodigo like (? + '%') "
              + "and vch_cliepaterno like (? + '%') "
              + "and vch_cliematerno like (? + '%') "
              + "and vch_clienombre like (? + '%') ";
      PreparedStatement pstm = cn.prepareStatement(sql);
      pstm.setString(1, bean.getCodigo());
      pstm.setString(2, bean.getPaterno());
      pstm.setString(3, bean.getMaterno());
      pstm.setString(4, bean.getNombre());
      // Ejecutar consulta
      ResultSet rs = pstm.executeQuery();
      // Pasar el resultado a la lista
      while(rs.next()){
        Cliente r = new Cliente();
        r.setCodigo(rs.getString("chr_cliecodigo"));
        r.setPaterno(rs.getString("vch_cliepaterno"));
        r.setMaterno(rs.getString("vch_cliematerno"));
        r.setNombre(rs.getString("vch_clienombre"));
        r.setDni(rs.getString("chr_cliedni"));
        r.setCiudad(rs.getString("vch_clieciudad"));
        r.setDireccion(rs.getString("vch_cliedireccion"));
        r.setTelefono(rs.getString("vch_clietelefono"));
        r.setEmail(rs.getString("vch_clieemail"));
        lista.add(r);
      }
      rs.close();
      pstm.close();
    } catch (Exception e) {
      String texto = "Error en el acceso a la base de datos.";
      if(e != null && !e.getMessage().isEmpty()){
        texto += "\n" + e.getMessage();
      }
      throw new RuntimeException(texto);
    } finally{
      try {
        cn.close();
      } catch (Exception e) {
      }
    }
    return lista;
  }

  
  
  
  
}
