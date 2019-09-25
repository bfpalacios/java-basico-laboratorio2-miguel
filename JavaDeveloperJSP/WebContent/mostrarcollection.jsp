<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Collection<String> c = new ArrayList<String>();
c.add("servlets222 ");
c.add("jsp ");
c.add("beans ");
c.add("tags ");

for(String x : c){ 
	out.print(x);
}
%>

</body>
</html>