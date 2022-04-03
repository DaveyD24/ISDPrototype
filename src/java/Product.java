/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dtdye
 */
public class Product {
    
    String name;
    String description;
    String category;
    int quantity;
    boolean available;
    String manufacturer;
    double price;
    
    public Product(String name, String description, String category, int quantity, boolean available, String manufacturer, double price) {
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.available = available;
        this.manufacturer = manufacturer;
        this.price = price;
    }
    
}
