<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Header JSP</title>
</head>
<spring:url value="/js/headerJS.js" var="headerJS" />
<spring:url value="/css/headerCSS.js" var="headerCSS" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link href="${headerCSS}" rel="stylesheet" />
<body>
    <!-- Navbar -->
<div class="w3-top">
  <div class="w3-bar w3-black w3-card">
    <a class="w3-bar-item w3-button w3-padding-large w3-hide-medium w3-hide-large w3-right" href="javascript:void(0)" onclick="myFunction()" title="Toggle Navigation Menu"><i class="fa fa-bars"></i></a>
    <a href="home.jsp" class="w3-bar-item w3-button w3-padding-large">HOME</a>
    <a href="aboutUs.jsp" class="w3-bar-item w3-button w3-padding-large w3-hide-small">ABOUT US</a>
    <a href="contactUs.jsp" class="w3-bar-item w3-button w3-padding-large w3-hide-small">CONTACT</a>
<!--     <!div class="w3-dropdown-hover w3-hide-small"> -->
<!--       <button class="w3-padding-large w3-button" title="More">MORE <i class="fa fa-caret-down"></i></button>      -->
<!--       <div class="w3-dropdown-content w3-bar-block w3-card-4"> -->
<!--         <a href="#" class="w3-bar-item w3-button">Merchandise</a> -->
<!--         <a href="#" class="w3-bar-item w3-button">Extras</a> -->
<!--         <a href="#" class="w3-bar-item w3-button">Media</a> -->
<!--       </div> -->
<!--     </div> -->
    <a href="javascript:void(0)" class="w3-padding-large w3-hover-red w3-hide-small w3-right"><i class="fa fa-search"></i></a>
  </div>
</div>
<!-- Navbar on small screens (remove the onclick attribute if you want the navbar to always show on top of the content when clicking on the links) -->
<div id="navDemo" class="w3-bar-block w3-black w3-hide w3-hide-large w3-hide-medium w3-top" style="margin-top:46px">
  <a href="#band" class="w3-bar-item w3-button w3-padding-large" onclick="myFunction()">BAND</a>
  <a href="#tour" class="w3-bar-item w3-button w3-padding-large" onclick="myFunction()">TOUR</a>
  <a href="#contact" class="w3-bar-item w3-button w3-padding-large" onclick="myFunction()">CONTACT</a>
  <a href="#" class="w3-bar-item w3-button w3-padding-large" onclick="myFunction()">MERCH</a>
</div>


</body>
</html>



