package pe.egcc.eurekaapp.controller;

import java.util.List;
import pe.egcc.eurekaapp.domain.Empleado;
import pe.egcc.eurekaapp.service.espec.EmpleadoServiceEspec;
import pe.egcc.eurekaapp.service.impl.EmpleadoServiceImpl;
import pe.egcc.eurekaapp.util.Eureka;

public class EmpleadoController {

  private EmpleadoServiceEspec service;

  public EmpleadoController() {
    service = new EmpleadoServiceImpl();
  }
  
  public List<Empleado> traerEmpleado(Empleado bean){
    return service.traerVarios(bean);
  }

  public void procesar(String accion, Empleado bean) {
    switch(accion){
      case Eureka.CRUD_NUEVO:
        service.insertar(bean);
        break; 
      case Eureka.CRUD_EDITAR:
        service.actualizar(bean);
        break;
      case Eureka.CRUD_ELIMINAR:
        service.eliminar(bean.getCodigo());
        break;
    }
  }
    
  
  
}
