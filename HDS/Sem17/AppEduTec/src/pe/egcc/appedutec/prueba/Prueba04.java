package pe.egcc.appedutec.prueba;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Gustavo Coronel
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 */
public class Prueba04 {
  
  public static void main(String[] args) {
    Map<String,Object> r = new HashMap<>();
    
    r.put("nombre", "Gustavo");
    r.put("nombre", "Jorge");
    r.put("alias", "papucho");
    
    
    System.out.println("Nombre: " + r.get("nombre"));
    System.out.println("Alias: " + r.get("alias"));
    
  }
}
