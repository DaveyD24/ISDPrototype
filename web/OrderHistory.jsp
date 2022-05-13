<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="style.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Order History</title>
    </head>
    
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
        
        <%=request.getParameter("quantity1")%>
        <%=request.getParameter("quantity2")%>
        <%=request.getParameter("quantity3")%>
        <% 
            int total1 = Integer.parseInt(request.getParameter("quantity1").toString());
            int total2 = Integer.parseInt(request.getParameter("quantity2").toString());
            int total3 = Integer.parseInt(request.getParameter("quantity3").toString());
            int final_total = total1 + total2 + total3;
            out.println(final_total);
        %>
                
        
        
        
        
        
        
        
        
        
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
        
           
    
</html>