/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.DBManager;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Customer;
import model.Product;

/**
 *
 * @author dtdye
 */
@WebServlet(name="UpdateProductServlet", value="/UpdateCustomerServlet")
public class UpdateProductServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        HttpSession session = request.getSession();
        Validator validator = new Validator();
        DBManager manager = (DBManager) session.getAttribute("manager");
        
        /*
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
        */
        
        String errorMessage = request.getParameter("UPerrorMessage");
        
        String product_ID = request.getParameter("product_id");
        String name = request.getParameter("product_name");
        String description = request.getParameter("description");
        String category = request.getParameter("category");
        String stock_str = request.getParameter("stock");
        int stock;
        
        String available_str = request.getParameter("available");
        boolean available;
        if (available_str.equals("on")) {
            available = true;
        }
        else {
            available = false;
        }
        
        String price = request.getParameter("price");
        
        Product product = null;
        
        if (product_ID == null || name == null || description == null || category == null || stock_str == null || price == null) {
            errorMessage = "Please fill in all fields";
            request.getRequestDispatcher("UpdateProduct.jsp");
        }
        else {
            product = manager.getProductByID(product_ID);
            if (product == null) {
                errorMessage = "No such product in the database";
                request.getRequestDispatcher("UpdateProduct.jsp");
            }
            else {
                try {
                    stock = Integer.parseInt(stock_str);
                }
                catch (Exception e) {
                    errorMessage = "Please input fields with correct data";
                    request.getRequestDispatcher("UpdateProduct.jsp");
                }
                
                manager.updateProduct(product_ID, name, description, category, stock, available, price);
                
            }
        }
        
        
        
    }





}