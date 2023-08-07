<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Customer</title>
<style type="text/css">
	table {
		border-collapse: collapse;
	}
</style>
</head>
<body>
	<center>
		<h1>E-Commerce Store</h1>
		<h2>
			<a href="AddCustomer.jsp">Add Customer</a>
			&nbsp;&nbsp;&nbsp;
			<a href="list">List ALL Customers</a>
		</h2>
	</center>
	
	<div align="center">
		<table border="1" cellpadding="5">
			<caption><h2>List Customers</h2></caption>
				<tr>
					<th>Id</th>
					<th>Name</th>
					<th>Email</th>
					<th>Password</th>
					<th>Mobile</th>
					<th>Gender</th>
					<th>Address</th>
					<th>Pincode</th>
					<th>Added Date</th>
					<th>Actions</th>
				</tr>
				<c:forEach var='cust' items="${ customers }">
					<tr>
						<td><c:out value="${ cust.id }"></c:out></td>
						<td><c:out value="${ cust.name }"></c:out></td>
						<td><c:out value="${ cust.email }"></c:out></td>
						<td><c:out value="${ cust.password }"></c:out></td>
						<td><c:out value="${ cust.mobile }"></c:out></td>
						<td><c:out value="${ cust.gender }"></c:out></td>
						<td><c:out value="${ cust.address }"></c:out></td>
						<td><c:out value="${ cust.pincode }"></c:out></td>
						<td><c:out value="${ cust.added_date }"></c:out></td>
						<td>Edit | Delete</td>
					</tr>
				</c:forEach>
		</table>
	</div>
	
</body>
</html>