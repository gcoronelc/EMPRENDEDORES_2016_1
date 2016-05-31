package pe.egcc.pagoapp.service;

import pe.egcc.pagoapp.dto.PagoDto;

/**
 *
 * @author Gustavo Coronel
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 */
public class PagoService {
  
  public void procesar(PagoDto pagoDto){
    // Variables
    double ingresos, renta, neto;
    // Procesos
    ingresos = pagoDto.getHorasDia() * 
            pagoDto.getDias() * pagoDto.getPagoHora();
    if( ingresos > 1500.0){
      renta = ingresos * 0.08;
    } else {
      renta = 0.0;
    }
    neto = ingresos - renta;
    // Salida
    pagoDto.setIngresos(ingresos);
    pagoDto.setRenta(renta);
    pagoDto.setNeto(neto);
  }
  
}
