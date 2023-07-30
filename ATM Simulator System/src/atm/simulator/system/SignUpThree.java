/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm.simulator.system;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author channappa
 */
public class SignUpThree extends JFrame implements ActionListener{

    String formNo;
    JRadioButton savingsAcc, recurringAcc,currentAcc, fixedAcc; 
    JCheckBox ATMCard, InternetBanking, MobileBanking, EmailAlerts, ChequeBook, EStatement, declaration;
    JButton submit, cancel;

    
    public SignUpThree(String formNo) {
        this.formNo = formNo;
        setLayout(null);
        
        JLabel page3Title = new JLabel("Page 3: Account Details");
        new whiteC(page3Title);
        page3Title.setFont(new Font("Raleway", Font.BOLD, 22));
        page3Title.setBounds(280, 40, 400, 40);
        add(page3Title);
        
        JLabel type = new JLabel("Account Type");
        new whiteC(type);
        type.setFont(new Font("Raleway", Font.BOLD, 22));
        type.setBounds(100, 140, 200, 30);
        add(type);
        
        
        savingsAcc = new JRadioButton("Saving Account");
        savingsAcc.setForeground(Color.WHITE);
        savingsAcc.setFont(new Font("Raleway", Font.BOLD, 16));
        savingsAcc.setBounds(100, 180, 250, 20);
        add(savingsAcc);
        
        
        recurringAcc = new JRadioButton("Reccuring Deposit Account");
                recurringAcc.setForeground(Color.WHITE);
        recurringAcc.setFont(new Font("Raleway", Font.BOLD, 16));
        recurringAcc.setBounds(350, 180, 256, 20);
        add(recurringAcc);
        
        
        currentAcc = new JRadioButton("Current Account");
                currentAcc.setForeground(Color.WHITE);
        currentAcc.setFont(new Font("Raleway", Font.BOLD, 16));
        currentAcc.setBounds(100, 220, 250, 20);
        add(currentAcc);
        
        
        fixedAcc = new JRadioButton("Fixed Account");
                fixedAcc.setForeground(Color.WHITE);
        fixedAcc.setFont(new Font("Raleway", Font.BOLD, 16));
        fixedAcc.setBounds(350, 220, 250, 20);
        add(fixedAcc);
        
        ButtonGroup accountType = new ButtonGroup();
        accountType.add(savingsAcc);
        accountType.add(fixedAcc);
        accountType.add(recurringAcc);
        accountType.add(currentAcc);
        
        
        JLabel cardNoLabel = new JLabel("Card Number");
        new whiteC(cardNoLabel);
        cardNoLabel.setFont(new Font("Raleway", Font.BOLD, 16));
        cardNoLabel.setBounds(100, 300, 250, 20);
        add(cardNoLabel);
        
        JLabel cardValueLabel = new JLabel("XXXX-XXXX-XXXX-4184");
                new whiteC(cardValueLabel);
        cardValueLabel.setFont(new Font("Raleway", Font.BOLD, 16));
        cardValueLabel.setBounds(330, 300, 300, 20);
        add(cardValueLabel);
        JLabel cardDetail = new JLabel("Your 16-Digit card number");
                new whiteC(cardDetail);
        cardDetail.setFont(new Font("Raleway", Font.BOLD, 10));
        cardDetail.setBounds(100, 330, 300, 20);
        add(cardDetail);
        
        JLabel pinLabel = new JLabel("Pin: ");
                new whiteC(pinLabel);
        pinLabel.setFont(new Font("Raleway", Font.BOLD, 16));
        pinLabel.setBounds(100, 370, 300, 20);
        add(pinLabel);
        
        JLabel pinvalue = new JLabel("XXXX");
                new whiteC(pinvalue);
        pinvalue.setFont(new Font("Raleway", Font.BOLD, 16));
        pinvalue.setBounds(330, 370, 300, 20);
        add(pinvalue);
        JLabel pinDetail = new JLabel("Your 4-Digit Password");
                new whiteC(pinDetail);
        pinDetail.setFont(new Font("Raleway", Font.BOLD, 12));
        pinDetail.setBounds(100, 390, 300, 20);
        add(pinDetail);
        
        
        JLabel services = new JLabel("Services Required:");
                new whiteC(services);
        services.setFont(new Font("Raleway", Font.BOLD, 22));
        services.setBounds(100, 450, 300, 30);
        add(services);
        
        ATMCard = new JCheckBox("ATM CARD");
        ATMCard.setForeground(Color.WHITE);
        ATMCard.setFont(new Font("Raleway", Font.BOLD, 16));
        ATMCard.setBounds(100, 500, 200, 30);
        add(ATMCard);
        
        InternetBanking = new JCheckBox("Internet Banking");
        InternetBanking.setForeground(Color.WHITE);
        InternetBanking.setFont(new Font("Raleway", Font.BOLD, 16));
        InternetBanking.setBounds(350, 500, 200, 30);
        add(InternetBanking);
        
        MobileBanking = new JCheckBox("Mobile Banking");
        MobileBanking.setForeground(Color.WHITE);
        MobileBanking.setFont(new Font("Raleway", Font.BOLD, 16));
        MobileBanking.setBounds(100, 550, 200, 30);
        add(MobileBanking);
        
        EmailAlerts = new JCheckBox("EMAIL Alerts and SMS Alerts");
        EmailAlerts.setForeground(Color.WHITE);        EmailAlerts.setBackground(Color.WHITE);
        EmailAlerts.setFont(new Font("Raleway", Font.BOLD, 16));
        EmailAlerts.setBounds(350, 550, 200, 30);
        add(EmailAlerts);
        
        ChequeBook = new JCheckBox("Cheque Book");
        ChequeBook.setForeground(Color.WHITE);        ChequeBook.setBackground(Color.WHITE);
        ChequeBook.setFont(new Font("Raleway", Font.BOLD, 16));
        ChequeBook.setBounds(100, 600, 200, 30);
        add(ChequeBook);
        
        EStatement = new JCheckBox("E-Statement");
        EStatement.setForeground(Color.WHITE);        EStatement.setBackground(Color.WHITE);
        EStatement.setFont(new Font("Raleway", Font.BOLD, 16));
        EStatement.setBounds(350, 600, 200, 30);
        add(EStatement);
        
        declaration = new JCheckBox("I hereby declare that the above entered details are correct to the best of my knowledge.");
        declaration.setForeground(Color.WHITE);        declaration.setBackground(Color.WHITE);
        declaration.setFont(new Font("Raleway", Font.BOLD, 12));
        declaration.setBounds(100, 650, 600, 30);
        add(declaration);
        
        submit = new JButton("Submit");
        submit.setBackground(Color.WHITE);
        submit.setForeground(Color.BLACK);
        submit.setFont(new Font("Raleway", Font.BOLD, 14));
        submit.setBounds(250, 720, 100, 30);
        submit.addActionListener(this);
        add(submit);
        
        cancel = new JButton("Cancel");
        cancel.setBackground(Color.WHITE);
        cancel.setForeground(Color.BLACK);
        cancel.setFont(new Font("Raleway", Font.BOLD, 14));
        cancel.setBounds(420, 720, 100, 30);
        cancel.addActionListener(this);        
        add(cancel);
        
        
        
        
        setSize(850, 820);
        setLocation(350, 0);
        setVisible(true);
        getContentPane().setBackground(Color.BLACK);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
         if(ae.getSource() == submit){
             String accountType = null;
             if(savingsAcc.isSelected()){
                 accountType = "Saving Account";
             } else if(recurringAcc.isSelected()){
                  accountType = "Recurring Deposit Account";
             }else if(fixedAcc.isSelected()){
                  accountType = "Fixed Deposit Account";
             }else if(currentAcc.isSelected()){
                  accountType = "Current Account";
             }
             
             Random random = new Random();
               long first7 = (random.nextLong() % 90000000L) + 5040936000000000L;
               String cardNumber = "" + Math.abs(first7);
       
             String pinNumber = "" + Math.abs((random.nextInt() % 9000L) + 1000L) ;
             System.out.println(pinNumber);
             
             String facilities = "";
             if(ATMCard.isSelected()){
                 facilities = facilities + " ATM Card";
             } else if(InternetBanking.isSelected()){
                 facilities = facilities + " Internet Banking";
             } else if(MobileBanking.isSelected()){
                 facilities = facilities + " Mobile Banking";
             } else if(EmailAlerts.isSelected()){
                 facilities = facilities + " Email & SMS Alerts";
             } else if(ChequeBook.isSelected()){
                 facilities = facilities + " Cheque Book";
             } else if(EStatement.isSelected()){
                 facilities = facilities + " Cheque Book";
             }
             
             try{
                 if(declaration.isSelected()){
                    Conn c = new Conn();
                    String query = "insert into signupThree values ('"+ formNo + "' , '"+ accountType + "' , '" + cardNumber  + "' , '" + pinNumber  + "' , '" + facilities + "')";

                    String queryLogin = "insert into login values ('"+ formNo + "' , '" + cardNumber  + "' , '" + pinNumber + "')";
                     System.out.println(cardNumber);
                     c.s.executeUpdate(query);
                    c.s.executeUpdate(queryLogin);
                     System.out.println(cardNumber);
                    setVisible(false);
                    new Deposit(pinNumber).setVisible(true);
                    c.s.executeUpdate(query);
                    c.s.executeUpdate(queryLogin);
                    
                    
                    JOptionPane.showMessageDialog(null, "Your Card Number : " + cardNumber + "\nPin : " + pinNumber); 
                 }else{
                     JOptionPane.showMessageDialog(null, "Check the declaration box");
                 }
             }catch(Exception e){
                 System.out.println(e);
             }
         } else if(ae.getSource() == cancel){
                setVisible(false);
         }
    }
    
    public static void main(String[] args) {
        new SignUpThree("");
    }
}
