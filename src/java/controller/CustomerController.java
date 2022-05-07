package controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dtdye
 */

import DAO.DBManager;
import model.Customer;
import java.util.LinkedList;
import javax.servlet.http.HttpSession;

public class CustomerController {
    
    LinkedList<Customer> customers = new LinkedList<Customer>();
    HttpSession session;
    DBManager manager;
    //DBManager manager = session.getAttribute("manager");
    
    public CustomerController(HttpSession session) {
        this.session = session;
    }
    
    public void AddCustomer(int ID, String email, String first_name, String last_name, String password) {
        Customer customer = new Customer(ID, email, first_name, last_name, password);
        customers.add(customer);
        //Add to database
        DBManager manager = (DBManager)session.getAttribute("manager");
        //manager.addCustomer(ID, email, first_name, last_name, password);
    }
    
    public void UpdateCustomer(int ID, String email, String first_name, String last_name, String password) {
        Customer customer_to_update = null;
        
        for (Customer customer : customers) {
            if (customer.getID() == ID) {
                customer_to_update = customer;
                break;
            }
        }
        if (customer_to_update != null) {
            customer_to_update.setEmail(email);
            customer_to_update.setFirstName(first_name);
            customer_to_update.setLastName(last_name);
            customer_to_update.setPassword(password);
        }
        
        //Update in database
        
    }
    
    public void RemoveCustomer(int ID) {
        Customer customer_to_remove = null;
        
        for (Customer customer : customers) {
            if (customer.getID() == ID) {
                customer_to_remove = customer;
            }
        }
        
        if (customer_to_remove != null) {
            customers.remove(customer_to_remove);
            //Remove from database
        }
    }
    
    public void ViewRegistrationDetails(int ID) {
        Customer customer_to_show = null;
        
        for (Customer customer : customers) {
            if (customer.getID() == ID) {
                customer_to_show = customer;
            }
        }
        
        if (customer_to_show != null) {
            System.out.println(customer_to_show.getID());
            System.out.println(customer_to_show.getFirstName());
            System.out.println(customer_to_show.getLastName());
            System.out.println(customer_to_show.getEmail());
        }
    }
    
}


