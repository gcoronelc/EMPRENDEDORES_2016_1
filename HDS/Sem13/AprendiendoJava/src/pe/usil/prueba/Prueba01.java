
package pe.usil.prueba;

import pe.usil.dto.Producto;

/**
 *
 * @author Gustavo Coronel
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 */
public class Prueba01 {
  
  public static void main(String[] args) {
    
    Producto prod = new Producto();
    prod.setNombre("Televisor");
    prod.setPrecio(10000.0);
    
    System.out.println(prod);    
    
  }
  
}
