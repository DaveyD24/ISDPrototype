package controller;


import model.Product;
import java.beans.Statement;
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
public class ProductController {
    
    LinkedList<Product> products = new LinkedList<Product>();
    
    public void AddProduct(int ID, String name, String description, String category, int stock, boolean available, String manufacturer, double price) {
        Product product = new Product(ID, name, description, category, stock, available, manufacturer, price);
        products.add(product);
        //Add to database
    }
    
    public void UpdateProduct(int ID, String name, String description, String category, int stock, boolean available, String manufacturer, double price) {
        Product product_to_update = null;
        
        for (Product product : products) {
            if (product.ID == ID) {
                product_to_update = product;
            }
        }
        
        if (product_to_update != null) {
            product_to_update.name = name;
            product_to_update.description = description;
            product_to_update.category = category;
            product_to_update.stock = stock;
            product_to_update.available = available;
            product_to_update.manufacturer = manufacturer;
            product_to_update.price = price;
            //Update in database
        }
        
    }
    
    public void RemoveProduct(int ID) {
        Product product_to_remove = null;
        
        for (Product product : products) {
            if (product.ID == ID) {
                product_to_remove = product;
            }
        }
        
        if (product_to_remove != null) {
            products.remove(product_to_remove);
            //Remove from database
        }
    }
    
    public void UpdateStock(int ID, int amount) {
        Product product_to_update = null;
        
        for (Product product : products){
            if (product.ID == ID) {
                product_to_update = product;
            }
        }
        
        if (product_to_update != null) {    
            product_to_update.stock += amount;
            //Update in database
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
