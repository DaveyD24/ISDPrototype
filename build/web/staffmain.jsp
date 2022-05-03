<%-- 
    Document   : staffmain
    Created on : 30 Apr 2022, 7:47:33 pm
    Author     : dtdye
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="style.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MainStaff</title>
    </head>
    <body>
                <span class="whitestrip"><img src="Images/blurstrip.png" alt="Banner" height=90></span>
        <h1>IoTBay</h1>
        
                <ul class="Navigation">
            <li><a href="index.html">Home</a></li>
            <li><a href="login.jsp">Login</a></li>
            <li><a href="register.jsp">Register</a></li>
            <li><a href="UpdateCustomer.jsp">Update Customer</a></li>
            <li><a href="UpdateProduct.jsp">Update Product</a></li>
            <li><a href="logout.jsp">Logout</a></li>

        </ul>
                <br><br><br><br><br><br>
        <h2><span class="pageheading">Staff Main</span></h2>
        
        <!-- CONTENT BODY STARTS HERE -->
        
        
                <p>Currently logged in as: staff</p>
                
                <a href="UpdateProduct.jsp"><button type="button">Update Products</button></a>
                <a href="UpdateCustomer.jsp"><button type="button">Update Customers</button></a><br>
                
        <input type="text" class="Search" placeholder="Search Products.."><br><br>
        
        <table>
            <tr>
                <th>Name</th>
                <th>Price</th>
                <th>Stock</th>
                <th></th>
            </tr>
            <tr>
                <td>Cool product brah</td>
                <td>$129.99</td>
                <td>In Stock</td>
                <td>
                    <button type="button">Add To Cart</button>
                </td>
            </tr>
                        <tr>
                <td>Cool product brah</td>
                <td>$129.99</td>
                <td>In Stock</td>
                <td>
                    <button type="button">Add To Cart</button>
                </td>
            </tr>
                        <tr>
                <td>Cool product brah</td>
                <td>$129.99</td>
                <td>In Stock</td>
                <td>
                    <button type="button">Add To Cart</button>
                </td>
            </tr>
        </table><br>
        
        <a href="checkout.jsp"><button type="button">Checkout</button></a>
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        <!-- CONTENT BODY ENDS HERE -->
  
         <footer>
            
            <ul class="foot">
                <li class="dontH"><a>Made By Group 31 | 41025 Introduction to Software Development</a></li>
                <li class="dontH"><a>University of Technology Sydney</a></li>
                <li><a href="index.html">Home</a></li>
                <li><a href="login.jsp">Login</a></li>
                <li><a href="register.jsp">Register</a></li>
                <li><a href="UpdateCustomer.jsp">Update Customer</a></li>
                <li><a href="UpdateProduct.jsp">Update Product</a></li
                <li><a href="logout.jsp">Logout</a></li>
            </ul>
            
        </footer>
        
        
        
        
        
        
        
        
        
        
        
        
    </body>
</html>

<!-- DAVID
//keep track of currently logged in user
//options: browse catalogue (this page), update products, update customer, update catalogue, logout



//keep track of currently logged in user
//options: browse catalogue (this page), UPDATE CUSTOMER, UPDATE PRODUCTS, logout
//search bar
//list all products
//for each product: Add to cart, validate: stock doesnt go below 0,
creates new Order()  ^^
-->