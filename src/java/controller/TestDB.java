/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author dtdye
 */

 

import DAO.DBConnector;
import DAO.DBManager;
import java.sql.*;

import java.util.*;

import java.util.logging.*;

 

public class TestDB {

private static Scanner in = new Scanner(System.in);

 

public static void main(String[] args) {

try {

DBConnector connector = new DBConnector();

Connection conn = connector.openConnection();

DBManager db = new DBManager(conn);

 

System.out.print("User email: ");

String email = in.nextLine();

System.out.print("User name: ");

String name = in.nextLine();

System.out.print("User password: ");

String password = in.nextLine();

System.out.print("User gender: ");

String gender = in.nextLine();

System.out.print("User favorite color: ");

String favcol = in.nextLine();

db.addUser( email, name, password, gender, favcol);

System.out.println("User is added to the database.");

connector.closeConnection();

 

} catch (ClassNotFoundException | SQLException ex) {

Logger.getLogger(TestDB.class.getName()).log(Level.SEVERE, null, ex);

}

}

}