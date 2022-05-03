
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
public class PaymentController {
    
    LinkedList<Payment> payments = new LinkedList<Payment>();
    
    public void AddPayment(int customer_ID, int ID, String name, int card_number, int CVV, String expiry, boolean mastercard) {
        Payment payment = new Payment(customer_ID, ID, name, card_number, CVV, expiry, mastercard);
        payments.add(payment);
        //Add to database
    }
    
    public void DeletePayment(int ID) {
        Payment payment_to_delete = null;
        
        for (Payment payment : payments) {
            if (payment.ID == ID) {
                payment_to_delete = payment;
            }
        }
        
        if (payment_to_delete != null) {
            payments.remove(payment_to_delete);
            //Remove from database
        }
    }
    
    public void ViewPayments() {
        
    }
    
    
    
    
    
    
    
    
}
