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
</body>
</html>