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
    public String first_name;
    public String last_name;
    public String address;
    public String city;
    public String state;
    public int zip;
    
    public Shipment(int ID, String first_name, String last_name, String address, String city, String state, int zip) {
        this.ID = ID;
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
    
    
}
