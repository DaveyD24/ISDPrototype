/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dtdye
 */

import java.util.LinkedList;

public class OrderController {
    
    LinkedList<Order> orders = new LinkedList<Order>();
    
    
    public void CreateOrder(int quantity, Product initial_product, String delivery_address) {
        Order order = new Order(quantity, initial_product, delivery_address);
        orders.add(order);
        //Add to database
    }
    
    public void UpdateOrder(int ID, Product product_to_add) {
        Order order_to_update = null;
        
        for (Order order : orders) {
            if (order.getID() == ID) {
                order_to_update = order;
            }
        }
        
        if (order_to_update != null) {
            order_to_update.addToOrder(product_to_add);
        }
        
    }
    
    public void CancelOrder(int ID) {
        Order order_to_cancel = null;
        
        for (Order order : orders) {
            if (order.getID() == ID) {
                order_to_cancel = order;
            }
        }
        
        orders.remove(order_to_cancel);
        
        //Remove from database
    }
    
    public void ViewOrderHistory(int customer_id) {
        //?
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
