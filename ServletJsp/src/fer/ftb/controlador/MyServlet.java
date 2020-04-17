package fer.ftb.controlador;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fer.ftb.modelo.Operacion;

public class MyServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(
			HttpServletRequest req, HttpServletResponse resp
			) throws ServletException, IOException {
		System.out.println("Impresion en servlet");
		String numero1 = req.getParameter("num1");
		String numero2 = req.getParameter("num1");
		
		Operacion operacion = new Operacion();
		int total = operacion.suma(
				Integer.parseInt(numero1),
				Integer.parseInt(numero2)
				);
		req.setAttribute("resultado", total);
		RequestDispatcher rd = req.getRequestDispatcher("resultado.jsp");
		rd.forward(req, resp);
	}
}
