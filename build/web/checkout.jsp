<%-- 
    Document   : checkout
    Created on : 30 Apr 2022, 9:20:02 pm
    Author     : dtdye
--%>

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
            <li><a href="account.jsp">My Account</a></li>

        </ul>
                <br><br><br><br><br><br>
        <h2><span class="pageheading">Checkout</span></h2>
        
        <!-- CONTENT STARTS HERE -->
            <table class="test">
                <tr>
                    <th>Product</th>
                    <th>Quantity</th>
                    <th>Price</th>
                </tr>
                <tr>
                    <td>item 1</td>
                    <td>2</td>
                    <td>$25</td>
                </tr>
                <tr>
                    <td>item 2</td>
                    <td>1</td>
                    <td>$100</td>
                </tr>
                <tr>
                    <td>item 3</td>
                    <td>3</td>
                    <td>$5</td>
                </tr>
                <tr>
                    <td></td>
                    <td>Total:</td>
                    <td>$165</td>
                </tr>
            </table>
        
        <br>
        
        <a href = "main.jsp"><button type="button">Cancel</button></a>
        <a href = "payment.jsp"><button type="button">Buy Now</button></a>
        
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
                <li><a href="account.jsp">My Account</a></li>
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