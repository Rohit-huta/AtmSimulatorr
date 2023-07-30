/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm.simulator.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.sql.*;


/**
 *
 * @author channappa
 * Gets the fast cash screen and its functions
 */
public class FastCash extends JFrame implements ActionListener{
        JButton c100, c200, c500, c2000,exit; 
        String pinNumber;
        
       public FastCash(String pinNumber) {
           
        this.pinNumber = pinNumber;

        setLayout(null);
        
        ImageIcon I1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image I1Scaled = I1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon atm = new ImageIcon(I1Scaled);
        JLabel atmJLabel = new JLabel(atm);
        atmJLabel.setBounds(0, 0, 900, 900);
        add(atmJLabel);
        
        
        JLabel text = new JLabel("Fast Cash");
        text.setBounds(220, 300, 700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway", Font.BOLD, 16));
        atmJLabel.add(text);
        
        
        c100 = new JButton("100");
        c100.setBounds(170, 415, 150, 30);
        c100.addActionListener(this);
        atmJLabel.add(c100);
        
        c200 = new JButton("200");
        c200.setBounds(355, 415, 150, 30);
        c200.addActionListener(this);
        atmJLabel.add(c200);
        
        c500 = new JButton("500");
        c500.setBounds(170, 450, 150, 30);
        c500.addActionListener(this);
        atmJLabel.add(c500);
        
        c2000 = new JButton("2000");
        c2000.setBounds(355, 450, 150, 30);
        c2000.addActionListener(this);
        atmJLabel.add(c2000);

        
      
        exit = new JButton("Exit");
        exit.setBounds(355, 520, 150, 30);
        exit.addActionListener(this);
        atmJLabel.add(exit);
        
                
        
        setSize(900, 900);
        setLocation(300, 0);
        setVisible(true);
        getContentPane().setBackground(Color.BLACK);
    }
    
        @Override
    public void actionPerformed(ActionEvent ae) {
        

        String withdrawAmount = "";
        if(ae.getSource() == c100){
            withdrawAmount = "100";
            
        }else if (ae.getSource() == c200){
            withdrawAmount = "" + 200;
        } 
        else if (ae.getSource() == c500){
            withdrawAmount = "" + 500;
        } 
        else if (ae.getSource() == c2000){
            withdrawAmount = "" + 2000;            
        } 
        
        try {
            Conn conn = new Conn();
            ResultSet rs = conn.s.executeQuery("select * from transactions where pinNumber = '" + pinNumber + "'");
            int balance = 0;
            while(rs.next()){
                if(rs.getString("type").equals("deposit")){
                    balance += Integer.parseInt( rs.getString("amount"));
                } else if(rs.getString("type").equals("withdrawal")){
                    balance -= Integer.parseInt( rs.getString("amount"));
                }
            }
            
            if(balance < Integer.parseInt(withdrawAmount)){
                JOptionPane.showMessageDialog(null, "Insufficient Balance");
                return;
            }
            LocalDateTime dateTime = LocalDateTime.now();
           
                 
            String query = "insert into transactions values('" + pinNumber + "' , '" + dateTime + "' , 'withdrawal' , '" + withdrawAmount + "')";
            conn.s.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Rs " + withdrawAmount + " Withdrawal successful.");
            setVisible(false);
            new Transaction(pinNumber).setVisible(true);

        } catch (Exception e) {
            System.out.println(e);
        }
        
        
    }
    
    public static void main(String[] args) {
        new FastCash("6167");
    }
 
}
