
package pe.egcc.eurekaapp.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import pe.egcc.eurekaapp.db.AccesoDB;

import pe.egcc.eurekaapp.domain.Sucursal;
import pe.egcc.eurekaapp.service.espec.SucursalServiceEspec;

public class SucursalServiceImpl   implements SucursalServiceEspec  {

    @Override
    public void insertar(Sucursal bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizar(Sucursal bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Sucursal traerPorCodigo(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Sucursal> traerVarios(Sucursal bean) {
   List<Sucursal> lista = new ArrayList<>();
    Connection cn = null;
    try {
      // Objeto Connection
      cn = AccesoDB.getConnection();
      // La consulta
      String sql = "select chr_sucucodigo,vch_sucunombre, "
              + "vch_sucuciudad,vch_sucudireccion, "
              + "int_sucucontcuenta "     
              + "from dbo.Sucursal  "
              + "where chr_sucucodigo like (? + '%') "
              + "and vch_sucunombre like (? + '%') "
              + "and vch_sucuciudad like (? + '%') "
              + "and vch_sucudireccion like (? + '%') ";
      PreparedStatement pstm = cn.prepareStatement(sql);
      pstm.setString(1, bean.getChr_sucucodigo());
      pstm.setString(2, bean.getVch_sucunombre());
      pstm.setString(3, bean.getVch_sucuciudad());
      pstm.setString(4, bean.getVch_sucudireccion());
      // Ejecutar consulta
      ResultSet rs = pstm.executeQuery();
      // Pasar el resultado a la lista
      while(rs.next()){
        Sucursal r = new Sucursal();
        r.setChr_sucucodigo(rs.getString("chr_sucucodigo"));
        r.setVch_sucunombre(rs.getString("vch_sucunombre"));
        r.setVch_sucuciudad(rs.getString("vch_sucuciudad"));
        r.setVch_sucudireccion(rs.getString("vch_sucudireccion"));
        r.setInt_sucucontcuenta(rs.getString("int_sucucontcuenta"));
        
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
