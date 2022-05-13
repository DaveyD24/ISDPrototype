<%-- 
    Document   : main
    Created on : 2 Apr 2022, 2:55:26 pm
    Author     : dtdye
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Main</title>
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
            <li><a href="account.jsp">My Account</a></li>

        </ul>
                <br><br><br><br><br><br>
        <h2><span class="pageheading">IoTBay</span></h2>

        
        <!-- CONTENT STARTS HERE -->
        
        <p>Currently logged in as: user</p>
                    <%
                if (request.getAttribute("username")!= ""){
                out.println("Logged in user: " + request.getAttribute("username") + ". ");
                }
                //session.setAttribute("userinput", request.getParameter("username"));
            
            %>
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
                    <button action="AddToCartServlet" type="button">Add To Cart</button>
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
        
        <button action="CheckoutServlet" type="button">Checkout</button>
        
        
        
        
        
        
        
        
        
        
        <!--
        CONTENT ENDS HERE
        -->
                                 <footer>
            
            <ul class="foot">
                <li class="dontH"><a>Made By Group 31 | 41025 Introduction to Software Development</a></li>
                <li class="dontH"><a>University of Technology Sydney</a></li>
                <li><a href="index.html">Home</a></li>
                <li><a href="login.jsp">Login</a></li>
                <li><a href="register.jsp">Register</a></li>
                <li><a href="logout.jsp">Logout</a></li>
                <li><a href="account.jsp">My Account</a></li>
            </ul>
            
        </footer>
        
    </body>
</html>


<!-- DAVID
//keep track of currently logged in user
//options: browse catalogue (this page), logout

//search bar
//list all products
//for each product: Add to cart, validate: stock doesnt go below 0,
creates new Order()  ^^

Checkout button -> checkout.jsp
-->