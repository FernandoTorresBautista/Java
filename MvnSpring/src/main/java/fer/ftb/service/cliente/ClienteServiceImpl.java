package fer.ftb.service.cliente;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import fer.ftb.bd.domain.Cliente;
import fer.ftb.dao.cliente.ClienteDao;

@Named
public class ClienteServiceImpl implements ClienteService{
	
	@Inject
	ClienteDao clienteDao;
	
	@Override
	public List<Cliente> findAllClientes() {
		return clienteDao.findAllClientes();
	}

	@Override
	public void updateCliente(Cliente cliente) {
		clienteDao.updateCliente(cliente);
	}
	
}
