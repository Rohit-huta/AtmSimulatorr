/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm.simulator.system;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author channappa
 */
public class Transaction extends JFrame implements ActionListener{

    JButton deposit, withdrawal, fastCash, miniStatement, pinChange, balanceEnquiry, exit  ;
    String pinNumber;
    public Transaction(String pinNumber) {
        this.pinNumber = pinNumber;
        setLayout(null);
        
        ImageIcon I1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image I1Scaled = I1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon atm = new ImageIcon(I1Scaled);
        JLabel atmJLabel = new JLabel(atm);
        atmJLabel.setBounds(0, 0, 900, 900);
        add(atmJLabel);
        
        
        JLabel text = new JLabel("Please Select your transaction");
        text.setBounds(220, 300, 700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway", Font.BOLD, 16));
        atmJLabel.add(text);
        
        
        deposit = new JButton("Deposit");
        deposit.setBounds(170, 415, 150, 30);
        deposit.addActionListener(this);
        atmJLabel.add(deposit);
        
        withdrawal = new JButton("Cash Withdrawal");
        withdrawal.setBounds(355, 415, 150, 30);
        withdrawal.addActionListener(this);
        atmJLabel.add(withdrawal);
        
        fastCash = new JButton("Fast Cash");
        fastCash.setBounds(170, 450, 150, 30);
        fastCash.addActionListener(this);
        atmJLabel.add(fastCash);
        
        miniStatement = new JButton("Mini Statement");
        miniStatement.setBounds(355, 450, 150, 30);
        miniStatement.addActionListener(this);
        atmJLabel.add(miniStatement);
        
        pinChange = new JButton("Pin Change");
        pinChange.setBounds(170, 485, 150, 30);
        pinChange.addActionListener(this);
        atmJLabel.add(pinChange);
        
        balanceEnquiry = new JButton("Balance Enquiry");
        balanceEnquiry.setBounds(355, 485, 150, 30);
        balanceEnquiry.addActionListener(this);
        atmJLabel.add(balanceEnquiry);
        
        exit = new JButton("Exit");
        exit.setBounds(355, 520, 150, 30);
        exit.addActionListener(this);
        atmJLabel.add(exit);
        
                
        
        setSize(900, 900);
        setLocation(300, 0);
        setVisible(true);
        getContentPane().setBackground(Color.BLACK);
    }
    
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource() == exit){
            System.exit(0);
        }else if (ae.getSource() == deposit) {
            setVisible(false);
            new Deposit(pinNumber).setVisible(true);
        } else if(ae.getSource() == withdrawal){
            setVisible(false);
            new Withdrawal(pinNumber).setVisible(true);
        }
        else if(ae.getSource() == fastCash){
            setVisible(false);
            new FastCash(pinNumber).setVisible(true);
        }
        else if(ae.getSource() == pinChange){
            setVisible(false);
            new PinChange(pinNumber).setVisible(true);
        }else if(ae.getSource() == miniStatement){
            setVisible(false);
            new MiniStatement(pinNumber).setVisible(true);
        }
    }
    
    public static void main(String[] args) {
        new Transaction("");
    }
}
