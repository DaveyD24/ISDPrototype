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
    String email;
    String first_name;
    String last_name;
    String gender;
    String DOB;
    String username;
    String password;
    
    
    public Customer(String email, String first_name, String last_name, String gender, String DOB, String username, String password) {
        this.email = email;
        this.first_name = first_name;
        this.last_name = last_name;
        this.gender = gender;
        this.DOB = DOB;
        this.username = username;
        this.password = password;
    }
    
}
