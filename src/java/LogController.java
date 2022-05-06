/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dtdye
 */
public class LogController {
    
    
   public void CreateLog(int customer_ID, String login_time, String logout_time, String date) {
       Log log = new Log(customer_ID, login_time, logout_time, date);
       //Add to database
   } 
    
    
    
    
    
    
    
    
}
