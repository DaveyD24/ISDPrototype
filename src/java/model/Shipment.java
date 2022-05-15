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

public class Shipment {
    public int ID;
    public int customer_ID;
    public String name;
    public String address;
    public String city;
    public String state;
    public int zip;
    
    public Shipment(int ID, int customer_ID, String name, String address, String city, String state, int zip) {
        this.ID = ID;
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
    
    public int getID() {
        return ID;
    }
    
    public int getCustomerID() {
        return this.customer_ID;
    }
    
    public void setCustomerID(int customer_ID) {
        this.customer_ID = customer_ID;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getCity(){
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    
    public String getState() {
        return this.state;
    }
    
    public void setState(String state) {
        this.state = state;
    }
    
    public int getZip() {
        return this.zip;
    }
    public void setZip(int zip) {
        this.zip = zip;
    }
    
    
}
