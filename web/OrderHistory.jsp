<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="style.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Order History</title>
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
        width: 18%;
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
        <h2><span class="pageheading">Order History</span></h2>
        
        <!-- CONTENT STARTS HERE -->
        
        <table>
                <tr>
                    <th>Order ID</th>
                    <th>Date</th>
                    <th>Products</th>
                    <th>Quantity</th>
                    <th>Delivery Address</th>
                    <th>Total Price</th>
                </tr>
                <tr>
                    <td>1</td>
                    <td>05/05/22</td>
                    <td>Google Home, Alexa</td>
                    <td>5</td>
                    <td>123 Turtle Drive Hippo Avenue NSW Australia</td>
                    <td>$123.45</td>
                </tr>
                <tr>
                    <td>2</td>
                    <td>07/05/22</td>
                    <td>Google Home, Alexa</td>
                    <td>8</td>
                    <td>321 Rabbit Drive Dinosaur Avenue NSW Australia</td>
                    <td>$54.32</td>
                </tr>
                <tr>
                    <td>3</td>
                    <td>10/05/22</td>
                    <td>Google Home, Alexa</td>
                    <td>2</td>
                    <td>45 Lion Drive Suffering Avenue NSW Australia</td>
                    <td>$100.05</td>
                </tr>
                <tr>
                    <td>4</td>
                    <td>12/05/22</td>
                    <td>Google Home, Alexa</td>
                    <td>9</td>
                    <td>7 Rhino Drive Orange Avenue NSW Australia</td>
                    <td>$67.89</td>
                </tr>
        </table>
        <a href = "checkout.jsp">Back</a>
        
        
        
        
        
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