<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Redirect demo</title>
</head>
<body>
	<h3>This is page 2 redirecting back to home page</h3>
	<%
		Thread.sleep(1500);
		response.sendRedirect("index.jsp");
	%>
</body>
</html>