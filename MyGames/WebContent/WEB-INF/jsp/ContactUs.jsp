<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="../css/mystyle.css">
<title>Contact Us</title>
</head>
<body>
<jsp:include page="Header.jsp"/>
<div class="aboutUsIntro">
  <h1>Contact Us</h1>
  <p>Do you want to learn more? Do you want to hear about other opportunities? 
  Reach out to our team with the information below!</p>
  <ul class="companyContact">
     <li>Company Phone: (614) 123-0000</li>
     <li>Company Address: 1739 N High St. Columbus, OH 43210</li>
     <li>Company E-Mail: thegameforyou@gmail.com</li>
  </ul>
</div>

<h2 style="text-align:center">Our Team</h2>
<div class="row">
  <div class="column">
    <div class="card">
      <img src="..images/alex.jpg" alt="Alex" style="width:100%">
      <div class="container">
        <h2>Alexandria Howell</h2>
        <p class="jobTitle">Co-Founder and Game Designer</p>
        <ul class="personalContact">
        	<li>Phone: (614) 987-1427</li>
        	<li>E-Mail: howell.522@osu.edu</li>
        </ul>
      </div>
    </div>
  </div>

  <div class="column">
    <div class="card">
      <img src="../images/test.jpg" alt="Mike" style="width:100%">
      <div class="container">
        <h2>Soumava Banjeree</h2>
        <p class="jobTitle">Co-Founder and Marketing Chair</p>
        <ul class="personalContact">
        	<li>Phone: (614) 619-1245</li>
        	<li>E-Mail: banjeree.180@osu.edu</li>
        </ul>
      </div>
    </div>
  </div>
 </div>

<jsp:include page="Footer.jsp"/>
</body>
</html>