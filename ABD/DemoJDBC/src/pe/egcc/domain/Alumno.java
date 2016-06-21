package pe.egcc.domain;

public class Alumno {

  private String id;
  private String apellido;
  private String nombre;
  private String direccion;
  private String telefono;
  private String email;
  private String clave;

  public Alumno() {
  }

  public Alumno(String id, String apellido, String nombre, String direccion, String telefono, String email, String clave) {
    this.id = id;
    this.apellido = apellido;
    this.nombre = nombre;
    this.direccion = direccion;
    this.telefono = telefono;
    this.email = email;
    this.clave = clave;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getClave() {
    return clave;
  }

  public void setClave(String clave) {
    this.clave = clave;
  }

}