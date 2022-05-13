<%-- 
    Document   : UpdateProduct
    Created on : 30 Apr 2022, 7:40:25 pm
    Author     : dtdye
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="style.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Product</title>
    </head>
    <body>
                <span class="whitestrip"><img src="Images/blurstrip.png" alt="Banner" height=90></span>
        <h1>IoTBay</h1>

        
                                <ul class="Navigation">
            <li><a href="index.html">Home</a></li>
            <li><a href="login.jsp">Login</a></li>
            <li><a href="register.jsp">Register</a></li>
            <li><a href="UpdateCustomer.jsp">Update Customer</a></li>
            <li class="Active"><a href="UpdateProduct.jsp">Update Product</a></li>
            <li><a href="logout.jsp">Logout</a></li>

        </ul>
                <br><br><br><br><br><br>
        <h2><span class="pageheading">Update Product</span></h2>
        
        <!-- CONTENT BODY STARTS HERE -->
        
        
        <!-- LARISSA
<form>
Product id
</form>
        
            int ID;
    String name;
    String description;
    String category;
    int stock;
    boolean available;
    String manufacturer;
    double price;

<form>
display form similar to login to override existing details
validate all boxes (just checking user isnt inputting random shit)
submit button
</form>
-->
        
        
                <form class="updateForm" action="UpdateProductServlet" method="POST">
            <label for="product_id">Enter Product ID:</label>
            <input type="number" id="product_id" name="product_id">
        
        <!-- In the real program, right here we would match the users input to an actual customer in our database-->
        <!-- For now, lets pretend the input is valid -->
        
        

            <label for="product_name">Name: </label>
            <input type="text" id="product_name" name="product_name"><br>
            
            <label for="description">Description</label>
            <input type="text" id="description" name="description" class="fat"><br>
            
            <label for="category">Category: </label>
            <input type="text" id="category" name="category"><br>
            
            <label for="stock">Stock:</label>
            <input type="number" id="stock" name="stock"><br>
            
            <label for="available">Available</label>
            <input type="checkbox" id="available" name="available"><br>
            
            <label for="manufacturer">Manufacturer:</label>
            <input type="text" id="manufacturer" name="manufacturer"><br>
            
            <label for="price">Price:</label>
            <input type="number" id="price" name="price"><br>

            <input type="submit" value="Overwrite" class="btn">
        </form>
        
        <p id="UPerrorMessage" name="UPerrorMessage"></p><br>
        
        
        
        
        
        
        
        <!-- CONTENT BODY ENDS HERE -->
  
         <footer>
            
            <ul class="foot">
                <li class="dontH"><a>Made By Group 31 | 41025 Introduction to Software Development</a></li>
                <li class="dontH"><a>University of Technology Sydney</a></li>
                <li><a href="index.html">Home</a></li>
                <li><a href="login.jsp">Login</a></li>
                <li><a href="register.jsp">Register</a></li>
                <li><a href="UpdateCustomer.jsp">Update Customer</a></li>
                <li class="ActFoot"><a href="UpdateProduct.jsp">Update Product</a></li>
                <li><a href="logout.jsp">Logout</a></li>
            </ul>
            
        </footer>
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    </body>
</html>

<!-- LARISSA
<form>
Product id
</form>

<form>
display form similar to login to override existing details
validate all boxes (just checking user isnt inputting random shit)
submit button
</form>
-->