<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
table, th, td {
  font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
  border: 2px solid black;
  border-collapse: collapse;
}
th, td {
  padding: 15px;
  text-align: left
}
tr:nth-child(odd){background-color: #f2f2f2;}
tr:hover {background-color:#f5f5f5;}
th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #4CAF50;
  color: white;
}
</style>
<meta charset="ISO-8859-1">
<title>Order Summary Form</title>
</head>
<body>
	<%@page import="edu.osu.cse5234.model.*"%>
	<%@page import="java.util.*" %>
	<% Order order = (Order) request.getSession().getAttribute("order");	
	   PaymentInfo paymentInfo = (PaymentInfo) request.getSession().getAttribute("payment"); 
	   ShippingInfo shippingInfo = (ShippingInfo) request.getSession().getAttribute("shipping");
	   List<Item> items = order.getItems();
	   request.setAttribute("productList", items);
	   request.setAttribute("paymentInfo", paymentInfo);
	   request.setAttribute("shippingInfo", shippingInfo);
	 %>
<div align="center">
<h2>Order Confirmation</h2>
<form:form modelAttribute="order" method="post" action="confirmOrder">
    <table style="width:100%">
    <tr>
    <th>Item</th>
    <th>Price</th>
    <th>Quantity</th>
    </tr>
	<c:forEach items="${productList}" var="item">
		<tr>
			<td><c:out value="${item.name}" /></td>
			<td><c:out value="${item.price}" /></td>
			<td><c:out value="${item.quantity}" /></td>
		</tr>
	</c:forEach>
	</table>
	<div style="clear:both;height:20px;"></div>
<h2>Payment Confirmation</h2>
    <table style="width:100%">
    <tr>
    <th>CreditCard</th>
    <th>Expiration Date</th>
    <th>CVV</th>
    <th>CardHolderName</th>
    </tr>
		<tr>
			<td><c:out value="${paymentInfo.creditCardNumber}" /></td>
			<td><c:out value="${paymentInfo.expirationDate}" /></td>
			<td><c:out value="${paymentInfo.cvvCode}" /></td>
			<td><c:out value="${paymentInfo.cardHolderName}" /></td>
		</tr>
	</table>  
  	<div style="clear:both;height:20px;"></div>
<h2>Shipment Confirmation</h2>
    <table style="width:100%">
    <tr>
    <th>name</th>
    <th>addressLine1</th>
    <th>addressLine2</th>
    <th>city</th>
    <th>zipCode</th>
  </tr>
		<tr>
			<td><c:out value="${shippingInfo.name}" /></td>
			<td><c:out value="${shippingInfo.addressLine1}" /></td>
			<td><c:out value="${shippingInfo.addressLine2}" /></td>
			<td><c:out value="${shippingInfo.city}" /></td>
			<td><c:out value="${shippingInfo.zipcode}" /></td>
		</tr>
	</table> 
	   	<br /> <br />
		<div style="font-family: Trebuchet MS; font-size: 25pt;"><input type="submit" value="Confirm"></div>
</form:form>
</div>
</body>
</html>