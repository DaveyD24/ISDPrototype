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
    
    
    public Customer(int ID, String email, String first_name, String last_name, String gender, String DOB, String username, String password) {
        this.ID = ID;
        this.email = email;
        this.first_name = first_name;
        this.last_name = last_name;
        this.password = password;
    }
    
}
