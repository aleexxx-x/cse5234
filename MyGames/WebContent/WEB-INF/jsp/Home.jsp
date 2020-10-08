<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="MyGames/css/mystyle.css">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<title>Home Page</title>
</head>
<body>
<jsp:include page="Header.jsp"/>
<!-- Page content -->
<div class="w3-content" style="max-width:2000px;margin-top:46px">
  <!-- Automatic Slideshow Images -->
  <div class="mySlides w3-display-container w3-center">
    <img src="MyGames/images/fortnite.jpg" style="width:100%">
    <div class="w3-display-bottommiddle w3-container w3-text-white w3-padding-32 w3-hide-small">
      <h3>Fortnite</h3>
      <p><b>Enjoy online games to the fullest!</b></p>   
    </div>
  </div>
  <div class="mySlides w3-display-container w3-center">
    <img src="MyGames/images/batman.jpg" style="width:100%">
    <div class="w3-display-bottommiddle w3-container w3-text-white w3-padding-32 w3-hide-small">
      <h3>Batman</h3>
      <p><b>High Resolution Games found at affordable prices!</b></p>    
    </div>
  </div>
  <div class="mySlides w3-display-container w3-center">
    <img src="MyGames/images/pubg.jpg" style="width:100%">
    <div class="w3-display-bottommiddle w3-container w3-text-white w3-padding-32 w3-hide-small">
      <h3>PUBG</h3>
      <p><b>Trending games available first hand!</b></p>    
    </div>
  </div>
  <div class="mySlides w3-display-container w3-center">
    <img src="MyGames/images/game_random.jpg" style="width:100%">
    <div class="w3-display-bottommiddle w3-container w3-text-white w3-padding-32 w3-hide-small">
      <h3>Shooting Game</h3>
      <p><b>Order as much as you can!</b></p>    
    </div>
  </div>
</div>
<jsp:include page="Footer.jsp"/>
</body>
</html>