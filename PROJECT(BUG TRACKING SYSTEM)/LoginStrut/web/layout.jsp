<%-- 
    Document   : layout
    Created on : 26 Jun, 2018, 1:31:04 PM
    Author     : Atul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-tiles" prefix="p" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table width="100%" height ="120%"  background = "img/er.jpg" repeat = "off">
              
            <tr><td height="30"  colspan="3" valign="top">
            <p:insert attribute="HEADER"></p:insert>         
                </td>
            </tr>
            <tr><td width="150" height="400" valign="top">
            <p:insert attribute="MENU"></p:insert>         
                </td>
                <td width="840" valign="top">
            <p:insert attribute="BODY"></p:insert>         
                </td>
            </tr>
            <tr>
            <td height="30" colspan="3" valign="top">
            <p:insert attribute="FOOTER"></p:insert>         
                </td>
            </tr>
        </table>
    </body>
</html>
