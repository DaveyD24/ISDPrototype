/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.DBManager;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
@WebServlet(name="AddProductServlet", value="/AddProductServlet")
public class AddProductServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        HttpSession session = request.getSession();
        Validator validator = new Validator();
        DBManager manager = (DBManager) session.getAttribute("manager");
        
        String errorMessage = request.getParameter("APerrorMessage");
        
        String product_ID = request.getParameter("product_id");
        String name = request.getParameter("product_name");
        String description = request.getParameter("description");
        String category = request.getParameter("category");
        String stock_str = request.getParameter("stock");
        int stock = 0;
        
        int p_ID = 0;
        int pr = 0;
        
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
            request.getRequestDispatcher("AddProduct.jsp");
        }
        else {
            product = manager.getProductByID(product_ID);
            if (product != null) {
                errorMessage = "Product already exists in the database";
                request.getRequestDispatcher("AddProduct.jsp");
            }
            else {
                try {
                    stock = Integer.parseInt(stock_str);
                    p_ID = Integer.parseInt(product_ID);
                    pr = Integer.parseInt(price);
                }
                catch (Exception e) {
                    errorMessage = "Please input fields with correct data";
                    request.getRequestDispatcher("AddProduct.jsp");
                }
                
                try {
                    manager.addProduct(p_ID, name, description, category, stock, available, pr);
                } catch (SQLException ex) {
                    Logger.getLogger(AddProductServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        }
        
        
        
    }





}