<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="/WEB-INF/tlds/mytaglib.tld" prefix="t" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Custom Tag</title>
</head>
<body>
	<h3>Hello World</h3>
	<t:mytag></t:mytag>
	<hr>
	<t:printTable number="23" color="red"></t:printTable>
	<t:printTable number="34" color="blue"></t:printTable>
</body>
</html>