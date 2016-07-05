package pe.egcc.eurekaapp.prueba;

import pe.egcc.eurekaapp.service.espec.CuentaServiceEspec;
import pe.egcc.eurekaapp.service.impl.CuentaServiceImpl;

public class Prueba01 {
  
  public static void main(String[] args) {
    try {
      CuentaServiceEspec service = new CuentaServiceImpl();
      service.regDeposito("00100001", 100, "0004");
      System.out.println("Proceso ok.");
    } catch (Exception e) {
      System.err.println(e.getMessage());
    }
  }
  
}
