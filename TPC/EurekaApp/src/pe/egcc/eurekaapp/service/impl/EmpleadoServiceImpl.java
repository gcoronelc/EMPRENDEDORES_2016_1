package pe.egcc.eurekaapp.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import pe.egcc.eurekaapp.db.AccesoDB;
import pe.egcc.eurekaapp.domain.Empleado;
import pe.egcc.eurekaapp.service.espec.EmpleadoServiceEspec;

public class EmpleadoServiceImpl implements EmpleadoServiceEspec {

  // SQL: SELECT, INSERT, DELETE, UPDATE
  private final String SQL_SELECT = "select chr_emplcodigo,vch_emplpaterno, "
          + "vch_emplmaterno,vch_emplnombre,vch_emplciudad,"
          + "vch_empldireccion,vch_emplusuario "
          + "from dbo.Empleado  ";
  private final String SQL_INSERT = "insert into dbo.empleado("
          + "chr_emplcodigo,vch_emplpaterno,vch_emplmaterno,"
          + "vch_emplnombre,vch_emplciudad,vch_empldireccion,"
          + "vch_emplusuario,vch_emplclave) values(?,?,?,?,?,?,?,?)";
  private final String SQL_UPDATE = "update empleado set vch_emplpaterno = ?, "
          + "vch_emplmaterno = ?, vch_emplnombre = ?, vch_emplciudad = ?,"
          + "vch_empldireccion = ?, vch_emplusuario = ? "
          + "where chr_emplcodigo = ?  ";
  private final String SQL_DELETE = "delete from empleado "
          + "where chr_emplcodigo = ?  ";

  @Override
  public Empleado validar(String usuario, String clave) {
    Empleado bean = null;
    Connection cn = null;
    try {
      cn = AccesoDB.getConnection();
      String sql = SQL_SELECT
              + "where vch_emplusuario = ?  and vch_emplclave = ?";
      PreparedStatement pstm = cn.prepareStatement(sql);
      pstm.setString(1, usuario);
      pstm.setString(2, clave);
      ResultSet rs = pstm.executeQuery();
      if (rs.next()) {
        bean = rowToBean(rs);
      }
      rs.close();
      pstm.close();
      if (bean == null) {
        throw new SQLException("Datos incorrectos.");
      }
    } catch (SQLException e) {
      String texto = "Error de acceso a la BD.";
      if (e.getMessage() != null && !e.getMessage().isEmpty()) {
        texto = e.getMessage();
      }
      throw new RuntimeException(texto);
    } catch (Exception e) {
      String texto = "Error de acceso a la BD.";
      if (e.getMessage() != null && !e.getMessage().isEmpty()) {
        texto += "\n" + e.getMessage();
      }
      throw new RuntimeException(texto);
    } finally {
      try {
        cn.close();
      } catch (Exception e) {
      }
    }
    return bean;
  }

  @Override
  public void insertar(Empleado bean) {
    Connection cn = null;
    try {
      cn = AccesoDB.getConnection();
      // Iniciar la Tx
      cn.setAutoCommit(false);
      // Leer contador
      String sql = "select int_contitem, int_contlongitud "
              + "from contador "
              + "WITH (XLOCK, ROWLOCK, HOLDLOCK) "
              + "where vch_conttabla = 'Empleado' ";
      PreparedStatement pstm = cn.prepareStatement(sql);
      ResultSet rs = pstm.executeQuery();
      if (!rs.next()) {
        throw new Exception("Contador no existe.");
      };
      int cont = rs.getInt("int_contitem");
      int size = rs.getInt("int_contlongitud");
      rs.close();
      pstm.close();
      // Actualizar tabla
      cont++;
      sql = "update contador set int_contitem = ? "
              + "where vch_conttabla = 'Empleado'";
      pstm = cn.prepareStatement(sql);
      pstm.setInt(1, cont);
      pstm.executeUpdate();
      pstm.close();
      // Generar código
      String codigo = "000000000" + String.valueOf(cont);
      codigo = codigo.substring(codigo.length() - size);
      // Insertar Empleado
      pstm = cn.prepareStatement(SQL_INSERT);
      pstm.setString(1, codigo);
      pstm.setString(2, bean.getPaterno());
      pstm.setString(3, bean.getMaterno());
      pstm.setString(4, bean.getNombre());
      pstm.setString(5, bean.getCiudad());
      pstm.setString(6, bean.getDireccion());
      pstm.setString(7, bean.getUsuario());
      pstm.setString(8, "123456");
      pstm.executeUpdate();
      // Confirmar la Tx
      cn.commit();
      bean.setCodigo(codigo);
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
        cn.close();
      } catch (Exception e) {
      }
    }
  }

  @Override
  public void actualizar(Empleado bean) {
    Connection cn = null;
    try {
      cn = AccesoDB.getConnection();
      // Iniciar la Tx
      cn.setAutoCommit(false);
      // Proceso
      PreparedStatement pstm = cn.prepareStatement(SQL_UPDATE);
      pstm.setString(1, bean.getPaterno());
      pstm.setString(2, bean.getMaterno());
      pstm.setString(3, bean.getNombre());
      pstm.setString(4, bean.getCiudad());
      pstm.setString(5, bean.getDireccion());
      pstm.setString(6, bean.getUsuario());
      pstm.setString(7, bean.getCodigo());
      pstm.executeUpdate();
      pstm.close();
      // Confirmar la Tx
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
        cn.close();
      } catch (Exception e) {
      }
    }
  }

  @Override
  public void eliminar(String codigo) {
    Connection cn = null;
    try {
      cn = AccesoDB.getConnection();
      // Iniciar la Tx
      cn.setAutoCommit(false);
      // Verificar si tiene registros en tabla ASIGNADO
      String sql = "select count(*) cont from asignado where chr_emplcodigo = ?";
      PreparedStatement pstm = cn.prepareStatement(sql);
      pstm.setString(1, codigo);
      ResultSet rs = pstm.executeQuery();
      rs.next();
      int contAsig = rs.getInt("cont");
      rs.close();
      pstm.close();
      // Verificar si tiene registros en tabla CUENTA
      sql = "select count(*) cont from cuenta where chr_emplcreacuenta = ?";
      pstm = cn.prepareStatement(sql);
      pstm.setString(1, codigo);
      rs = pstm.executeQuery();
      rs.next();
      int contCuen = rs.getInt("cont");
      rs.close();
      pstm.close();
      // Verificar si tiene registros en tabla MOVIMIENTO
      sql = "select count(*) cont from movimiento where chr_emplcodigo = ?";
      pstm = cn.prepareStatement(sql);
      pstm.setString(1, codigo);
      rs = pstm.executeQuery();
      rs.next();
      int contMovi = rs.getInt("cont");
      rs.close();
      pstm.close();
      // Verificación
      if(contAsig > 0 || contCuen > 0 || contMovi > 0){
        throw new Exception("Error, empleado tiene registros relacionados, no es posible eliminarlo.");
      }
      // Proceso de eliminación
      pstm = cn.prepareStatement(SQL_DELETE);
      pstm.setString(1, codigo);
      pstm.executeUpdate();
      pstm.close();
      // Confirmar la Tx
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
        cn.close();
      } catch (Exception e) {
      }
    }
  }

  @Override
  public Empleado traerPorCodigo(String codigo) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public List<Empleado> traerVarios(Empleado bean) {
    List<Empleado> lista = new ArrayList<>();
    Connection cn = null;
    try {
      // Objeto Connection
      cn = AccesoDB.getConnection();
      // La consulta
      String sql = SQL_SELECT
              + "where chr_emplcodigo like (? + '%') "
              + "and vch_emplpaterno like (? + '%') "
              + "and vch_emplmaterno like (? + '%') "
              + "and vch_emplnombre like (? + '%') ";
      PreparedStatement pstm = cn.prepareStatement(sql);
      pstm.setString(1, bean.getCodigo());
      pstm.setString(2, bean.getPaterno());
      pstm.setString(3, bean.getMaterno());
      pstm.setString(4, bean.getNombre());
      // Ejecutar consulta
      ResultSet rs = pstm.executeQuery();
      // Pasar el resultado a la lista
      while (rs.next()) {
        Empleado r = rowToBean(rs);
        lista.add(r);
      }
      rs.close();
      pstm.close();
    } catch (Exception e) {
      String texto = "Error en el acceso a la base de datos.";
      if (e != null && !e.getMessage().isEmpty()) {
        texto += "\n" + e.getMessage();
      }
      throw new RuntimeException(texto);
    } finally {
      try {
        cn.close();
      } catch (Exception e) {
      }
    }
    return lista;

  }

  @Override
  public Empleado rowToBean(ResultSet rs) throws SQLException {
    Empleado bean = new Empleado();
    bean.setCodigo(rs.getString("chr_emplcodigo"));
    bean.setPaterno(rs.getString("vch_emplpaterno"));
    bean.setMaterno(rs.getString("vch_emplmaterno"));
    bean.setNombre(rs.getString("vch_emplnombre"));
    bean.setCiudad(rs.getString("vch_emplciudad"));
    bean.setDireccion(rs.getString("vch_empldireccion"));
    bean.setUsuario(rs.getString("vch_emplusuario"));
    return bean;
  }
}
