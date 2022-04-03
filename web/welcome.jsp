<%-- 
    Document   : welcome
    Created on : 29 Mar 2022, 9:40:39 pm
    Author     : dtdye
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome</title>
        <link rel="stylesheet" href="style.css">
    </head>
    <body>
                       <span class="whitestrip"><img src="Images/blurstrip.png" alt="Banner" height=90></span>
        <h1>IoTBay</h1>

        
        <ul class="Navigation">
            <li><a href="index.html">Home</a></li>
            <li><a href="login.jsp">Login</a></li>
            <li><a href="register.jsp">Register</a></li>
            <li><a href="logout.jsp">Logout</a></li>

        </ul>
                <br><br><br><br><br><br>
        <h2><span class="pageheading">Welcome</span></h2>
        
        <p>
            Successfully logged in.<br>
            <%
                if (request.getParameter("username")!= ""){
                out.println("Logged in user: " + request.getParameter("username") + ". ");
                }
                session.setAttribute("userinput", request.getParameter("username"));
            
            %>
            
            
            <br>
            Proceed to <a href="main.jsp">Main Page</a><br>
            
        
        
        
        </p>
        
        
        
        
                         <footer>
            
            <ul class="foot">
                <li class="dontH"><a>Made By Group 31 | 41025 Introduction to Software Development</a></li>
                <li class="dontH"><a>University of Technology Sydney</a></li>
                <li><a href="index.html">Home</a></li>
                <li><a href="login.jsp">Login</a></li>
                <li><a href="register.jsp">Register</a></li>
                <li><a href="logout.jsp">Logout</a></li>
            </ul>
            
        </footer>
        
        
    </body>
</html>
