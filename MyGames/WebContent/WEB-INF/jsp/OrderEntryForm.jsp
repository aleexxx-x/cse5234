<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
table, th, td {
	font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
	border: 2px solid black;
	border-collapse: collapse;
}

th, td {
	padding: 15px;
	text-align: left
}

tr:nth-child(odd) {
	background-color: #f2f2f2;
}

tr:hover {
	background-color: #f5f5f5;
}

th {
	padding-top: 12px;
	padding-bottom: 12px;
	text-align: left;
	background-color: #4CAF50;
	color: white;
}

</style>
<meta charset="ISO-8859-1">
<title>Order Entry Form Page</title>

<c:if test="${not empty alert}">
<script>
    alert("Invalid quantity");
</script>
</c:if>
</head>

<body>


	<div align="center">
		<h2>Game Store Order System</h2>
		<form:form modelAttribute="order" method="post" action="submitItems">
			<table style="width: 100%">
				<tr>
					<th>Item</th>
					<th>Price</th>
					<th>Quantity</th>
				</tr>
				<c:forEach items="${inventory.items}" var="item" varStatus="loop">
					<tr>
						<td><form:hidden path="lineItems[${loop.index}].name"
								value="${item.name}" size="60" /></td>
						<td><form:hidden path="lineItems[${loop.index}].price"
								value="${item.price}" /></td>
						<td><form:input path="lineItems[${loop.index}].quantity"
								/></td>
					</tr>
				</c:forEach>
			</table>
			<br />
			<br />
			<div style="font-family: Trebuchet MS; font-size: 25pt;">
				<input type="submit" value="Order">
			</div>
		</form:form>
	</div>
</body>
</html>