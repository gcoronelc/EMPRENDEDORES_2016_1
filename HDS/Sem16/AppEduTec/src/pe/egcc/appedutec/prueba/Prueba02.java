package pe.egcc.appedutec.prueba;

import java.util.List;
import pe.egcc.appedutec.domain.Profesor;
import pe.egcc.appedutec.service.EdutecService;

/**
 *
 * @author Gustavo Coronel
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 */
public class Prueba02 {
  
  public static void main(String[] args) {
    Profesor bean = new Profesor();
    bean.setApellido("C");
    bean.setNombre("E");
    bean.setVacio();
    EdutecService service = new EdutecService();
    List<Profesor> lista = service.conProfesore(bean);
    for (Profesor p : lista) {
      System.out.println(p.getApellido() + " - " + p.getNombre());
    }
  }
}
