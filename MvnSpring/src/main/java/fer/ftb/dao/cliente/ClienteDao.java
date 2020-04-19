package fer.ftb.dao.cliente;

import java.util.List;
import fer.ftb.bd.domain.Cliente;

public interface ClienteDao {
	List<Cliente> findAllClientes();
	void updateCliente(Cliente cliente);
}
