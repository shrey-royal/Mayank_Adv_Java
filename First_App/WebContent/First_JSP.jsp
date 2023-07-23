<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>First JSP Page</title>
</head>
<body>
	<h2>This is a heading tag</h2>
	<% out.print("This is printed using java source code" + "<br>");
		out.print(Calendar.getInstance().getTime());
	%>
	
	<%
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		
		out.print("<br><br>Name : " + name + "<br>Password: " + password + "<br><br>");
	
	%>
	
	<%= Calendar.getInstance().getTime() %>
	<br>
	<%= name + "<br>" + password %>
	<br>
	<%= "This is printed using expression tag" %>
	<br>
	This is declaration Tag
	<%! int a = 34;
		int c = 56; %>
		<br><br>	
		
		
		
</body>
</html>