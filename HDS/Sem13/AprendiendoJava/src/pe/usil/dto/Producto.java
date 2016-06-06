package pe.usil.dto;

/**
 *
 * @author Gustavo Coronel
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 */
public class Producto {

  private String nombre;
  private double precio;

  /**
   * Constructor por defecto
   */
  public Producto() {
  }

  /**
   * Constructor con parámetros
   * @param nombre
   * @param precio 
   */
  public Producto(String nombre, double precio) {
    this.nombre = nombre;
    this.precio = precio;
  }


  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  @Override
  public String toString() {
    return nombre + " | " + precio;
  }

}
