package fer.ftb.bd.mappers;

import java.util.List;

import fer.ftb.bd.domain.Cliente;

public interface ClienteMapper {
	List <Cliente> findAllClientes();
	void updateCliente(Cliente cliente);
}