
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dtdye
 */
public class Order {
    
    int ID;
    int customer_ID;
    int quantity;
    LinkedList<Product> products;
    String delivery_address;
    
    public Order(int ID, int quantity, Product initial_product, String delivery_address) {
        this.quantity = quantity;
        
        this.products =  new LinkedList<Product>();
        products.add(initial_product);
        
        this.delivery_address = delivery_address;
    }
    
    public int getID() {
        return this.ID;
    }
    
    public void addToOrder(Product product) {
        products.add(product);
    }
    
    
    
    
    
    
    
    
    
}
