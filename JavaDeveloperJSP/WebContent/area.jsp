<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Usando PI igual a <%=pi%>, el área del círculo<br>
con un radio de 3 es  <%=area(3)%>
<%!
double area(double r) {
   return r*r*pi;
}
%>
<%! final double pi=3.14159; %>

</body>
</html>