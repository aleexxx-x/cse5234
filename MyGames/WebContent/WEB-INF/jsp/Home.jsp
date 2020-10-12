<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="<%= request.getContextPath() %>/css/mystyle.css">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<title>Buckeye Games - Home Page</title>
</head>
<body>
<jsp:include page="Header.jsp"/>
<div class="company-info">
<h1>Welcome to Buckeye Games!</h1>
<h2>Mission and Vision</h2>
Buckeye Games is devoted to serving the college demographic with quality 
videography to encourage positive outlets for better mental well being, 
stress relief, community building, and entertainment. 
<h2>Business Strategy</h2>
Buckeye Games will provide the opportunity and resources to allow for video gaming outlets 
around the Ohio State University campus. By the end of 2021, through the global pandemic 
and time spent at home- at least 50% of enrolled students will have the financial and 
physical ability to have access to our games, while still encouraging a profit of 200%. 
<h2>Check out our Products Below!</h2>

</div>
<!-- Page content -->
<div class="w3-content" style="max-width:2000px;margin-top:46px">
  <!-- Automatic Slideshow Images -->
  <div class="mySlides w3-display-container w3-center">
    <img src="<%= request.getContextPath() %>/images/fotnite.jpg" style="width:50%">
    <div class="w3-display-bottommiddle w3-container w3-text-white w3-padding-32 w3-hide-small">
      <h3>Fortnite</h3>
      <p><b>Enjoy online games to the fullest!</b></p>   
    </div>
  </div>
  <div class="mySlides w3-display-container w3-center">
    <img src="<%= request.getContextPath() %>/images/batman.jpg" style="width:50%">
    <div class="w3-display-bottommiddle w3-container w3-text-white w3-padding-32 w3-hide-small">
      <h3>Batman</h3>
      <p><b>High Resolution Games found at affordable prices!</b></p>    
    </div>
  </div>
  <div class="mySlides w3-display-container w3-center">
    <img src="<%= request.getContextPath() %>/images/pubg.jpg" style="width:50%">
    <div class="w3-display-bottommiddle w3-container w3-text-white w3-padding-32 w3-hide-small">
      <h3>PUBG</h3>
      <p><b>Trending games available first hand!</b></p>    
    </div>
  </div>
  <div class="mySlides w3-display-container w3-center">
    <img src="<%= request.getContextPath() %>/images/game_random.jpg" style="width:50%">
    <div class="w3-display-bottommiddle w3-container w3-text-white w3-padding-32 w3-hide-small">
      <h3>Shooting Game</h3>
      <p><b>Order as much as you can!</b></p>    
    </div>
  </div>
</div>
<a href="<%= request.getContextPath() %>/purchase/orderEntry">Start Shopping!</a>
<jsp:include page="Footer.jsp"/>
</body>
</html>