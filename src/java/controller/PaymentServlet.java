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
@WebServlet(name="PaymentServlet", value="/PaymentServlet")
public class PaymentServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

        HttpSession session = request.getSession();
        Validator validator = new Validator();
        DBManager manager = (DBManager) session.getAttribute("manager");

        /*
            public int ID;
    public int customer_ID;
    public String name;
    public int card_number;
    public int CVV;
    public String expiry;
    public boolean mastercard;
    public boolean visa;
        */
        
        int ID = manager.getLastPaymentID();
        int customer_ID = manager.getCustomerByName(request.getAttribute("username").toString()).getID();
        String card_name = request.getParameter("cardname");
        int card_number = Integer.parseInt(request.getParameter("cardnumber"));
        String expiry_date = request.getParameter("exp_date");
        int CVV = Integer.parseInt(request.getParameter("cvv"));
        boolean mastercard = false;
        boolean visa = false;
        
        if (request.getParameter("card_type").equals("Visa")) {
            visa = true;
        }
        else {
            mastercard = true;
        }
        
        manager.addPayment(ID + 1, customer_ID, card_name, card_number, CVV, expiry_date, mastercard, visa);
        
        request.getRequestDispatcher("shipping.jsp").include(request, response);
    }





}