package pe.egcc.pagoapp.prueba;

import pe.egcc.pagoapp.dto.PagoDto;
import pe.egcc.pagoapp.service.PagoService;

/**
 *
 * @author Gustavo Coronel
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 */
public class Prueba01 {
  
  public static void main(String[] args) {
    // Dato
    PagoDto dto = new PagoDto();
    dto.setHorasDia(4);
    dto.setDias(20);
    dto.setPagoHora(140.0);
    // Proceso
    PagoService service = new PagoService();
    service.procesar(dto);
    // Reporte
    System.out.println("Ingresos: " + dto.getIngresos());
    System.out.println("Renta: " + dto.getRenta());
    System.out.println("Neto: " + dto.getNeto());
  }
  
}
