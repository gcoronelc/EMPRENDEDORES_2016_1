package pe.egcc.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AccesoDB {

 private AccesoDB() {
  }

  public static Connection getConnection() throws SQLException {
    Connection cn = null;
    try {
      // Datos Oracle
      String driver = "net.sourceforge.jtds.jdbc.Driver";
      String url = "jdbc:jtds:sqlserver://localhost:1433/ALUMNO-PC";
      String user = "zoila";
      String pass = "123";
      // Cargar el driver a memoria
      Class.forName(driver).newInstance();
      // Obtener el objeto Connection
      cn = DriverManager.getConnection(url, user, pass);
    } catch (SQLException e) {
      throw e;
    } catch (ClassNotFoundException e) {
      throw new SQLException("ERROR, no se encuentra el driver.");
    } catch (Exception e) {
      throw new SQLException("ERROR, no se tiene acceso al servidor.");
    }
    return cn;
  }    
}
