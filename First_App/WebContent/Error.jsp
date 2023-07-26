<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isErrorPage="true" %>
<%@ include file="one.html" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Error Page</title>
</head>
<body>
	<center> 
		<h1> This is an Error </h1> 
		<h4>Exception Occurred: <%= exception %></h4>
	</center>
</body>
</html>