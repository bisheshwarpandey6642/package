<%-- 
    Document   : menu
    Created on : 26 Jun, 2018, 2:15:48 PM
    Author     : Atul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="p"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       
      
        <div id = "nav_wrapper">
        <table width="100%" >
            <tr><td width="20%" height="400" valign="top"> <br><br><br><br><br>
                    <p:link action="/log">Refresh</p:link><br><br>
            <p:link action="/log1">About Us</p:link><br><br>
            <p:link action="/log2">Report</p:link><br><br>
            <p:link action="/log3">Status</p:link><br><br>
            <p:link action="/log4">Contribution</p:link><br><br>
                </td>
        
            </tr>
        </table>
        </div>
    </body>
</html>
