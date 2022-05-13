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

/**
 *
 * @author dtdye
 */
@WebServlet(name="LoginServlet", value="/LoginServlet")
public class LoginServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

        HttpSession session = request.getSession();
        Validator validator = new Validator();

        String username = request.getParameter("loginUsername");
        String password = request.getParameter("loginPassword");
        String errorMessage = request.getParameter("errorMessage");

        DBManager manager = (DBManager) session.getAttribute("manager");
        Customer customer = manager.findCustomer(username, password);

        if (customer != null) {
            session.setAttribute("username", username);
            session.setAttribute("userID", customer.getID());
            request.getRequestDispatcher("welcome.jsp").include(request, response);
        }
        else {
            errorMessage = "Invalid Credentials";
        }
        
    }





}