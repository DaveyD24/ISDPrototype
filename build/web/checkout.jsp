<%-- 
    Document   : checkout
    Created on : 30 Apr 2022, 9:20:02 pm
    Author     : dtdye
--%>

<%@page import="java.util.HashSet"%>
<%@page import="java.util.Set"%>
<%@page import="product_package.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="style.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Checkout</title>
        <style>
        table {
        border: 1px solid;
        }
        tr {
        height: 50px;
        border: 1px solid;
        padding: 15px;
        }
        th {
        height: 50px;
        border: 1px solid;
        width: 65%;
        padding: 15px;
        background-color: #04AA6D;
        color: white;
        }
        td {
            padding-left: 10px;
        }
        button {
            padding: 10px 15px;
            
        }
        </style>
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
        <h2><span class="pageheading">Checkout</span></h2>
        
        <!-- CONTENT STARTS HERE -->
        
        <%!
        %>
        
        <%
            session.setAttribute("quantity1", "5");
            session.setAttribute("quantity2", "2");
            session.setAttribute("quantity3", "3");
            //Product product = (Product)session.getAttribute("product");
        %>
        
       
        <form action="OrderHistory.jsp" method="post">
            <button type="button"><a href = "OrderHistory.jsp">Order history list</a></button>
            <table class="test">
                <tr>
                    <th>Product</th>
                    <th>Quantity</th>
                    <th>Price</th>
                </tr>
                <tr>
                    <td>item 1</td>
                    <td><input type="text" id ="quantity1" name = "quantity1" value ="<%out.println(session.getAttribute("quantity1").toString());%>" required="true"></td>
                    <td>$25</td>
                </tr>
                <tr>
                    <td>item 2</td>
                    <td><input type="text" id ="quantity2" name = "quantity2" value = "<%out.println(session.getAttribute("quantity2").toString());%>" required="true"></td>
                    <td>$100</td>
                </tr>
                <tr>
                    <td>item 3</td>
                    <td><input type="text" id ="quantity3" name = "quantity3" value = "<%out.println(session.getAttribute("quantity3").toString());%>" required = "true"></td>
                    <td>$5</td>
                </tr>
                <tr>
                    <td></td>
                    <td>Total:</td>
                    <td><label id ="price_label" for="price">...</label></td>
                </tr>
            </table>
        
        <br>
        
        <%
            //Product product = new Product("Google Home", "A google home", "home", 150.0, 20);
            //Product product2 = new Product("Amazon Echo", "A amazon echo", "technology", 210.2, 15);
            //Product product3 = new Product("August DoorBell Cam", "A august doorbell cam", "home", 54.5, 90);
            //session.setAttribute("product", product);
            //session.setAttribute("product2", product2);
            //session.setAttribute("product3", product3);
    
        %>
        
        
        <a href = "index.html">Cancel</a>
        <input type="submit" value="Continue">
        </form>
                    
        
        
        <br><br><br><br>
        
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

<!-- NATHAN
List of products in cart (random hardcoded products for now)
Foreach product: Product name, quantity, price

Total cost of cart

Go To Payment button -> payment.jsp
Return To Main Page button
-->

<!--
The payment page needs to receive the total cost of the cart and the purchased items from this page.

-->