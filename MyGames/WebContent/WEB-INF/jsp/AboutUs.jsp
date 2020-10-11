<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="../css/mystyle.css">
<title>About Us</title>
</head>
<body>
<jsp:include page="Header.jsp"/>
<div class="aboutUsIntro">
  <h1>About Us</h1>
  <p>Our team is devoted and passionate about supplying you with the best games possible, 
  check out below to learn more about our back stories!</p>
</div>

<h2 style="text-align:center">Our Team</h2>
<div class="row">
  <div class="column">
    <div class="card">
      <img src="<%= request.getContextPath() %>/images/alex.jpg" alt="Alex" style="width:100%">
      <div class="container">
        <h2>Alexandria Howell</h2>
        <p class="jobTitle">Co-Founder and Game Designer</p>
        <p class="education">B.S. in Computer Science and Engineering from the Ohio State University, class of 2021</p>
        <ul class="experience">
        	<li>Project Management IT Intern at MTDProducts Co.</li>
        	<li>Software Engineer Intern at JPMorgan Chase &amp; Co.</li>
        	<li>Software Engineer at JPMorgan Chase &amp; Co.</li>
        </ul>
      </div>
    </div>
  </div>

  <div class="column">
    <div class="card">
      <img src="/images/test.jpg" alt="Soumava" style="width:100%">
      <div class="container">
        <h2>Soumava Banjeree</h2>
        <p class="jobTitle">Co-Founder and Marketing Chair</p>
        <p class="education">M.S. in Computer Science and Engineering from the Ohio State University, class of 2021</p>
        <ul class="experience">
        	<li>Machine Learning Intern at Astute Solutions</li>
        	<li>Analyst at Goldman Sachs &amp; Co.</li>
        	<li>Summer Analyst at Goldman Sachs &amp; Co.</li>
        </ul>
      </div>
    </div>
  </div>
 </div>

<jsp:include page="Footer.jsp"/>
</html>