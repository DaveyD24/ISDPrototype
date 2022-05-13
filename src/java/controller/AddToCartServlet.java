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
@WebServlet(name="AddToCartServlet", value="/AddToCartServlet")
public class AddToCartServlet extends HttpServlet{

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

        HttpSession session = request.getSession();
        Validator validator = new Validator();
        String product_name = ;

        DBManager manager = (DBManager) session.getAttribute("manager");

        if (customer != null) {
            session.setAttribute("username", username);
            request.getRequestDispatcher("welcome.jsp").include(request, response);
        }
        else {
            errorMessage = "Invalid Credentials";
        }
        
        Product product = manager.getProductByName(product_name);
        manager.addToCart(product);
        
    }





}