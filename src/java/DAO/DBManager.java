/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author dtdye
 */

import model.Customer;
import java.sql.*;
import model.Product;

/* 
* DBManager is the primary DAO class to interact with the database. 
* Complete the existing methods of this classes to perform CRUD operations with the db.
*/

public class DBManager {

private Statement st;
   
public DBManager(Connection conn) throws SQLException {       
   st = conn.createStatement();   
}

//Find user by email and password in the database   
public Customer findUser(String email, String password) throws SQLException {       
   //setup the select sql query string       
   //execute this query using the statement field       
   //add the results to a ResultSet       
   //search the ResultSet for a user using the parameters               
   return null;   
}

//Add a user-data into the database   
public void addUser(String email, String name, String password, String gender, String favcol) throws SQLException {                   //code for add-operation       
  st.executeUpdate("sql query");   

}

//update a user details in the database   
public void updateUser( String email, String name, String password, String gender, String favcol) throws SQLException {       
   //code for update-operation   

}       

//delete a user from the database   
public void deleteUser(String email) throws SQLException{       
   //code for delete-operation   

}

public void addCustomer(int ID, String email, String first_name, String last_name, String password){
    //st.executeUpdate("INSERT INTO Customers " + "VALUES (1001, 'xdd@xdd.com', 'David', 'Dyer', passwordxd)");
}

public void removeCustomer(String product_ID) {
    
}

public void addProduct(String product_ID, String name, String description, String category, int stock, boolean available, String price) {
    
}

public void removeProduct(String product_ID) {
    
}

public Customer findCustomer(String username, String email) {
    return null;
}

public int getLastID() {
    return 0;
}

 
public Product getProductByName(String name) {
    return null;
}

public void addToCart(Product product) {
    
}

public Product[] getItemsInCart() {
    return null;
}

public int getLastPaymentID() {
    return 0;
}

public Customer getCustomerByName(String name) {
    return null;
}

            public int ID;
    public int customer_ID;
    public String name;
    public int card_number;
    public int CVV;
    public String expiry;
    public boolean mastercard;
    public boolean visa;

public void addPayment(int payment_ID, int customer_ID, String name, int card_number, int CVV, String expiry, boolean mastercard, boolean visa) {
    
}

public int getLastShipmentID() {
    return 0;
}

public void addShipment(int ID, int customer_ID, String name, String address, String city, String state, int zip) {
    
}

public void updateStock() {
    
}

public Customer getCustomerByID(String customer_ID) {
    return null;
}

public void updateCustomer(String customer_ID, String email, String first_name, String last_name, String password) {
    
}

public void updateProduct(String product_ID, String name, String description, String category, int stock, boolean available, String price) {
    
}

public Product getProductByID(String product_ID) {
    return null;
}

public void clearCart() {
    
}






}
