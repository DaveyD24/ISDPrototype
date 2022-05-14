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
@WebServlet(name="ShipmentServlet", value="/ShipmentServlet")
public class ShipmentServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

        HttpSession session = request.getSession();
        Validator validator = new Validator();
        DBManager manager = (DBManager) session.getAttribute("manager");

        /*
            public int ID;
    public int Customer_ID;
    public String first_name;
    public String last_name;
    public String address;
    public String city;
    public String state;
    public int zip;
        */
        
        int ID = manager.getLastShipmentID();
        int customer_ID = manager.getCustomerByName(request.getAttribute("username").toString()).getID();
        String name = request.getParameter("fullName");
        String address = request.getParameter("address");
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        int zip = Integer.parseInt(request.getParameter("postcode").toString());

        try {
            manager.addShipment(ID + 1, customer_ID, name, address, city, state, zip);
        } catch (SQLException ex) {
            Logger.getLogger(ShipmentServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        manager.DecreaseStock();
        
        request.getRequestDispatcher("confirmation.jsp").include(request, response);
    }





}