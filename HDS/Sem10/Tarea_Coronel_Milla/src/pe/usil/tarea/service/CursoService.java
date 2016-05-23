package pe.usil.tarea.service;

/**
 *
 * @author Gustavo Coronel
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 */
public class CursoService {
  
  public int promPracticas(int n1, int n2, int n3, int n4){
    int suma = n1 + n2 + n3 + n4;
    suma -= obtenerMenor(n1, n2, n3, n4);
    int pr = suma / 3;
    return pr;
  }
  
  public int obtenerMenor(int n1, int n2, int n3, int n4){
    
    
    return -1;
  }
  
  
}
