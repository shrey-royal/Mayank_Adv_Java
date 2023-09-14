<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List All Cars</title>
<style type="text/css">
	table {
		border-collapse: collapse;
	}
</style>
</head>
<body>
	<center>
		<h1>Car Showroom</h1>
		<h2>
			<a href="InsertCar.html">Insert Car</a>
			&nbsp;&nbsp;&nbsp;
			<a href="listall">List All Cars</a>
		</h2>
	</center>
	
	<div align="center">
		<table border="1" cellpadding="5">
			<caption><h2>List Of Cars</h2></caption>
			<tr>
				<th>Id</th>
				<th>Make</th>
				<th>Model</th>
				<th>Year</th>
				<th>Price</th>
				<th>Actions</th>
			</tr>
			
			<c:forEach var="car" items="${ cars }">
				<tr>
					<td><c:out value="${car.id }"/></td>
					<td><c:out value="${car.make }"/></td>
					<td><c:out value="${car.model }"/></td>
					<td><c:out value="${car.year }"/></td>
					<td><c:out value="${car.price }"/></td>
					<td>
						<a href="edit?id=<c:out value='${car.id}'/>">Edit</a>
						&nbsp;&nbsp;<b>|</b>&nbsp;&nbsp;
						<a href="delete?id=<c:out value='${car.id}'/>">Delete</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
	
</body>
</html>