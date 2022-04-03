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
    
    int quantity;
    Product[] products;
    String delivery_address;
    
    public Order(int quantity, Product[] products, String delivery_address) {
        this.quantity = quantity;
        this.products = products;
        this.delivery_address = delivery_address;
    }
    
}
