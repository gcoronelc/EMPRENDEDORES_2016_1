package pe.concytec.beca.service;

import pe.concytec.beca.dto.BecaDto;

/**
 *
 * @author Gustavo Coronel
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 */
public class BecaService {

  public double obtenerImporte(String categoria, 
          String producto){
    double importe = 0.0;
    categoria = categoria.toUpperCase();
    producto = producto.toUpperCase();
    switch(categoria){
      case "ESTUDIOS":
        switch(producto){
          case "PREGRADO":
            importe = 10000.0;
            break;
          case "MAESTRIA":
            importe = 15000.0;
            break;
          case "DOCTORADO":
            importe = 25000.0;
            break;
        }
        break;
      case "TESIS":
        switch(producto){
          case "PREGRADO":
            importe = 5000.0;
            break;
          case "MAESTRIA":
            importe = 8000.0;
            break;
          case "DOCTORADO":
            importe = 12000.0;
            break;
        }
        break;
    }
    return importe;
  }
  
  public double obtenerFactor(int meses){
    double factor = 0.0;
    switch(meses){
      case 6:
        factor = 0.07;
        break;
      case 12:
        factor = 0.12;
        break;
      case 18:
        factor = 0.17;
        break;        
    }
    return factor;
  }

  
  public void procesar(BecaDto dto){
    // Variables
    double importe, factor, porcentaje, valorCuota;
    // Proceso
    importe = obtenerImporte(dto.getCategoria(), dto.getProducto());
    factor = obtenerFactor(dto.getMeses());
    porcentaje = factor * 100;
    valorCuota = importe * ( 1 + factor) / dto.getMeses();
    // Reporte
    dto.setImporte(importe);
    dto.setFactor(factor);
    dto.setPorcentaje(porcentaje);
    dto.setValorCuota(valorCuota);
  }
  
}
