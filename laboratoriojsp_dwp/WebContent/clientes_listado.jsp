<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Listado de Clientes Registrados</h3>
	<%@page import="java.util.ArrayList, pe.gob.cenepred.modelo.Cliente"%>
	<%
		ArrayList<Cliente> clientes = (ArrayList<Cliente>) request.getAttribute("CLIENTES_REGISTRADOS");
		out.println("<ul>");
		for (Cliente x : clientes) {
			out.println("<li>" + x.getNombreCompleto() + "</li>");
		}
		out.println("</ul>");
	%>

	<h3>Listado de Clientes VIP</h3>

	<%
		ArrayList<Cliente> vip = (ArrayList<Cliente>) session.getAttribute("CLIENTES_VIP");
		out.println("<ul>");
		for (Cliente x : vip) {
			out.println("<li>" + x.getNombreCompleto() + "</li>");
		}
		out.println("</ul>");
	%>

</body>
</html>