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
    public int Customer_ID;
    public String name;
    public String address;
    public String city;
    public String state;
    public int zip;
    
    public Shipment(int ID, int Customer_ID, String name, String address, String city, String state, int zip) {
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
    
    
}
