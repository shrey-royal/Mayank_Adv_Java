<%@ page import="java.util.Calendar" info="Made by Shrey k" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="one.html" %>

<%@ page errorPage="Error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page Directives</title>
</head>
<body>
	<%=Calendar.getInstance().getTime() %>
	
	<% out.print(12/0); %>
</body>
</html>