package pe.gob.cenepred.modelo;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ClientesListarServlet")
public class ClientesListarServlet extends HttpServlet{
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		Cliente c1 = new Cliente();
		c1.setCodigo(11);
		c1.setNombres("David");
		c1.setPaterno("Rodriguez");
		c1.setMaterno("Condezo");

		Cliente c2 = new Cliente();
		c2.setCodigo(12);
		c2.setNombres("Juan");
		c2.setPaterno("Perez");
		c2.setMaterno("Quispe");

		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		clientes.add(c1);
		clientes.add(c2);

		// Guardando datos en el scope REQUEST
		request.setAttribute("CLIENTES_REGISTRADOS", clientes);

		// Guardando datos en el scope SESSION
		HttpSession session = request.getSession();
		session.setAttribute("CLIENTES_VIP", clientes);

		RequestDispatcher rd = request
				.getRequestDispatcher("clientes_listado.jsp");
		rd.forward(request, response);
	
}

}
