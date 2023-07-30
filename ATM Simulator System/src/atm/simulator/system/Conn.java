/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm.simulator.system;
import java.sql.*;

/**
 *
 * @author channappa
 */
public class Conn {
    
    Connection c = null;
    
    Statement s;
    public Conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankManagementSystem", "root", "");
            s = c.createStatement();
            System.out.println("Hlll");
            
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public static void main(String[] args) {
        Conn c = new Conn();
        
    }
    
}
