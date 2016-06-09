package pe.concytec.beca.prueba;

import pe.concytec.beca.service.BecaService;

/**
 *
 * @author Gustavo Coronel
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 */
public class Prueba01 {
  
  public static void main(String[] args) {
    BecaService service = new BecaService();
    System.out.println("Caso 1: " + service.obtenerImporte("estudios", "pregrado"));
    System.out.println("Caso 2: " + service.obtenerImporte("estudios", "doctorado"));
    System.out.println("Caso 3: " + service.obtenerImporte("tesis", "maestria"));
    System.out.println("Caso 4: " + service.obtenerImporte("tesis", "doctorado"));
  }
}
