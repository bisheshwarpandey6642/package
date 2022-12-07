<%-- 
    Document   : S
    Created on : 25 Jun, 2018, 11:35:33 AM
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
        <font color="atul"><h1>Welcome user DAta inserted</h1>
        <% String name=(String)request.getAttribute("msg");
        out.println(name);
        %>
        </font>
    </body>
</html>
