<%-- 
    Document   : UpdateCustomer
    Created on : 30 Apr 2022, 7:39:53 pm
    Author     : dtdye
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="style.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Customer</title>
    </head>
    <body>
                <span class="whitestrip"><img src="Images/blurstrip.png" alt="Banner" height=90></span>
        <h1>IoTBay</h1>
        
        
                        <ul class="Navigation">
            <li><a href="index.html">Home</a></li>
            <li><a href="login.jsp">Login</a></li>
            <li><a href="register.jsp">Register</a></li>
            <li class="Active"><a href="UpdateCustomer.jsp">Update Customer</a></li>
            <li><a href="UpdateProduct.jsp">Update Product</a></li>
            <li><a href="logout.jsp">Logout</a></li>

        </ul>
                <br><br><br><br><br><br>
        <h2><span class="pageheading">Add Customer</span></h2>
        
        <!-- CONTENT BODY STARTS HERE -->
        
        <!-- LARISSA
<form>
Customer id
</form>

<form>
display form similar to login to override existing details
validate all boxes (just checking user isnt inputting random shit)
submit button
</form>-->
        
        
        <form class="updateForm" method="POST" action="AddCustomerServlet">
            
            <label for="customer_id">Enter Customer ID:</label>
            <input type="number" id="customer_id" name="customer_id">

        <!-- In the real program, right here we would match the users input to an actual customer in our database-->
        <!-- For now, lets pretend the input is valid -->

                    <label for="email">Email: </label>
            <input type="email" id="email" name="email"><br>
        
            <label for="first_name">First Name: </label>
            <input type="text" id="first_name" name="first_name"><br>
            
            <label for="last_name">Last Name: </label>
            <input type="text" id="last_name" name="last_name"><br>
            
            <label for="password">Password: </label>
            <input type="password" id="password" name="password"><br>
            
            <label for="log">Keep existing logs?</label>
            <input type="checkbox" id="log" name="log"><br><br>
            
            <input type="submit" value="Add" class="btn">
        </form>
        
        <p id="UCerrorMessage" name="ACerrorMessage"></p><br>
        
        
        
        <!-- CONTENT BODY ENDS HERE -->
  
         <footer>
            
            <ul class="foot">
                <li class="dontH"><a>Made By Group 31 | 41025 Introduction to Software Development</a></li>
                <li class="dontH"><a>University of Technology Sydney</a></li>
                <li><a href="index.html">Home</a></li>
                <li><a href="login.jsp">Login</a></li>
                <li><a href="register.jsp">Register</a></li>
                <li class="ActFoot"><a href="UpdateCustomer.jsp">Update Customer</a></li>
                <li><a href="UpdateProduct.jsp">Update Product</a></li>
                <li><a href="logout.jsp">Logout</a></li>
            </ul>
            
        </footer>
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    </body>
</html>


<!-- LARISSA
<form>
Customer id
</form>

<form>
display form similar to login to override existing details
validate all boxes (just checking user isnt inputting random shit)
submit button
</form>
-->