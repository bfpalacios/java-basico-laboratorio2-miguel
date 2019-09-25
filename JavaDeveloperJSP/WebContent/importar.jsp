<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Date fecha = new Date();
String total=fecha.getDate()+"-"+(fecha.getMonth()+1)+"-" + (fecha.getYear()+1900);
%>
<%=total%>

</body>
</html>