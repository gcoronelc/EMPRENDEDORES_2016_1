package pe.usil.app02.service;

/**
 *
 * @author alumno
 */
public class AnalizaService {
  
  public boolean esPrimo(int n){
    boolean rpta = true;
    for(int i = 2; i < n; i++){
      if(n % i == 0){
        rpta = false;
        break;
      }
    }
    return rpta;
  }
  
  public boolean esPar(int n){
    boolean rpta;
    if(n % 2 == 0){
      rpta = true;
    } else {
      rpta = false;
    }
    return rpta;
  }
  
  
}
