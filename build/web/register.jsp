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
            <li class="Active"><a href="register.jsp">Register</a></li>
            <li><a href="logout.jsp">Logout</a></li>

        </ul>
                <br><br><br><br><br><br>
        
        
        
        <h2><span class="pageheading">Register</span></h2>
        
        
        <form class="formxd" method="POST" action="welcome.jsp">
            
            <label for="first_name">First Name:</label><br>
            <input type="text" id="first_name" name="first_name"><br>
            
            <label for="last_name">Last Name:</label><br>
            <input type="text" id="last_name" name="last_name"><br><br>
            
            <label for="gender">Gender:</label><br>
            <input type="radio" id="male" name="gender" value="Male">
            <label for="male">Male</label>
            
            <input type="radio" id="female" name="gender" value="Female">
            <label for="female">Female</label><br><br>
            
            <label for="dob">Date of Birth:</label><br>
            
            <select name="date" id="date">
                <option value="01">01</option>
                <option value="02">02</option>
                <option value="03">03</option>
                <option value="04">04</option>
                <option value="05">05</option>
                <option value="06">06</option>
                <option value="07">07</option>
                <option value="08">08</option>
                <option value="09">09</option>
                <option value="10">10</option>
                <option value="11">11</option>
                <option value="12">12</option>
                <option value="13">13</option>
                <option value="14">14</option>
                <option value="15">15</option>
                <option value="16">16</option>
                <option value="17">17</option>
                <option value="18">18</option>
                <option value="19">19</option>
                <option value="20">20</option>
                <option value="21">21</option>
                <option value="22">22</option>
                <option value="23">23</option>
                <option value="24">24</option>
                <option value="25">25</option>
                <option value="26">26</option>
                <option value="27">27</option>
                <option value="28">28</option>
                <option value="29">29</option>
                <option value="30">30</option>
                <option value="31">31</option>
            </select>
            
            <select name="month" id="month">
                <option value="January">January</option>
                <option value="February">February</option>
                <option value="March">March</option>
                <option value="April">April</option>
                <option value="May">May</option>
                <option value="June">June</option>
                <option value="July">July</option>
                <option value="August">August</option>
                <option value="September">September</option>
                <option value="October">October</option>
                <option value="November">November</option>
                <option value="December">December</option>
            </select>
            
            <select name="year" id="year">
                <option value="1999">1999</option>
                <option value="2000">2000</option>
                <option value="2001">2001</option>
                <option value="2002">2002</option>
                <option value="2003">2003</option>
                <option value="2004">2004</option>
                <option value="2005">2005</option>
                <option value="2006">2006</option>
                <option value="2007">2007</option>
                <option value="2008">2008</option>
                <option value="2009">2009</option>
                <option value="2010">2010</option>
                <option value="2011">2011</option>
                <option value="2012">2012</option>
                <option value="2013">2013</option>
                <option value="2014">2014</option>
                <option value="2015">2015</option>
                <option value="2016">2016</option>
                <option value="2017">2017</option>
                <option value="2018">2018</option>
                <option value="2019">2019</option>
                <option value="2020">2020</option>
                <option value="2021">2021</option>
                <option value="2022">2022</option>
            </select>
            
            <br>
            <br>
                   
            <label for="username">Choose a username:</label><br>
            <input type="text" id="username" name="username"><br>
            <label for="password">Enter a password:</label><br>
            <input type="password" id="password" name="password"><br><br>
         
            <input type="submit" value="Submit">
        </form>
        
                         <footer>
            
            <ul class="foot">
                <li class="dontH"><a>Made By Group 31 | 41025 Introduction to Software Development</a></li>
                <li class="dontH"><a>University of Technology Sydney</a></li>
                <li><a href="index.html">Home</a></li>
                <li><a href="login.jsp">Login</a></li>
                <li class="ActFoot"><a href="register.jsp">Register</a></li>
                <li><a href="logout.jsp">Logout</a></li>
            </ul>
            
        </footer>
        
        
        
        
        
    </body>
</html>
