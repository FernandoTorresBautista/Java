package fer.ftb.dao.cliente;

import java.util.List;

import javax.inject.Named;
import org.apache.ibatis.session.SqlSession;
import fer.ftb.bd.domain.Cliente;
import fer.ftb.bd.mappers.ClienteMapper;
import fer.ftb.bd.util.MyBatisSqlSessionFactorySingleton;

@Named
public class ClienteDaoImpl implements ClienteDao {
	@Override
	public List<Cliente> findAllClientes() {
		List<Cliente> list = null;
		SqlSession sqlSession = MyBatisSqlSessionFactorySingleton.openSession();
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			list = clienteMapper.findAllClientes();
			/*for (Cliente c : list) {
				System.out.println("Id: " + c.getId());
				System.out.println("Nombre" + c.getNombre());
			}*/
		} finally {
			sqlSession.close();
		}
		return list;
	}

	@Override
	public void updateCliente(Cliente cliente) {
		SqlSession sqlSession = MyBatisSqlSessionFactorySingleton.openSession();
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			clienteMapper.updateCliente(cliente);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}
}
