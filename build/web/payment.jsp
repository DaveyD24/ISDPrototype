<%-- 
    Document   : payment
    Created on : 30 Apr 2022, 9:21:48 pm
    Author     : dtdye
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="style.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Payment</title>
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
        <h2><span class="pageheading">Payment</span></h2>
        
        <!-- CONTENT STARTS HERE -->
        <script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script>
        <div class ="paymain">
        <form>
            <div class ="paybox">
                <br>
            <div class ="paymentfull">
          <div class="payment">
                <div class ="cards">
                    <div class="card">
            <label for="fname">Accepted Cards</label>
            <i class='fab fa-cc-mastercard' style='font-size:24px;color:red'></i>
            <i class='fab fa-cc-visa' style='font-size:24px;color:blue'></i>
            <br><br>
            <select class="inputbox" name="card_type" id="card_type" required>
              <option value="">Select</option>
              <option value="Visa">Visa</option>
              <option value="MasterCard">MasterCard</option>
            </select>
            </div>
                </div>
            <div class ="details">
                <div class ="name">
            <label for="cname">Cardholder Name</label>
            <br><br>
            <input type="text" id="cname" name="cardname" placeholder="" maxlength="30" required/>
                </div>
            <div class ="cnum">
            <label for="cnum">Credit Card Number</label>
            <br><br>
            <input type="text" id="ccnum" name="cardnumber" placeholder="" maxlength="12" required/>
            </div>
            <div class ="expdate">
            <label for="expdate">Expiry Date</label>
            <br><br>
            <input type="date" class="inputbox" name="exp_date" id="exp_date">
            </div>
            </div>
              <div class="col">
                <label for="cvv">CVC</label>
                <br><br>
                <input type="text" id="cvv" name="cvv" placeholder="" maxlength="3" required/>
              </div>
            </div>
          </div>

        </div>
            <br>
        <div class="check">
            <div class="check1">
        <label>
          <input type="checkbox" checked="checked" name="sameadr"> Billing address same as shipping?
        </label>
            </div>
         
                <div class="check2">
        <label>
          <input type="checkbox" name="confirm" required> Confirm payment
        </label>
                </div>
            <br>
                    <div class="submit">
                        
        <input type="submit" value="Make payment" class="btn">
            </div>
            </div>
        </div>
</div>
      </form>
        </div>
        <br><br><br><br><br>
        
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


<!-- ANEEKA
<Form>
Radio Button: Visa or mastercard
Name on card
Card No
CVV
Expiry Date
</Form>
Validate the boxes
Button: Confirm -> shipping.jsp
Button: Cancel -> checkout.jsp (back to previous page)
-->