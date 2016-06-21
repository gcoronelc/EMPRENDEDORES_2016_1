package pe.egcc.dto;

public class ProductoDto {

  private String nombre;
  private double precio;
  private int stock;

  public ProductoDto() {
  }

  public ProductoDto(String nombre, double precio, int stock) {
    this.nombre = nombre;
    this.precio = precio;
    this.stock = stock;
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

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

  @Override
  public String toString() {
    return (nombre + " | " + precio + " | " + stock);
  }
  
  

}
