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
public class Payment {
    
    public int ID;
    public int customer_ID;
    public String name;
    public int card_number;
    public int CVV;
    public String expiry;
    public boolean mastercard;
    public boolean visa;
    
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
    
    public int getID() {
        return this.ID;
    }
    
    public int getCustomerID() {
        return this.customer_ID;
    }
    
    public void setCustomerID(int ID) {
        this.customer_ID = ID;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName() {
        this.name = name;
    }
    
    public int getCardNumber() {
        return this.card_number;
    }
    
    public void setCardNumber(int number) {
        this.card_number = number;
    }
    
    public int getCVV() {
        return this.CVV;
    }
    
    public void setCVV(int cvv) {
        this.CVV = cvv;
    }
    
    public String getExpiry() {
        return this.expiry;
    }
    
    public void setExpiry(String expiry) {
        this.expiry = expiry;
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
