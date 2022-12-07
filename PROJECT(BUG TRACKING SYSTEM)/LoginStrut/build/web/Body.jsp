<%-- 
    Document   : Body
    Created on : 26 Jun, 2018, 1:29:13 PM
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
        
        <table width="100%" >
            <tr><td width="850" height="400" valign="top" align="center">
                    <font color ="red" size ="10"> <% String name=(String)request.getAttribute("msg");
        out.println("welcome :"+name);
        %>
        </font>
                </td>
            </tr>
        </table>
    </body>
</html>
