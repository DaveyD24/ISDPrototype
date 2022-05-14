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
import java.util.LinkedList;
import model.Product;

/* 
* DBManager is the primary DAO class to interact with the database. 
* Complete the existing methods of this classes to perform CRUD operations with the db.
*/

public class DBManager {

private Statement st;
LinkedList<Customer> customers = new LinkedList<Customer>();
LinkedList<Product> products = new LinkedList<Product>();
   
public DBManager(Connection conn) throws SQLException {       
   st = conn.createStatement();   
}
/* OLD STUFF
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

}*/

public void addSampleData() {
    
}

public void addCustomer(int ID, String email, String first_name, String last_name, String password) throws SQLException {
    //st.executeUpdate("INSERT INTO Customers " + "VALUES (1001, 'xdd@xdd.com', 'David', 'Dyer', passwordxd)");
    st.executeUpdate("INSERT INTO CUSTOMERS " + "VALUES (ID, email, first_name, last_name, password)");
    Customer customer = new Customer(ID, email, first_name, last_name, password);
    customers.add(customer);
}

public void removeCustomer(String customer_ID) {
    int customer_id = 0;
    try {
        customer_id = Integer.parseInt(customer_ID);
    }
    catch (Exception e) {
        return;
    }
    
    if (customer_id != 0) {
        try {
        st.executeUpdate("DELETE FROM CUSTOMERS WHERE CUSTOMER_ID = '" + customer_id + "';");
        }
        catch (Exception e) {
            return;
        }
    }
}

/* Old?
public Customer findCustomer(String username, String email) {
    return null;
}*/

public Customer getCustomerByName(String name) {
    
    //String[] customers = st.executeUpdate("SELECT * FROM CUSTOMERS WHERE EMAIL = '" + name + "';");
    Customer customer = null;
    for (Customer c : customers) {
        if (c.getEmail().equals(name)) {
            customer = c;
            break;
        }
    }
    
    return customer;
}

public Customer getCustomerByID(String customer_ID) {
    
    Customer customer = null;
    int ID = Integer.parseInt(customer_ID);
    for (Customer c : customers) {
        if (c.getID() == ID){
            customer = c;
            break;
        }
    }
    return customer;
}

public void updateCustomer(String customer_ID, String email, String first_name, String last_name, String password) {
    //st.executeQuery("UPDATE CUSTOMERS " + "")
}

public void addProduct(String product_ID, String name, String description, String category, int stock, boolean available, String price) {
    
}

public void removeProduct(String product_ID) {
    
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



public void addPayment(int payment_ID, int customer_ID, String name, int card_number, int CVV, String expiry, boolean mastercard, boolean visa) {
    
}

public int getLastShipmentID() {
    return 0;
}

public void addShipment(int ID, int customer_ID, String name, String address, String city, String state, int zip) {
    
}

public void updateStock() {
    
}



public void updateProduct(String product_ID, String name, String description, String category, int stock, boolean available, String price) {
    
}

public Product getProductByID(String product_ID) {
    return null;
}

public void clearCart() {
    
}






}
