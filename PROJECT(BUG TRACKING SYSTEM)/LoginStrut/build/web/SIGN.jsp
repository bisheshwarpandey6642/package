<%-- 
    Document   : SIGN
    Created on : Jul 8, 2018, 12:38:16 PM
    Author     : lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html><style>
/* Full-width input fields */
input[type=text], input[type=password] {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
}

/* Set a style for all buttons */
button {
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 100%;
}

/* Extra styles for the cancel button */
.cancelbtn {
    padding: 14px 20px;
    background-color: #f44336;
}

/* Float cancel and signup buttons and add an equal width */
.cancelbtn,.signupbtn {
    float: left;
    width: 50%;
}

/* Add padding to container elements */
.container {
    padding: 16px;
}

/* Clear floats */
.clearfix::after {
    content: "";
    clear: both;
    display: table;
}


    

</style>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <h2>Signup For Free</h2>

<form action="s1" method = "get" style="border:1px solid #ccc">
  <div class="container">
    <label><b>Name</b></label>
    <input type="text" placeholder=" Full Name" name="m1" required>
     
    <label><b>Contact</b></label>
    <input type="text" placeholder="Mobile Number" name="m2" required>
    
 <label><b>Project Name</b></label>
    <input type="text" placeholder="Project Name" name="m3" required>
    
     <label><b>Email id</b></label>
    <input type="text" placeholder="Enter mailId" name="m4" required>
    
     <label><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="m5" required>
    
    <label><b>Repeat Password</b></label>
    <input type="password" placeholder="Repeat Password" name="m6" required>
    <input type="checkbox" checked="checked"> Remember me
    <p>By creating an account you agree to our <a href="#">Terms & Privacy</a>.</p>

    <div class="clearfix">
      <button type="button" class="cancelbtn">Cancel</button>
      <button type="submit" class="signupbtn">Sign Up</button>
    </div>
  </div>
</form>

    </body>
</html>
