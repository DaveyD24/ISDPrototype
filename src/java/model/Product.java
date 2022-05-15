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
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getCategory() {
        return this.category;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }
    
    public int getStock() {
        return stock;
    }
    
    public void setStock(int amount) {
        stock = amount;
    }
    
    public String getManufacturer() {
        return this.manufacturer;
    }
    
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    
    public boolean getAvailability() {
        return this.available;
    }
    
    public void setAvailable() {
        available = true;
    }
    
    public void setUnavailable() {
        available = false;
    }
    
    public double getPrice() {
        return this.price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    
}
