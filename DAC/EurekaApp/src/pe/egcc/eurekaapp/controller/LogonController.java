package pe.egcc.eurekaapp.controller;

import pe.egcc.eurekaapp.service.espec.EmpleadoServiceEspec;
import pe.egcc.eurekaapp.service.impl.EmpleadoServiceImpl;

public class LogonController {

  public void validar(String usuario, String clave){
    EmpleadoServiceEspec service = new EmpleadoServiceImpl();
    service.validar(usuario, clave);
  }

}
