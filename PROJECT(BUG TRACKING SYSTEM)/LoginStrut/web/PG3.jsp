<%-- 
    Document   : PG3
    Created on : Jul 9, 2018, 12:14:20 PM
    Author     : lenovo
--%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import ="java.lang.NullPointerException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Progress Records</h1>
             <%
String id = request.getParameter("userId");
String driverName = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String dbName = "login";
String userId = "root";
String password = "LPU";

try {
Class.forName(driverName);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}

Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<h2 align="center"><font><strong></strong></font></h2>
<table align="center" cellpadding="5" cellspacing="5" >
<tr>

</tr>
<tr bgcolor="#A52A2A">
<td><b>id</b></td>
<td><b> product name</b></td>
<td><b>bug id</b></td>
<td><b>type</b></td>
<td><b>description</b></td>
</tr>

<%
try
{
connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
statement=connection.createStatement();
String sql ="SELECT * FROM submit";

resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>

    
<tr bgcolor="#DEB887">

<td><%=resultSet.getString("product_id") %></td>
<td><%=resultSet.getString("product_name") %></td>
<td><%=resultSet.getString("bug_id") %></td>
<td><%=resultSet.getString("type") %></td>
<td><%=resultSet.getString("description") %></td>



<%
    }
}
    catch(Exception e)
            {
            }
    %>




    </tr>
    
</from>
 
</tr>   
    
    </body>
</html>
