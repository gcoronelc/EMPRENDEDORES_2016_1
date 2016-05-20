package pe.usil.app02.prueba;

import pe.usil.app02.service.AnalizaService;

/**
 *
 * @author Gustavo Coronel
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 */
public class Prueba01 {
  
  public static void main(String[] args) {
    AnalizaService service = new AnalizaService();
    System.out.println("5 es primo? " + service.esPrimo(5));
    System.out.println("15 es primo? " + service.esPrimo(15));
    System.out.println("29 es primo? " + service.esPrimo(29));
    System.out.println("17 es primo? " + service.esPrimo(17));
  }
}
