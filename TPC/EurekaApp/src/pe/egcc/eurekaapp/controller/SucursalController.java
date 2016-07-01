
        
package pe.egcc.eurekaapp.controller;

import java.util.List;
import pe.egcc.eurekaapp.domain.Sucursal;
import pe.egcc.eurekaapp.service.espec.SucursalServiceEspec;
import pe.egcc.eurekaapp.service.impl.SucursalServiceImpl;


public class SucursalController {
    
    
    private SucursalServiceEspec sucursalService;

  public SucursalController() {
    sucursalService = new SucursalServiceImpl();
  }
  
  public List<Sucursal> traerSucursal(Sucursal bean){
    return sucursalService.traerVarios(bean);
  }
    
    
    
    
    
    
    
    
}
