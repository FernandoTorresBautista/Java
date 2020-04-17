package fer.ftb.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import fer.ftb.bd.domain.Cliente;
import fer.ftb.bd.mappers.ClienteMapper;

public class ConsultaServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException {
	InputStream inputStream= getServletContext().getResourceAsStream("/WEB-INF/mybatis-config.xml");
	SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	SqlSession sqlSession = sqlSessionFactory.openSession();
	/* 
	 * Ayuda a administrar  el pool de conexiones
	 */
	ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
	/* 
	 * Indicamos que la sesión se trabajara con la interfaz de ClienteMappers.
	 */
	List<Cliente> list = clienteMapper.findAllClientes();
	for (Cliente c : list) {
		System.out.println("Id: " + c.getId());
		System.out.println("Id: " + c.getNombre());
	}
	sqlSession.close();
	}
}
