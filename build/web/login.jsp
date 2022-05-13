<%-- 
    Document   : login
    Created on : 29 Mar 2022, 7:51:34 pm
    Author     : dtdye
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link rel="stylesheet" href="style.css">
    </head>
    <body>
                <span class="whitestrip"><img src="Images/blurstrip.png" alt="Banner" height=90></span>
        <h1>IoTBay</h1>

        
        <ul class="Navigation">
            <li><a href="index.html">Home</a></li>
            <li class="Active"><a href="login.jsp">Login</a></li>
            <li><a href="register.jsp">Register</a></li>
            <!--<li><a href="logout.jsp">Logout</a></li>-->

        </ul>
                <br><br><br><br><br><br>
        <h2><span class="pageheading">Login</span></h2>
        
            <!-- CONTENT STARTS -->
            <form class="formxd" method="POST" action="LoginServlet">
                <label for="username"> Username:</label><br>
                <input type="text" id="loginUsername" name="loginUsername"><br><br>
                
                <!-- Username Label and Textfield -->
                <label for="password">Password:</label><br>
                <input type="password" id="loginPassword" name="loginPassword"><br><br>
                <!-- Password Label and Textfield -->
                <input type="submit" value="Submit">
                <!-- Submit button -->    
            </form>
            
            <p id="errorMessage"></p>
            
            <!--<button onclick="onLogin()">Login</button>-->
            
            <!-- CONTENT ENDS -->
        
         
                 <footer>
            
            <ul class="foot">
                <li class="dontH"><a>Made By Group 31 | 41025 Introduction to Software Development</a></li>
                <li class="dontH"><a>University of Technology Sydney</a></li>
                <li><a href="index.html">Home</a></li>
                <li class="ActFoot"><a href="login.jsp">Login</a></li>
                <li><a href="register.jsp">Register</a></li>
                <!--<li><a href="logout.jsp">Logout</a></li>-->
            </ul>
            
        </footer>
         
            
            <script>
                
                function onLogin() {
                    window.location.href = "main.jsp";
                }
                
                
            </script>
            
            
         
         
    </body>
</html>

<!-- MARC
//form
//username(email), password
//validate boxes
//if (customer) -> go to customermain
if (staff) -> go to staffmain'
for now, just check for hardcoded values (if user inputs customer@gmail.com go to customer etc)
-->