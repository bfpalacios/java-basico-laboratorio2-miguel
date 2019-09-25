<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set scope="session" var="name" value="<b>David</b>"/>
Bienvenido <c:out value="Hola ${sessionScope.name}" 
default="Invitado" escapeXml="false"/>

</body>
</html>