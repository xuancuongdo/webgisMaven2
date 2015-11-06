<%-- 
    Document   : login
    Created on : Nov 2, 2015, 10:37:54 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login Form</h1>
        <form action="User" method="post">
            <label for="txtUserName">User Name</label>
            <input type="text" id="txtUserName" name="txtUserName" value="">
            <label for="txtPassword" >Password</label>
            <input type="password" id="txtPassword" name="txtPassword">
            <input type="submit" name="btnSubmit" id="btnSubmit" value="OK">
        </form>
    </body>
</html>
