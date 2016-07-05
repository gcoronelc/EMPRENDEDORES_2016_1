package pe.egcc.eurekaapp.controller;

import pe.egcc.eurekaapp.domain.Empleado;
import pe.egcc.eurekaapp.service.espec.CuentaServiceEspec;
import pe.egcc.eurekaapp.service.impl.CuentaServiceImpl;
import pe.egcc.eurekaapp.util.Memoria;

public class CuentaController {
  
  private CuentaServiceEspec cuentaService;

  public CuentaController() {
    cuentaService = new CuentaServiceImpl();
  }
  
  public void regDeposito(String cuenta, double importe) {
    Empleado bean = (Empleado) Memoria.get("usuario");
    cuentaService.regDeposito(cuenta, importe, bean.getCodigo());
  }
  
  
}
