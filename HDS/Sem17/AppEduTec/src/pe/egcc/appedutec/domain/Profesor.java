package pe.egcc.appedutec.domain;

/**
 *
 * @author Gustavo Coronel
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 */
public class Profesor {

  private String codigo;
  private String apellido;
  private String nombre;
  private String direccion;
  private String telefono;
  private String email;
  private String clave;

  public Profesor() {
  }

  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
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
  
  public void setVacio(){
    if(codigo == null) codigo = "";
    if(apellido == null) apellido = "";
    if(nombre == null) nombre = "";
    if(direccion == null) direccion = "";
    if(telefono == null) telefono = "";
    if(email == null) email = "";
    if(clave == null) clave = "";
  }
  
}
