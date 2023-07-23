<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>File1</title>
</head>
<body>
	<%
		request.getRequestDispatcher("File2.jsp").forward(request, response);
	%>
</body>
</html>