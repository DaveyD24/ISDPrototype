/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dtdye
 */
public class Payment {
    
    int ID;
    int customer_ID;
    String name;
    int card_number;
    int CVV;
    String expiry;
    boolean mastercard;
    boolean visa;
    
    public Payment(int customer_ID, int ID, String name, int card_number, int CVV, String expiry, boolean mastercard) {
        this.customer_ID = customer_ID;
        this.ID = ID;
        this.name = name;
        this.CVV = CVV;
        this.expiry = expiry;
        if (mastercard) {
            this.mastercard = true;
            this.visa = false;
        }
        else {
            this.visa = true;
            this.mastercard = false;
        }
    }
    
    public String getCardType() {
        if (mastercard) {
            return "mastercard";
        }
        else {
            return "visa";
        }
    }
    
    
    
    
}
