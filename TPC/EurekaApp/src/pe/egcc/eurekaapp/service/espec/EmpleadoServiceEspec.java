package pe.egcc.eurekaapp.service.espec;

import pe.egcc.eurekaapp.domain.Empleado;

public interface EmpleadoServiceEspec 
  extends CrudServiceEspec<Empleado>, RowMapper<Empleado>{
  
  Empleado validar(String usuario, String clave);
  
}
