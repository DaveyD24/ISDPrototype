<%-- 
    Document   : register
    Created on : 29 Mar 2022, 8:19:17 pm
    Author     : dtdye
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
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
        <h2><span class="pageheading">Register</span></h2>
        
        <!-- CONTENT STARTS HERE -->
        <form class="formxd" method="POST" action="welcome.jsp">
            <label for="email">Email:</label><br>
            <input type="email" id="regEmail" name="regEmail"><br><br>
            <!-- Email Label and Textfield -->
            <label for="firstName">First Name:</label><br>
            <input type="text" pattern="[A-Za-z]{30}" title="Letters Only" id="regFirstName" name="regFirstName"><br><br>
            <!-- First Name Label and Textfield -->
            
            <label for="lastName">Last Name:</label><br>
            <input type="text" pattern="[A-Za-z]{30}" title="Letters Only" id="regLastname" name="regLastName"><br><br>
            <!-- Last Name Label and Textfield -->
           
            <label for="phoneNumber">Phone Number:</label><br>
            <input type="number" maxLength="10" id="regPhoneNumber" name="regPhoneNumber"><br><br>
            <!-- Phone Number Label and Textfield -->
            
            <label for="password">Password:</label><br>
            <input type="password" id="regPassword" name="regPassword"><br><br>
            <label for="password">Confirm Password:</label><br>
            <input type="password" id="regPasswordConfirm" name="regPasswordConfirm"><br><br>
            <!-- Password label and Textfield -->
            

        </form>
         
        
        <!-- CONTENT ENDS HERE -->
       
        <footer>
                    <ul class="foot">
                <li class="dontH"><a>Made By Group 31 | 41025 Introduction to Software Development</a></li>
                <li class="dontH"><a>University of Technology Sydney</a></li>
                <li><a href="index.html">Home</a></li>
                <li class="ActFoot"><a href="login.jsp">Login</a></li>
                <li><a href="register.jsp">Register</a></li>
                <li><a href="logout.jsp">Logout</a></li>
            </ul>
            
        </footer>
        
   
    </body>
</html>

<!-- MARC
//Form
Email, firstname, lastname, password, phone
//send to database as customer
//validation:
email: needs @, letters before and after the @
firstname: only letters
lastname: only letters
phone: 10 digits, only numbers
-->
