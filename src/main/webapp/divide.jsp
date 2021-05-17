<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page errorPage="exceptionhandler.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>O/P jsp page</title>
</head>
<body>
	<%
		//fetch numbers
		String dnd = request.getParameter("dividend");
		String dvs = request.getParameter("divisor");
		int dividend = Integer.parseInt(dnd);
		int divisor = Integer.parseInt(dvs);
		int quotient = dividend/divisor;
	%>
	<h2>Quotient : <%= quotient%></h2>
</body>
</html>