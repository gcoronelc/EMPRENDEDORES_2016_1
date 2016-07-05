package pe.egcc.appedutec.prueba;

import java.util.List;
import java.util.Map;
import pe.egcc.appedutec.service.EdutecService;

/**
 *
 * @author Gustavo Coronel
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 */
public class Prueba03 {
  
  public static void main(String[] args) {
    try {
      EdutecService service = new EdutecService();
      List<Map<String,Object>> lista = service.conCursosProg("2016-07");
      for (Map<String, Object> map : lista) {
        System.out.println(map.get("id") + " | " + map.get("idcurso")
            + " | " + map.get("nomcurso"));
      }
    } catch (Exception e) {
    }
  }
}
