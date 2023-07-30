/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm.simulator.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author channappa
 */
public class PinChange extends JFrame implements ActionListener{

    JTextField NewPinField, RNewPinField;
    JButton change, back;
    String pinNumber;
    public PinChange(String pinNumber){
        this.pinNumber = pinNumber;
        
        setLayout(null);

        ImageIcon I1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image I1Scaled = I1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon atm = new ImageIcon(I1Scaled);
        JLabel atmJLabel = new JLabel(atm);
        atmJLabel.setBounds(0, 0, 900, 900);
        add(atmJLabel);
        
          
        JLabel text = new JLabel("Change your pin");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        text.setBounds(270, 300, 400, 20);
        atmJLabel.add(text);
        
                  
        JLabel newPin = new JLabel("New Pin");
        newPin.setForeground(Color.WHITE);
        newPin.setFont(new Font("System", Font.BOLD, 16));
        newPin.setBounds(170, 340, 200, 20);
        atmJLabel.add(newPin);
        
        JLabel RnewPin = new JLabel("Re-enter New Pin");
        RnewPin.setForeground(Color.WHITE);
        RnewPin.setFont(new Font("System", Font.BOLD, 16));
        RnewPin.setBounds(170, 380, 200, 20);
        atmJLabel.add(RnewPin);
        
        NewPinField = new JTextField("");
        NewPinField.setFont(new Font("Raleway", Font.BOLD, 16));
        NewPinField.setBounds(350, 340, 150, 20);
        atmJLabel.add(NewPinField);
        
        RNewPinField = new JTextField();
        RNewPinField.setFont(new Font("Raleway", Font.BOLD, 16));
        RNewPinField.setBounds(350, 380, 150, 20);
        atmJLabel.add(RNewPinField);
        
        change = new JButton("Change");
        change.setBounds(355, 490, 150, 30);
        change.addActionListener(this);
        atmJLabel.add(change);
        
        back = new JButton("back");
        back.setBounds(355, 520, 150, 30);
        back.addActionListener(this);
        atmJLabel.add(back);
        
        setSize(900, 900);
        setLocation(300, 0);
        setVisible(true);
        getContentPane().setBackground(Color.BLACK);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        
        String newPin = NewPinField.getText();
        String RnewPin = RNewPinField.getText();
        if(ae.getSource() == change){
            try {
                if(!newPin.equals(RnewPin)){
                    JOptionPane.showMessageDialog(null, "Pin does not match");
                    return;
                } else if(newPin.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Please enter new pin");
                    return;
                } else if(RnewPin.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Please enter Re-enter New pin");
                    return;
                }


                    Conn conn = new Conn();
                    String updateQuery1 = "Update login set pinNumber = '" + newPin + "' where pinNumber = '" + pinNumber + "'";
                    String updateQuery2 = "Update transactions set pinNumber = '" + newPin + "' where pinNumber = '" + pinNumber + "'";
                    String updateQuery3 = "Update signupThree set pinNumber = '" + newPin + "' where pinNumber = '" + pinNumber + "'";
                    conn.s.executeUpdate(updateQuery1);
                    conn.s.executeUpdate(updateQuery2);
                    conn.s.executeUpdate(updateQuery3);
                    JOptionPane.showMessageDialog(null, "Pin Successfully changed");
                    setVisible(false);
                    new Transaction(newPin).setVisible(true);
                }catch (Exception e) {
                    System.out.println(e);
                } 
           
            }else if(ae.getSource() == back){
                setVisible(false);
                new Transaction(pinNumber).setVisible(true);
            }
            
    }
    
    
    
    
    public static void main(String[] args) {
        new PinChange("");
    }
    
}
