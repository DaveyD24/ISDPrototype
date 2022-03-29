<%-- 
    Document   : login
    Created on : 29 Mar 2022, 7:51:34 pm
    Author     : dtdye
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>login</title>
    </head>
    <body>
        <h1>This is Login!</h1>
        
        <form>
            
            <label for="username">Username:</label><br>
            <input type="text" id="username" name="username"><br>
            
            <label for="password">Password</label><br>
            <input type="text" id="password" name="password"><br><br>
            
            <input type="submit" value="Submit">
            
        </form>

         <h5>Don't have an account? Just <a href="register.jsp">Register</a></h5>
        
    </body>
</html>
