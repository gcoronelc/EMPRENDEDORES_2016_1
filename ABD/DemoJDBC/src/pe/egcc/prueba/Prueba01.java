package pe.egcc.prueba;

import pe.egcc.domain.Alumno;
import pe.egcc.service.AlumnoService;

public class Prueba01 {

  public static void main(String[] args) {
    try {
      // Dato
      Alumno bean = new Alumno();
      bean.setApellido("Coronel");
      bean.setNombre("Gustavo");
      bean.setDireccion("Lima");
      bean.setTelefono("996664457");
      bean.setEmail("egcc.usil@gmail.com");
      // Proceso
      AlumnoService service = new AlumnoService();
      service.insertar(bean);
      System.out.println("Codigo: " + bean.getId());
    } catch (Exception e) {
      System.err.println(e.getMessage());
    }
  }

}
