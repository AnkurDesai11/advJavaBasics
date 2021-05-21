<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>JSTL Example</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
	<c:set var="i" value="10" scope="application"></c:set><!-- default scope in page-->
	<h1><c:out value="${i}"></c:out></h1>
	
	<%//<c:remove var="i" ></c:remove>--> %>
	
	<c:if test="${i<59}">
		<h1>Yes "i" is less than 59</h1>
	</c:if>
	
	<c:choose>
		<c:when test="${i<0}">
			<h1>i less than 0</h1>
		</c:when>
		<c:when test="${i>0}">
			<h1>i greater than 0</h1>
		</c:when>
		<c:otherwise>
			<h1>i equals 0</h1>
		</c:otherwise>
	</c:choose>
	
	<c:forEach var="j" begin="1" end="${i}">
		<h1>j = <c:out value="${j }"></c:out></h1>
	</c:forEach>
	
	<c:url var="myurl" value="https://www.google.com/search">
		<c:param name="q" value="IJN Yamato"></c:param>
	</c:url>
	<h1><c:out value="${myurl}"></c:out></h1>
	
	<% //<c:redirect url="${myurl}"></c:redirect> %>
	
	<c:set var="name" value="Ankur Desai" scope="application"></c:set>
	<h1><c:out value="${name}"></c:out></h1>
	<h1>Length of Name is <c:out value="${fn:length(name)}"></c:out></h1>
	<h1><c:out value="${fn:toLowerCase(name)}"></c:out></h1>
	<h1><c:out value="${fn:contains(name, 'esa')}"></c:out></h1>
	
	<h1>Registered users are:</h1>
	<sql:setDataSource driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/register" user="register" password="java" var="ds"></sql:setDataSource>
	<sql:query dataSource="${ds }" var="rs">select * from users;</sql:query>
	
	<div class="container">
	<table class="table">
		<tr>
			<td>User ID</td>
			<td>User Name</td>
			<td>User Email</td>
		</tr>
		
		<c:forEach items="${rs.rows }" var="row">
			<tr>
				<td><c:out value="${row.id }"></c:out></td>
				<td><c:out value="${row.name }"></c:out></td>
				<td><c:out value="${row.email }"></c:out></td>
			</tr>
		</c:forEach>
	</table>
	</div>
	
</body>
</html>