/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm.simulator.system;


import java.awt.*;
import javax.swing.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import atm.simulator.system.whiteC;
import java.awt.event.*;

/**
 *
 * @author channappa
 */
public class SignUpOne extends JFrame implements ActionListener{
       
    long randomNum;
    public JLabel formNo;
    String formNum;
    JTextField nameInput, FnameInput, dobInput, genderInput, martialInput, emailInput, addressInput, cityInput, stateInput, pinCodeInput;
    JButton next;
    JRadioButton male, female, unmarried, married;
    JDateChooser dateChooser;


    
    
    public SignUpOne() {
       
    
        
        Random random = new Random();
        randomNum =Math.abs((random.nextLong() % 9000L) + 1000L);

        
        formNo = new JLabel("Applicaion Form : "  + randomNum);
        whiteC formC = new whiteC(formNo);
        formNo.setFont(new Font("Raleway", Font.BOLD, 36));
        formNo.setBounds(140,  20, 600, 40);
        add(formNo);
        
        JLabel personalDetails = new JLabel("Personal Details");
        personalDetails.setFont(new Font("Raleway", Font.BOLD, 22)); 
        personalDetails.setBounds(290,  80, 400, 30);
        add(personalDetails);
        
        JLabel name = new JLabel("NAME : ");
        whiteC nameC = new whiteC(name);
        name.setFont(new Font("Raleway", Font.BOLD, 20)); 
        name.setBounds(100,  140, 100, 30);
        add(name);
        nameInput = new JTextField();
        nameInput.setBounds(300,  140, 400, 30);
        add(nameInput);
        
        JLabel Fname = new JLabel("Father's Name : ");
        whiteC FnameC = new whiteC(Fname);
        Fname.setFont(new Font("Raleway", Font.BOLD, 20)); 
        Fname.setBounds(100,  190, 200, 30);
        add(Fname);
        FnameInput = new JTextField();
        FnameInput.setBounds(300,  190, 400, 30);
        add(FnameInput);
           
        JLabel dob = new JLabel("Date Of Birth: ");
        whiteC dobC = new whiteC(dob);
        dob.setFont(new Font("Raleway", Font.BOLD, 20)); 
        dob.setBounds(100,240, 200, 30);
        add(dob);
        dateChooser = new JDateChooser();
        dateChooser.setBounds(300, 240, 400, 30);
        dateChooser.setForeground(new Color(105, 105, 105));
        add(dateChooser);
 
        
        JLabel gender = new JLabel("Gender : ");
        whiteC genderC = new whiteC(gender);
        gender.setFont(new Font("Raleway", Font.BOLD, 20)); 
        gender.setBounds(100,290, 200, 30);
        add(gender);
        male=new JRadioButton("Male");    
        female=new JRadioButton("Female");  
        male.setForeground(Color.WHITE);
        female.setForeground(Color.WHITE);
        male.setBounds(300, 290, 100, 30);
        female.setBounds(450, 290, 120, 30);
        add(male);
        add(female);
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        
        JLabel email = new JLabel("Email : ");
        whiteC emailC = new whiteC(email);
        email.setFont(new Font("Raleway", Font.BOLD, 20)); 
        email.setBounds(100,340, 200, 30);
        add(email);
        emailInput = new JTextField();
        emailInput.setBounds(300,  340, 400, 30);
        add(emailInput);
        
        
        JLabel marital = new JLabel("Martial Status : ");
        whiteC maritalC = new whiteC(marital);
        marital.setFont(new Font("Raleway", Font.BOLD, 20)); 
        marital.setBounds(100,390, 200, 30);
        add(marital);
        married=new JRadioButton("Married");    
        unmarried =new JRadioButton("Unmarried");  
        married.setForeground(Color.WHITE);
        unmarried.setForeground(Color.WHITE);
        married.setBounds(300, 390, 100, 30);
        unmarried.setBounds(450, 390, 120, 30);
        add(married);
        add(unmarried);
        ButtonGroup maritalGroup = new ButtonGroup();
        maritalGroup.add(married);
        maritalGroup.add(unmarried);
 
         
        JLabel address = new JLabel("Adress ");
        whiteC addressC = new whiteC(address);
        address.setFont(new Font("Raleway", Font.BOLD, 20)); 
        address.setBounds(100,440, 200, 30);
        add(address);
        addressInput = new JTextField();
        addressInput.setBounds(300,  440, 400, 30);
        add(addressInput);
        
        
          JLabel city = new JLabel("City ");
        whiteC cityC = new whiteC(city);
        city.setFont(new Font("Raleway", Font.BOLD, 20)); 
        city.setBounds(100,490, 200, 30);
        add(city);
        cityInput = new JTextField();
        cityInput.setBounds(300,  490, 400, 30);
        add(cityInput);
        
        JLabel state = new JLabel("State ");
        whiteC stateC = new whiteC(state);
        state.setFont(new Font("Raleway", Font.BOLD, 20)); 
        state.setBounds(100,540, 200, 30);
        add(state);
        stateInput = new JTextField();
        stateInput.setBounds(300,  540, 400, 30);
        add(stateInput);
          
        JLabel pinCode = new JLabel("PinCode :");
        whiteC pinCodeC = new whiteC(pinCode);
        pinCode.setFont(new Font("Raleway", Font.BOLD, 20)); 
        pinCode.setBounds(100,590, 200, 30);
        add(pinCode);
        pinCodeInput = new JTextField();
        pinCodeInput.setBounds(300,  590, 400, 30);
        add(pinCodeInput);
        
        
        next = new JButton("NEXT");
        next.setForeground(Color.BLACK);
        next.setBackground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);
        
        
        setLayout(null);
        setTitle("Sign Up");
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
        getContentPane().setBackground(Color.BLACK);
        
    }
   
    @Override
    public void actionPerformed(ActionEvent ae){
        JTextField[] arr = { nameInput, FnameInput,emailInput, addressInput, cityInput, stateInput,pinCodeInput};
        formNum = "" + randomNum; //
        String name = nameInput.getText();
        String Fname = FnameInput.getText();
        String dob = "2023/12/22";
        String gender = null;
        if(male.isSelected()){
            gender = "male";
        } else{
            gender = "Female";
        }
        
        String email = emailInput.getText();
        String marital = null;
        if(unmarried.isSelected()){
            marital = "unmaried";
        }else {
            marital = "married";
        }
        
        String address = addressInput.getText();
        String city = cityInput.getText();
        String state = stateInput.getText();
        String pincode = pinCodeInput.getText();
        
        
         System.out.println(gender);
        
        try {
            if(name.equals("")){
                JOptionPane.showMessageDialog(null, "Name is Required");
            }else{
                Conn c1 = new Conn();
                String query = "insert into signup values ('" + formNum + "', '" + name + "' , '" + Fname  + "' , '" + dob + "' , '" + email + "' , '" + gender + "' , '" + marital + "' , '" + address + "' , '" + city + "' , '" + state + "' , '" + pincode + "')";
                c1.s.execute(query);
                for(int i=0; i < arr.length; i++){
                    arr[i].setText("");
                    
                } 
            }
            setVisible(false);
            new SignUpTwo(formNum);
           
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
    
    public static void main(String[] args) {
        new SignUpOne();
    }
}
