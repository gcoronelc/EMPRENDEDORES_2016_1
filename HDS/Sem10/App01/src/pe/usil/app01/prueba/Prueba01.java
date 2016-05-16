package pe.usil.app01.prueba;

import pe.usil.app01.service.MateService;

/**
 *
 * @author Gustavo Coronel
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 */
public class Prueba01 {

  public static void main(String[] args) {
    MateService service = new MateService();
    System.out.println("7 + 5 = " + service.sumar(7, 5));
    System.out.println("7 * 5 = " + service.multiplicar(7, 5));
  }
  
}
