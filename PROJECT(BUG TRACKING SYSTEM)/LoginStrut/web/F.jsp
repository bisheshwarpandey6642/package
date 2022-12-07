<%-- 
    Document   : F
    Created on : 25 Jun, 2018, 11:35:44 AM
    Author     : Atul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login Failed</h1>
        <% String name=(String)request.getAttribute("mssg");
        out.println(name);%>
    </body>
</html>
