package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dtdye
 */
public class Customer {
    int ID;
    String email;
    String first_name;
    String last_name;
    String password;
    Log[] logs;
    
    
    public Customer(int ID, String email, String first_name, String last_name, String password) {
        this.ID = ID;
        this.email = email;
        this.first_name = first_name;
        this.last_name = last_name;
        this.password = password;
    }
    
    public int getID() {
        return this.ID;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getFirstName() {
        return this.first_name;
    }
    
    public void setFirstName(String first_name) {
        this.first_name = first_name;
    }
    
    public String getLastName() {
        return this.last_name;
    }
    
    public void setLastName(String last_name) {
        this.last_name = last_name;
    }
    
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    
}