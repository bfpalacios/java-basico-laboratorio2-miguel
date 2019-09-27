package pe.gob.cenepred.controlador;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ListarPedidosServlet")
public class ListarPedidosServlet extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("Dentro de ListarPedidosServlet");		
			
		RequestDispatcher rd = request.getRequestDispatcher("/pedidos.jsp");
		rd.forward(request, response);
	}

}
