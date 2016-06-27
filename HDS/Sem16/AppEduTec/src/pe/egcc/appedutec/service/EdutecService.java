package pe.egcc.appedutec.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import pe.egcc.appedutec.db.AccesoDB;
import pe.egcc.appedutec.domain.Profesor;

/**
 *
 * @author Gustavo Coronel
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 */
public class EdutecService {
  
  public List<Profesor> conProfesore(Profesor bean){
    List<Profesor> lista = new ArrayList<>();
    Connection cn = null;
    try {
      cn = AccesoDB.getConnection();
      String sql = "select idprofesor, apeprofesor, nomprofesor,"
              + "dirprofesor, telprofesor, emailprofesor "
              + "from profesor where "
              + "idprofesor like concat(?,'%') "
              + "and apeprofesor like concat(?,'%') "
              + "and nomprofesor like concat(?,'%') "
              + "and dirprofesor like concat(?,'%') "
              + "and telprofesor like concat(?,'%') "
              + "and emailprofesor like concat(?,'%') ";
      PreparedStatement pstm = cn.prepareStatement(sql);
      pstm.setString(1, bean.getCodigo());
      pstm.setString(2, bean.getApellido());
      pstm.setString(3, bean.getNombre());
      pstm.setString(4, bean.getDireccion());
      pstm.setString(5, bean.getTelefono());
      pstm.setString(6, bean.getEmail());
      ResultSet rs = pstm.executeQuery();
      while(rs.next()){
        Profesor obj = new Profesor();
        obj.setCodigo(rs.getString("idprofesor"));
        obj.setApellido(rs.getString("apeprofesor"));
        obj.setNombre(rs.getString("nomprofesor"));
        obj.setDireccion(rs.getString("dirprofesor"));
        obj.setTelefono(rs.getString("telprofesor"));
        obj.setEmail(rs.getString("emailprofesor"));
        lista.add(obj);
      }
      rs.close();
      pstm.close();
    } catch (Exception e) {
      throw new RuntimeException("Error.");
    } finally{
      try {
        cn.close();
      } catch (Exception e) {
      }
    }
    return lista;
  }
  
  
}
