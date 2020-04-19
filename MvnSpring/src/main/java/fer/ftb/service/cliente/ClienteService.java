package fer.ftb.service.cliente;

import java.util.List;

import fer.ftb.bd.domain.Cliente;

public interface ClienteService {
	List <Cliente> findAllClientes();
	void updateCliente(Cliente cliente);
}
