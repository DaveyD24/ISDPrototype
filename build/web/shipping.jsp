<%-- 
    Document   : shipping
    Created on : 30 Apr 2022, 9:20:12 pm
    Author     : dtdye
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="style.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shipping</title>
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
        <h2><span class="pageheading">Shipping</span></h2>
        
        <!-- CONTENT STARTS HERE -->
        
        
        
        
        
        
        
        
        
        
        
        
        
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

<title>Shipment</title>
<body>



<form action="ShipmentServlet" method="post">
    <h2>Enter Shipping Details</h2>
     <label for="fullName" class="label" >Full Name</label><br>
    <input type="text" class="form" placeholder="John Doe"required accept="text/plain" tile="Please enter your name"><br>

<label for="address" >Shipping Address</label><br>
    <input type="text" class="form" name="address" placeholder="5 Magnolia Drive,Kingsway West"required><br>
    
    <label for="postcode">Postcode</label><br>
    <input type="text" name="postcode" pattern="[0-9]{4}" placeholder="2208"required ><br>
    
    <label for="city">City</label><br>
    <input type="text" name="city" placeholder="Sydney"><br>
    
    <label for="state">State</label><br>
    <select id="state" name="state" placeholder="New South Wales"required>
    <option value="New South Wales">NSW</option>
    <option value="Queensland">QLD</option>
    <option value="Victoria">VIC</option>
    <option value="Tasmania">TAS</option>
    <option value="South Australia">SA</option>
    <option value="Northern Territory">NT</option>
    <option value="Western Australia">WA</option>
        
    </select><br>

   <label for="shippingDate" class="form">Shipping Date</label><br>
    <input type="date" name="shippingDate" value="03/05/2022" min="04/05/2022" max="05/05/2023"required><br>
    
    <label for="contactNumber" class="form">Contact Number</label><br>
    <input type="tel" name="contactNumber" pattern="[0-9]{9}" placeholder="+61 426-XXX-XXX"required><br>
    
    <input type="checkbox" >Save as default shipping detail<br>
    <!--<input type="submit" value="Proceed to Checkout" rel="www.google.com"><br>-->
    </form>
    
     <input type="submit" value="Make payment" class="btn">
    
    </body>
    </head>
    
    <a href="payment.jsp"><button>Back</button></a>
    <button action="CancelOrderServlet">Cancel Order</button>
<!-- SUB
<Form>
First Name*
Last Name*
Street Address*
Address Line 2
City*
State*
Zip Code*
</Form>
"Use different billing address" checkbox
if (checkbox ticked) -> copy same form for billing address
Button: Submit -> nothing for now
Button: Cancel -> payment.jsp (return to previous page)
-->