<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
	form {
		font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
	}
</style>
<meta charset="ISO-8859-1">
<title>Shipping Entry Form Page</title>
</head>
<h1 align="center">Please provide Shipment Details</h1>
<body>
<div align="center">
<form:form modelAttribute="order" method="post" action="submitShipping">
	  Name: <form:input path="shippingInfo.name" placeholder="John Doe" /> <br /> <br />
	  AddressLine1:	<form:input path="shippingInfo.addressLine1" placeholder="1466 Worthington St." /> <br /> <br />
	  AddressLine2:	<form:input path="shippingInfo.addressLine2" placeholder="Apt. D" /> <br /> <br />
	  City:	<form:input path="shippingInfo.city" placeholder="Columbus" /> <br /> <br />
	  ZipCode: <form:input path="shippingInfo.zipcode" placeholder="12345" pattern="[0-9]{5}"/> <br /> <br />
	  <input type="submit" value="Submit" />      
</form:form>
</div>
</body>
</html>