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
@WebServlet(name="UpdateCustomerServlet", value="/UpdateCustomerServlet")
public class UpdateCustomerServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        HttpSession session = request.getSession();
        Validator validator = new Validator();
        DBManager manager = (DBManager) session.getAttribute("manager");
        
        //int customer_ID = Integer.parseInt(request.getParameter("customer_id").toString());
        String customer_ID = request.getParameter("customer_id");
        String first_name = request.getParameter("first_name");
        String last_name = request.getParameter("last_name");
        String password = request.getParameter("password");
        
        String errorMessage = request.getParameter("UCerrorMessage");
        
        Customer customer = null;
        
        if (customer_ID == null || first_name == null || last_name == null || password == null) {
            errorMessage = "Please fill in all fields";
            request.getRequestDispatcher("UpdateCustomer.jsp").include(request, response);
        }
        else {
            
            customer = manager.getCustomerByID(customer_ID);
            if (customer == null) {
                errorMessage = "No such customer in the database";
                request.getRequestDispatcher("UpdateCustomer.jsp").include(request, response);
            }
            else {
                manager.updateCustomer(customer_ID, first_name, last_name, password);
                request.getRequestDispatcher("staffmain.jsp").include(request, response);
            }
        }
        
        
    }





}