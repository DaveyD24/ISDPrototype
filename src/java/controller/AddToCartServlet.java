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
@WebServlet(name="AddToCartServlet", value="/AddToCartServlet")
public class AddToCartServlet extends HttpServlet{

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

        HttpSession session = request.getSession();
        Validator validator = new Validator();
        
        String product_name = "";
        //Set this to name of product in table where the button is

        DBManager manager = (DBManager) session.getAttribute("manager");
        
        Product product = manager.getProductByName(product_name);
        try {
            manager.addToCart(product);
        } catch (SQLException ex) {
            Logger.getLogger(AddToCartServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }





}