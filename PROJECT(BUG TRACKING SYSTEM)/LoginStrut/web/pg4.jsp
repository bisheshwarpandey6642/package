<%-- 
    Document   : pg4
    Created on : Jul 9, 2018, 12:26:50 PM
    Author     : lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <style>
.card {
  box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
  max-width: 300px;
  margin: auto;
  text-align: center;
  font-family: arial;
}

.container {
  padding: 0 16px;
}

.container::after {
  content: "";
  clear: both;
  display: table;
}

.title {
  color: grey;
  font-size: 18px;
}

button {
  border: none;
  outline: 0;
  display: inline-block;
  padding: 8px;
  color: white;
  background-color: #000;
  text-align: center;
  cursor: pointer;
  width: 100%;
  font-size: 18px;
}

a {
  text-decoration: none;
  font-size: 22px;
  color: black;
}

button:hover, a:hover {
  opacity: 0.7;
}
</style>
</head>
<body>

<h2 style="text-align:center">E-contact-Card</h2>

<div class="card">
  <img src = "img/BUG.png" height = "120" width = "120">
  <div class="container">
    <h1>Bisheshwar Pandey</h1>
    <p class="title">CEO & Founder, ozho</p>
    <p>Lovely Professional University</p>
    <div style="margin: 24px 0;">
      <a href="#"><i class="fa fa-dribbble"></i></a> 
      <a href="#"><i class="fa fa-twitter"></i></a>  
      <a href="#"><i class="fa fa-linkedin"></i></a>  
      <a href="#"><i class="fa fa-facebook"></i></a> 
   </div>
    <p><button><a href = "https://www.facebook.com/bisheswar.pandey.3">Contact</a><center>CONTACT</center></button></p>
  </div>
</div>
    </body>
</html>
