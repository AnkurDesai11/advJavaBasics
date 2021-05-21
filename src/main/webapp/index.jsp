<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>Home Page</title>
	</head>
<body>
	<h1>First Java WebApp using Eclipse and Tomcat</h1>
	<h2><%= new Date().toLocaleString()%></h2>
	<p>Hello world<p>
	<h6><a href="first">1st Servlet</a></h6>
	<h6><a href="second">2nd Servlet using annotation</a></h6>
	<h6><a href="third">3rd Servlet using implement Servlet</a></h6>
	<h6><a href="forth">4th Servlet using extends Generic Servlet</a></h6>
	<h6><a href="fifth">5th Servlet using extends Http Servlet</a></h6>
	<h6><a href="simpleform.html">Post form using servlet</a></h6>
	<h6><a href="urlmodifying.html">Pass info by modifying url</a></h6>
	<h6><a href="hiddenformfield.html">Pass info by hidden form field</a></h6>
	<h6><a href="divisionmodule.html">Division module with error handling</a></h6>
	<h6><a href="mytag.jsp">Custom tag</a></h6>
	<h6><a href="redirect.jsp">Redirection</a></h6>
	<h6><a href="filterexample.html">Filters</a></h6>
	<h6><a href="jstlexample">JSTL examples (removed .jsp from url)</a></h6>
</body>
</html>