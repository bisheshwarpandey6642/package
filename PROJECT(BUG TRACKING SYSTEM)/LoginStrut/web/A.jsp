<%-- 
    Document   : A.jsp
    Created on : 26 Jun, 2018, 1:27:54 PM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="t" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <t:form action="/log">
            
       
        <jsp:include page="Header.jsp"></jsp:include>
    <center><h1>Register here</h1></center>
    <center><a href="#"><b>BACK</b></a></center>
    <input type="submit" name="t2" value="Login" />
 </t:form>
    </body>
</html>
