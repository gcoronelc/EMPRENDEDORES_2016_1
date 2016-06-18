package pe.egcc.prueba;

/**
 *
 * @author Gustavo Coronel
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 */
public class Prueba01 {

  public static void main(String[] args) {

    int[] notas;
    notas = new int[5];

    // Recorrido indexado
    for (int i = 0; i < notas.length; i++) {
      int nota = notas[i];
      System.out.println(nota);
    }

    notas[2] = 18;
    System.out.println("-------------");

    // Recorrido tipo coleacción
    for (int nota : notas) {
      System.out.println(nota);
    }

  }

}
