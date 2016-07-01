package pe.egcc.eurekaapp.service.espec;

import java.util.List;

public interface CrudServiceEspec <T>{

  void insertar(T bean);
  
  void actualizar(T bean);
  
  void eliminar(String codigo);
  
  T traerPorCodigo(String codigo);
  
  List<T> traerVarios(T bean);
  
  
}
