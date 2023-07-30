/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm.simulator.system;



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.sql.*;



/**
 *
 * @author channappa
 */


public class Login extends JFrame implements ActionListener{
    JButton login, signUp, clear;
    JTextField inputcardNo;
    JPasswordField pinTextField;
    
    public Login() {


        
//        add image
        ImageIcon imgIcon = new ImageIcon(ClassLoader.getSystemResource("icons/SBI-Logo-PNG.jpg"));
        //scaling of image
        Image scaled = imgIcon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon scaledlogo = new ImageIcon(scaled);
        JLabel label = new JLabel(scaledlogo);
        label.setBounds(70, 10, 100, 100);
        add(label);
        
                    //      Text - JLabel
//          Jlabel Heading = new JLabel("String");
        JLabel heading = new JLabel("Welcome to SBI");
        heading.setBounds(200, 40, 400, 40);
        heading.setFont(new Font("Osward", Font.BOLD, 38));
        add(heading);
        
//          JLabel CardNo = new JLabel("String");
        JLabel cardNo = new JLabel("Card No:");
        cardNo.setBounds(120, 150, 150, 30);
        add(cardNo);
        cardNo.setFont(new Font("Raleway", Font.BOLD, 25));
        
         inputcardNo = new JTextField();
        inputcardNo.setBounds(300, 150, 230, 30);

        add(inputcardNo);
        
        JLabel pin = new JLabel("PIN :");
        pin.setFont(new Font("Raleway", Font.BOLD, 20));
        pin.setBounds(120, 220, 400, 40);
        add(pin);
        
         pinTextField = new JPasswordField();
        pinTextField.setBounds(300, 220, 230, 30);
        add(pinTextField);

//        Buttons - JButton
         login = new JButton("LOGIN");
        login.setBounds(300, 300, 100, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.BLACK);     
        login.addActionListener(this);
        add(login);
        
         clear = new JButton("Clear");
        clear.setBounds(430, 300, 100, 30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.BLACK);
        clear.addActionListener(this);
        add(clear);
        
        
        signUp = new JButton("SIGN UP");
        signUp.setBounds(300, 350, 230, 30);
        signUp.addActionListener(this);
        add(signUp);
       
   
        setTitle("AUTOMATED TELLER MACHINE");
        setLayout(null);
        setSize(750, 500);
        setVisible(true);
        setLocation(350, 200);
      getContentPane().setBackground(Color.WHITE);
       
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == clear){
            inputcardNo.setText("");
           pinTextField.setText("");
        } else if(ae.getSource() == login){
            try{
                Conn c = new Conn();
                String inputCard = inputcardNo.getText();
                String inputPin = pinTextField.getText();
                String Query = "Select * from login where cardNumber = " + "'"+inputCard +"' and pinNumber = '" + inputPin + "'";
                ResultSet rs = c.s.executeQuery(Query);
                if(rs.next()){
                    setVisible(false);
                    new Transaction(inputPin).setVisible(true);
                } else{
                    JOptionPane.showMessageDialog(null, "Entered wrong Card Number or Pin");
                }
                
                
            
            } catch(Exception e){
                System.out.println(e);
            }
//            String OGCard = 
//            if(inputCard.equals(ABORT))
//            

        }else if(ae.getSource() == signUp){
            setVisible(false);
            new SignUpOne().setVisible(true);

        }
    }
     
    public static void main(String[] args) {
        new Login();
    }
} 
