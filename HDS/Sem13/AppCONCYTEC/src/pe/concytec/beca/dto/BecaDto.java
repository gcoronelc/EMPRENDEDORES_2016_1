package pe.concytec.beca.dto;

/**
 *
 * @author Gustavo Coronel
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 */
public class BecaDto {

  // Datos
  private String categoria;
  private String producto;
  private int meses;
  // Resultados
  private double importe;
  private double factor;
  private double porcentaje;
  private double valorCuota;

  public BecaDto() {
  }

  public String getCategoria() {
    return categoria;
  }

  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }

  public String getProducto() {
    return producto;
  }

  public void setProducto(String producto) {
    this.producto = producto;
  }

  public int getMeses() {
    return meses;
  }

  public void setMeses(int meses) {
    this.meses = meses;
  }

  public double getImporte() {
    return importe;
  }

  public void setImporte(double importe) {
    this.importe = importe;
  }

  public double getFactor() {
    return factor;
  }

  public void setFactor(double factor) {
    this.factor = factor;
  }

  public double getPorcentaje() {
    return porcentaje;
  }

  public void setPorcentaje(double porcentaje) {
    this.porcentaje = porcentaje;
  }

  public double getValorCuota() {
    return valorCuota;
  }

  public void setValorCuota(double valorCuota) {
    this.valorCuota = valorCuota;
  }

}
