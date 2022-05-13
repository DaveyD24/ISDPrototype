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
@WebServlet(name="DeleteCustomerServlet", value="/DeleteCustomerServlet")
public class DeleteCustomerServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        HttpSession session = request.getSession();
        Validator validator = new Validator();
        DBManager manager = (DBManager) session.getAttribute("manager");
        
        String errorMessage = request.getParameter("DCerrorMessage");
        
        String customer_ID = request.getParameter("customer_id");
        Customer customer = manager.getCustomerByID(customer_ID);
        
        if (customer == null) {
            errorMessage = "Customer not found in database";
        }
        else {
            manager.removeCustomer(customer_ID);
            errorMessage = "Customer removed from database";
        }
        
        
        
    }





}