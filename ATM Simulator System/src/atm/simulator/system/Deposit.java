/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm.simulator.system;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.*;
/**
 *
 * @author channappa
 */
public class Deposit extends JFrame implements ActionListener{
    
    JTextField amountInput;
    JButton deposit, back;
    String pinNumber;
    public Deposit(String pinNumber) {
        this.pinNumber = pinNumber;
        setLayout(null);
        
        ImageIcon I1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image I2 = I1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT );
        ImageIcon I3 = new ImageIcon(I2);
        JLabel image = new JLabel(I3);
        image.setBounds(0, 0, 900, 900);
        add(image);
        
        JLabel text = new JLabel("Enter the amount you want to deposit");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        text.setBounds(170, 300, 400, 20);
        image.add(text);
        
        amountInput = new JTextField();
        amountInput.setFont(new Font("Raleway", Font.BOLD, 16));
        amountInput.setBounds(170, 350, 320, 25);
        image.add(amountInput);
        
        deposit = new JButton("Deposit");
        deposit.setBounds(355, 485, 150, 30);
        deposit.addActionListener(this);
        image.add(deposit);
        
        back = new JButton("back");
        back.setBounds(355, 520, 150, 30);
        back.addActionListener(this);
        image.add(back);


        
        setSize(900, 900);
        setLocation(300, 0);
        setVisible(true);
    }
     
    
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == deposit){
            String depositAmount = amountInput.getText();
            LocalDateTime dateTime = LocalDateTime.now();
            if(depositAmount.isEmpty()){
                JOptionPane.showMessageDialog(null, "Enter a valid amount");
            }else{
                try {
                    Conn conn = new Conn();
//                    String query = "select * from login";
                    String query = "insert into transactions values('" + pinNumber + "' , '" + dateTime + "' , 'deposit' , '" + depositAmount + "')";
                    conn.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Rs " + depositAmount + " deposited successfully");
                    setVisible(false);
                    new Transaction(pinNumber).setVisible(true);
                   
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }else if(ae.getSource() == back){
            setVisible(false);
            new Transaction(pinNumber).setVisible(true);
        }
    }
    public static void main(String[] args){
        new Deposit("");
    }
    
}
