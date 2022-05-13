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

/**
 *
 * @author dtdye
 */
@WebServlet(name="RegisterServlet", value="/RegisterServlet")
public class RegisterServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

        HttpSession session = request.getSession();
        Validator validator = new Validator();

        String email = request.getParameter("regEmail");
        String firstName = request.getParameter("regFirstName");
        String lastName = request.getParameter("regLastName");
        String phone = request.getParameter("regPhone");
        String password = request.getParameter("regPassword");
        
        DBManager manager = (DBManager) session.getAttribute("manager");;
        
        int lastID = manager.getLastID();
        
        try {
            manager.addCustomer(lastID + 1, email, firstName, lastName, password);
        } catch (SQLException ex) {
            Logger.getLogger(RegisterServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        request.getRequestDispatcher("login.jsp").include(request, response);
    }





}