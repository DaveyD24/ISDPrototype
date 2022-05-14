/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.DBManager;
import java.io.IOException;
import java.util.LinkedList;
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
@WebServlet(name="MainServlet", value="/MainServlet")
public class MainServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

        HttpSession session = request.getSession();
        Validator validator = new Validator();
        DBManager manager = (DBManager) session.getAttribute("manager");
        String errorMessage = request.getParameter("checkoutErrorMessage");
        
        LinkedList<Product> products_in_cart = manager.getItemsInCart();
        
        if (products_in_cart.size() == 0) {
            errorMessage = "Add items to your cart to checkout";
            request.getRequestDispatcher("main.jsp").include(request, response);
        }
        else {
            request.getRequestDispatcher("checkout.jsp").include(request, response);
        }
        
    }





}