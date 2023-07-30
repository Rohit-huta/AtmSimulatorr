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
import javax.swing.JTextField;

/**
 *
 * @author channappa
 */
public class Withdrawal extends JFrame implements ActionListener{
         
    JTextField amountInput;
    JButton withdraw, back;
    String pinNumber;


    public Withdrawal(String pinNumber) {
        this.pinNumber = pinNumber;
        setLayout(null);
        
        ImageIcon I1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image I2 = I1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT );
        ImageIcon I3 = new ImageIcon(I2);
        JLabel image = new JLabel(I3);
        image.setBounds(0, 0, 900, 900);
        add(image);
        
        JLabel text = new JLabel("Enter the amount you want to Withdraw");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        text.setBounds(170, 300, 400, 20);
        image.add(text);
        
        amountInput = new JTextField();
        amountInput.setFont(new Font("Raleway", Font.BOLD, 16));
        amountInput.setBounds(170, 350, 320, 25);
        image.add(amountInput);
        
        withdraw = new JButton("Withdraw");
        withdraw.setBounds(355, 485, 150, 30);
        withdraw.addActionListener(this);
        image.add(withdraw);
        
        back = new JButton("back");
        back.setBounds(355, 520, 150, 30);
        back.addActionListener(this);
        image.add(back);


        
        setSize(900, 900);
        setLocation(300, 0);
        setVisible(true);
    }
     
    
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == withdraw){
            String withdrawAmount = amountInput.getText();
            LocalDateTime dateTime = LocalDateTime.now();
            if(withdrawAmount.isEmpty()){
                JOptionPane.showMessageDialog(null, "Enter a valid amount");
            }else{
                try {
                    Conn conn = new Conn();
//                    String query = "select * from login";
                    String query = "insert into transactions values('" + pinNumber + "' , '" + dateTime + "' , 'withdrawal' , '" + withdrawAmount + "')";
                    conn.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Rs " + withdrawAmount + " Withdrawal successful.");
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
    
    
    
    public static void main(String[] args) {
        new Withdrawal("");
    }
}
