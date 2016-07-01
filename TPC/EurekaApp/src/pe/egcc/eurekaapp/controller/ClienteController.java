package pe.egcc.eurekaapp.controller;

import java.util.List;
import pe.egcc.eurekaapp.domain.Cliente;
import pe.egcc.eurekaapp.service.espec.ClienteServiceEspec;
import pe.egcc.eurekaapp.service.impl.ClienteServiceImpl;

public class ClienteController {

  private ClienteServiceEspec clienteService;

  public ClienteController() {
    clienteService = new ClienteServiceImpl();
  }
  
  public List<Cliente> traerCliente(Cliente bean){
    return clienteService.traerVarios(bean);
  }
  
  
  
}
