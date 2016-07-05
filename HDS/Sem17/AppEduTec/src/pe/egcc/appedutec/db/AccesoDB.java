package pe.egcc.appedutec.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Esta clase permite tener acceso a un objeto Connection.
 * 
 * @author Gustavo Coronel
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 */
public final class AccesoDB {

  /**
   * Constructor privado para que no se pueda instanciar.
   */
  private AccesoDB() {
  }
  
  // Parametros de conexión
  private static final String DB_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
  private static final String DB_URL = "jdbc:sqlserver://192.168.253.135:1433;databaseName=EduTec";
  private static final String DB_USER = "papucho";
  private static final String DB_PASS = "admin";
  
  /**
   * Permite tener acceso al objeto Connection.
   * 
   * @return
   * @throws SQLException 
   */
  public static Connection getConnection() throws SQLException{
    Connection cn = null;
    try {
      // Paso 1: Cargar el driver
      Class.forName(DB_DRIVER).newInstance();
      // Paso 2: Obtener el objeto Connection
      cn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
    } catch (ClassNotFoundException e) {
      throw new SQLException("No se encuentra el driver.");
    } catch(SQLException e){
      throw e;
    } catch(Exception e){
      throw new SQLException("No se puede establecer la conexión con la BD.");
    }
    return cn;
  }
  
}
