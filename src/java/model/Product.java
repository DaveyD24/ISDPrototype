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
public class Product {
    
    public int ID;
    public String name;
    public String description;
    public String category;
    public int stock;
    public boolean available;
    public String manufacturer;
    public double price;
    
    public Product(int ID, String name, String description, String category, int stock, boolean available, String manufacturer, double price) {
        this.name = name;
        this.description = description;
        this.stock = stock;
        this.available = available;
        this.manufacturer = manufacturer;
        this.price = price;
    }
    
    public int getID() {
        return ID;
    }
    
    public String getName() {
        return name;
    }
    
    
    
}
