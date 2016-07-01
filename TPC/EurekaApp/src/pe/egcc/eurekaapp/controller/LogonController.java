package pe.egcc.eurekaapp.controller;

import pe.egcc.eurekaapp.domain.Empleado;
import pe.egcc.eurekaapp.service.espec.EmpleadoServiceEspec;
import pe.egcc.eurekaapp.service.impl.EmpleadoServiceImpl;
import pe.egcc.eurekaapp.util.Memoria;

public class LogonController {

  public void validar(String usuario, String clave) {
    EmpleadoServiceEspec service = new EmpleadoServiceImpl();
    Empleado bean = service.validar(usuario, clave);
    Memoria.put("usuario", bean);
  }

}
