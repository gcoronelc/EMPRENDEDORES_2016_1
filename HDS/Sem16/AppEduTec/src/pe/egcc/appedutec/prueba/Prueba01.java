package pe.egcc.appedutec.prueba;

import java.sql.Connection;
import pe.egcc.appedutec.db.AccesoDB;

/**
 *
 * @author Gustavo Coronel
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 */
public class Prueba01 {
  
  public static void main(String[] args) {
    try {
      Connection cn = AccesoDB.getConnection();
      System.out.println("Conexión ok.");
      cn.close();
    } catch (Exception e) {
      System.err.println(e.getMessage());
    }
  }
  
  
}
