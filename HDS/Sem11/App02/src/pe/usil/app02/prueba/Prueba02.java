package pe.usil.app02.prueba;

import pe.usil.app02.service.AnalizaService;

public class Prueba02 {

  public static void main(String[] args) {
    AnalizaService service = new AnalizaService();
    int n = 18;
    System.out.println("Número: " + n );
    System.out.println("Es Par: " +  service.esPar(n));
  }
  
}
