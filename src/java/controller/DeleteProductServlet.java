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
@WebServlet(name="DeleteProductServlet", value="/DeleteProductServlet")
public class DeleteProductServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        HttpSession session = request.getSession();
        Validator validator = new Validator();
        DBManager manager = (DBManager) session.getAttribute("manager");
        
        String errorMessage = request.getParameter("DPerrorMessage");
        
        String product_ID = request.getParameter("product_id");
        Product product = manager.getProductByID(product_ID);
        
        if (product == null) {
            errorMessage = "Product not found in database";
        }
        else {
            manager.removeProduct(product_ID);
            errorMessage = "Product removed from database";
        }
        
        
        
    }





}