package pe.egcc.eurekaapp.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class AccesoDB {

  // Parámetros
  private static final String  DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
  private static final String  URL = "jdbc:sqlserver://localhost:1433;databaseName=eurekabank";
  private static final String  USER = "gustavo";
  private static final String  PASSWORD = "coronel";
  
  private AccesoDB() {
  }

  public static Connection getConnection() throws SQLException{
    Connection cn = null;
    try {
      // Paso 1: Cargar driver
      Class.forName(DRIVER).newInstance();
      // Paso 2: Obtener conexión
      cn = DriverManager.getConnection(URL, USER, PASSWORD);
    } catch (ClassNotFoundException e) {
      throw new SQLException("No se encuentra el deriver JDBC.");
    } catch(Exception e){
      String texto = "Error de acceso a la BD.";
      if(e.getMessage() != null && !e.getMessage().isEmpty()){
        texto += "\n" + e.getMessage();
      }
      throw new SQLException(texto);
    }
    return cn;
  }
  
}
