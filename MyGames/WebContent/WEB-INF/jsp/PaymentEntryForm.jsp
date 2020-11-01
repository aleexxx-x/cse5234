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
<title>Payment Entry Form Page</title>
</head>
<h1 align="center">Please provide Payment Details</h1>
<body>
<div align="center">
<form:form modelAttribute="order" method="post" action="submitPayment">
	  Credit/Debit Card Number: <form:input path="paymentInfo.creditCardNumber" placeholder="1232-4543-6789" pattern="[0-9]{4}-[0-9]{4}-[0-9]{4}" /> <br /> <br />
	  Expiration Date:	<form:input  type="date" path="paymentInfo.expirationDate" placeholder="mm/dd/yyyy" /> <br /> <br />
	  CVV: <form:input path="paymentInfo.cvvCode" placeholder="123" pattern="[0-9]{3}"/> <br /> <br />
	  CardHolderName: <form:input path="paymentInfo.cardHolderName" /> <br /> <br />
	  <input type="submit" value="Submit" />      
</form:form>
</div>
</body>
</html>