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
import model.Payment;
import model.Product;
import model.Shipment;

/* 
* DBManager is the primary DAO class to interact with the database. 
* Complete the existing methods of this classes to perform CRUD operations with the db.
*/

public class DBManager {

private Statement st;
LinkedList<Customer> customers = new LinkedList<Customer>();
LinkedList<Product> products = new LinkedList<Product>();
LinkedList<Product> cart = new LinkedList<Product>();
LinkedList<Payment> payments = new LinkedList<Payment>();
LinkedList<Shipment> shipments = new LinkedList<Shipment>();
   
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
        customers.remove(getCustomerByID(customer_id));
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

public Customer getCustomerByID(int customer_ID) {
    
    Customer customer = null;
    for (Customer c : customers) {
        if (c.getID() == customer_ID){
            customer = c;
            break;
        }
    }
    return customer;
}

public void updateCustomer(String customer_ID, String email, String first_name, String last_name, String password) {
    //st.executeQuery("UPDATE CUSTOMERS " + "")
}

public void addProduct(int product_ID, String name, String description, String category, int stock, boolean available, int price) throws SQLException{
    st.executeUpdate("INSERT INTO PRODUCTS " + "VALUES (ID, name, description, category, stock, avilable,  ,price)");
    Product product = new Product(product_ID, name, description, category, stock, available, "", price);
    products.add(product);
}

public void removeProduct(String product_ID) {
        int product_id = 0;
    try {
        product_id = Integer.parseInt(product_ID);
    }
    catch (Exception e) {
        return;
    }
    
    if (product_id != 0) {
        try {
        st.executeUpdate("DELETE FROM PRODUCTS WHERE PRODUCT_ID = '" + product_id + "';");
        products.remove(getProductByID(product_ID));
        }
        catch (Exception e) {
            return;
        }
    }
}

public void updateProduct(String product_ID, String name, String description, String category, int stock, boolean available, String price) {
    
}

public Product getProductByID(String product_ID) {
    Product product = null;
    int ID = Integer.parseInt(product_ID);
    for (Product p : products) {
        if (p.getID() == ID){
            product = p;
            break;
        }
    }
    return product;
}

public Product getProductByName(String name) {
    Product product = null;
    for (Product p : products) {
        if (p.getName().equals(name)) {
            product = p;
            break;
        }
    }
    
    return product;
}

public int getLastID() {
    //Customer?
    int last_id = 1001;
    for (Customer c : customers) {
        last_id = c.getID();
    }
    
    return last_id;
}

 



public void addToCart(Product product) throws SQLException {
    int ID = product.getID();
    String name = product.getName();
    st.executeUpdate("INSERT INTO CART " + "VALUES (ID, name)");
    
    cart.add(product);
}

public LinkedList<Product> getItemsInCart() {
    LinkedList<Product> cart = new LinkedList<Product>();
    for (Product p : cart) {
        cart.add(p);
    }
    return cart;
}

public int getLastPaymentID() {
    int last_id = 1001;
    for (Payment p : payments) {
        last_id = p.getID();
    }
    
    return last_id;
}



public void addPayment(int payment_ID, int customer_ID, String name, int card_number, int CVV, String expiry, boolean mastercard, boolean visa) throws SQLException{
    st.executeUpdate("INSERT INTO PAYMENTS " + "VALUES (payment_ID, customer_ID, name, card_number, CVV, expiry, mastercard, visa)");
    Payment payment = new Payment(payment_ID, customer_ID, name, card_number, CVV, expiry, mastercard);
    payments.add(payment);
    
    Customer customer = getCustomerByID(customer_ID);
    customer.addPayment(payment);
}

public int getLastShipmentID() {
    int last_id = 1001;
    for (Shipment s : shipments) {
        last_id = s.getID();
    }
    
    return last_id;
}

public void addShipment(int ID, int customer_ID, String name, String address, String city, String state, int zip) {
    
}

public void updateStock() {
    
}

public void clearCart() {
    
}






}
