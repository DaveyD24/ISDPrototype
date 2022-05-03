
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
public class ShipmentController {
    
    LinkedList<Shipment> shipments = new LinkedList<Shipment>();
    
    
    public void AddShipmentMethod(int ID, String first_name, String last_name, String address, String city, String state, int zip) {
        Shipment shipment = new Shipment(ID, first_name, last_name, address, city, state, zip);
        shipments.add(shipment);
        //Add to database
    }
    
    public void UpdateShipment(int ID) {
        Shipment shipment_to_update = null;
        
        for (Shipment shipment : shipments){
            if (shipment.ID == ID){
                shipment_to_update = shipment;
            }
        }
        
        if (shipment_to_update != null) {
            shipments.remove(shipment_to_update);
            //Remove from database
        }
    }
    
    public void RemoveShipment(int ID) {
        Shipment shipment_to_remove = null;
        
        for (Shipment shipment : shipments) {
            if (shipment.ID == ID) {
                shipment_to_remove = shipment;
            }
        }
        
        if (shipment_to_remove != null) {
            shipments.remove(shipment_to_remove);
            //Remove from database
        }
    }
    
    public void ViewShipmentDetails() {
        
    }
    
    
    
    
    
    
    
    
    
}
