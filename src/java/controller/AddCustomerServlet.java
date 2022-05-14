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
@WebServlet(name="AddCustomerServlet", value="/AddCustomerServlet")
public class AddCustomerServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        HttpSession session = request.getSession();
        Validator validator = new Validator();
        DBManager manager = (DBManager) session.getAttribute("manager");
        
        //int customer_ID = Integer.parseInt(request.getParameter("customer_id").toString());
        String customer_ID = request.getParameter("customer_id");
        String email = request.getParameter("email");
        String first_name = request.getParameter("first_name");
        String last_name = request.getParameter("last_name");
        String password = request.getParameter("password");
        
        String errorMessage = request.getParameter("ACerrorMessage");
        
        Customer customer = null;
        int ID = 0;
        
        if (customer_ID == null || email == null || first_name == null || last_name == null || password == null) {
            errorMessage = "Please fill in all fields";
            request.getRequestDispatcher("AddCustomer.jsp").include(request, response);
        }
        else {
            
            customer = manager.getCustomerByID(customer_ID);
            if (customer != null) {
                errorMessage = "Customer already exists in the database";
                request.getRequestDispatcher("AddCustomer.jsp").include(request, response);
            }
            else {
                ID = Integer.parseInt(customer_ID);
                try {
                    manager.addCustomer(ID, email, first_name, last_name, password);
                } catch (SQLException ex) {
                    Logger.getLogger(AddCustomerServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        
    }





}