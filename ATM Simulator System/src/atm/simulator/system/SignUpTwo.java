/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm.simulator.system;

import com.toedter.calendar.JDateChooser;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author channappa
 */
public class SignUpTwo extends JFrame implements ActionListener{

    String formNo;
    JTextField panNoInput, aadharNoInput;
    String[] religionarr = {"Hindu", "Muslim", "Christian", "Sikh", "Budhism"};
    String[] categoryarr = {"General", "OBC", "SCST"};
    String[] incomearr = {"Less than 1Lakh", "Greate than 1Lakh"};
    String[] qualificationArr = {"Non-Graduation", "Graduation"};
    String[] occupationArr = {"Salaried", "Non-salaried"};
    JComboBox religionBox, categoryBox, incomeBox, qualificationBox, occupationBox;
    
    
    JRadioButton radseniorCitizenyes, radseniorCitizenNo, radExistingAccYes, radExistingNo;
    JButton next;
    
   
    public SignUpTwo(String formNum) {
        
        this.formNo = formNum;
        
        JLabel page2 = new JLabel("Page 2 : Addtional details");
        whiteC page2C = new whiteC(page2);
        page2.setFont(new Font("Raleway", Font.BOLD, 36));
        page2.setBounds(140,  20, 600, 40);
        add(page2);
        
        
        JLabel religion = new JLabel("RELIGION : ");
        new whiteC(religion);
        religion.setFont(new Font("Raleway", Font.BOLD, 20)); 
        religion.setBounds(100,  140, 200, 30);
        add(religion);
        religionBox = new JComboBox(this.religionarr);
        religionBox.setBounds(300,140, 300, 30 );
        add(religionBox);
        
 
        
        JLabel category = new JLabel("CATEGORY : ");
        new whiteC(category);
        category.setFont(new Font("Raleway", Font.BOLD, 20)); 
        category.setBounds(100,  190, 200, 30);
        add(category);
        categoryBox = new JComboBox(this.categoryarr);
        categoryBox.setBounds(300,190, 300, 30 );
        add(categoryBox);

           
        JLabel Income = new JLabel("INCOME : ");
        new whiteC(Income);
        Income.setFont(new Font("Raleway", Font.BOLD, 20)); 
        Income.setBounds(100,240, 200, 30);
        add(Income);
        incomeBox = new JComboBox(this.incomearr);
        incomeBox.setBounds(300,240, 300, 30 );
        add(incomeBox);
        
 
 
        
        JLabel educationalQ = new JLabel("EDUCATIONAL QUALIFICATION : ");
        new whiteC(educationalQ);
        educationalQ.setFont(new Font("Raleway", Font.BOLD, 20)); 
        educationalQ.setBounds(100,290, 200, 30);
        add(educationalQ);
        qualificationBox = new JComboBox(this.qualificationArr);
        qualificationBox.setBounds(300,290, 300, 30 );
        add(qualificationBox);
        
       
        
        JLabel occupation = new JLabel("OCCUPATION : ");
        new whiteC(occupation);
        occupation.setFont(new Font("Raleway", Font.BOLD, 20)); 
        occupation.setBounds(100,340, 200, 30);
        add(occupation);
        occupationBox = new JComboBox(this.occupationArr);
        occupationBox.setBounds(300,340, 300, 30 );
        add(occupationBox);
     
        
        
        JLabel panNum = new JLabel("PAN NUMBER : ");
         new whiteC(panNum);
        panNum.setFont(new Font("Raleway", Font.BOLD, 20)); 
        panNum.setBounds(100,390, 200, 30);
        add(panNum);
        panNoInput = new JTextField();
        panNoInput.setBounds(300,  390, 400, 30);
        add(panNoInput);
        
     
    
         
        JLabel aadhar = new JLabel("Aadhar : ");
        new whiteC(aadhar);
        aadhar.setFont(new Font("Raleway", Font.BOLD, 20)); 
        aadhar.setBounds(100,440, 200, 30);
        add(aadhar);
        aadharNoInput= new JTextField();
        aadharNoInput.setBounds(300,  440, 400, 30);
        add(aadharNoInput);
        
        
          JLabel SeniorCitizen = new JLabel("SENIOR CITIZEN ");
        new whiteC(SeniorCitizen);
        SeniorCitizen.setFont(new Font("Raleway", Font.BOLD, 20)); 
        SeniorCitizen.setBounds(100,490, 200, 30);
        add(SeniorCitizen);
//        Radio btn
        radseniorCitizenyes = new JRadioButton("Yes");
        radseniorCitizenyes.setBounds(300, 490, 200, 30);
        radseniorCitizenyes.setForeground(Color.WHITE);
        radseniorCitizenyes.setFont(new Font("Raleway", Font.BOLD, 19));
        add(radseniorCitizenyes);
        radseniorCitizenNo = new JRadioButton("NO");
        radseniorCitizenNo.setBounds(500, 490, 200, 30);
        radseniorCitizenNo.setForeground(Color.WHITE);
        radseniorCitizenNo.setFont(new Font("Raleway", Font.BOLD, 19));
        add(radseniorCitizenNo); 
        ButtonGroup seniorCitizenG = new ButtonGroup();
        seniorCitizenG.add(radseniorCitizenyes);
        seniorCitizenG.add(radseniorCitizenNo);        
        
        
        JLabel ExsistingAcc = new JLabel("EXSISTING ACCOUNT : ");
        new whiteC(ExsistingAcc);
        ExsistingAcc.setFont(new Font("Raleway", Font.BOLD, 20)); 
        ExsistingAcc.setBounds(100,540, 200, 30);
        add(ExsistingAcc);
        radExistingAccYes = new JRadioButton("Yes");
        radExistingAccYes.setBounds(300, 540, 100, 30);
        radExistingAccYes.setForeground(Color.WHITE);
        radExistingAccYes.setFont(new Font("Raleway", Font.BOLD, 19));
        add(radExistingAccYes);
        radExistingNo = new JRadioButton("NO");
        radExistingNo.setBounds(500, 540, 100, 30);
        radExistingNo.setForeground(Color.WHITE);
        radExistingNo.setFont(new Font("Raleway", Font.BOLD, 19));
        add(radExistingNo); 
        ButtonGroup ExistingG = new ButtonGroup();
        ExistingG.add(radExistingAccYes);
        ExistingG.add(radExistingNo);        
        
              
        
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
        String religion = (String)religionBox.getSelectedItem();
        String category = (String)categoryBox.getSelectedItem();
        String income = (String)incomeBox.getSelectedItem();
        String qualification = (String)qualificationBox.getSelectedItem();
        String occupation = (String)occupationBox.getSelectedItem();
        
        String panNum = panNoInput.getText();
        String aadharNum = aadharNoInput.getText();
        
        String SeniorCitizen = null;
        if(radseniorCitizenyes.isSelected()){
            SeniorCitizen = "Yes";
        } else{ 
            SeniorCitizen = "No";
        }
        
        String ExistingAcc = null;
        if(radExistingAccYes.isSelected()){
            ExistingAcc = "Yes";
        }else {
            ExistingAcc = "No";    
        }
        
        
        
        
        try {
            Conn c = new Conn();
            String query = "insert into signupTwo values('" + formNo + "' , '" + religion + "' , '" + category + "' , '" + income + "' , '" + qualification + "' , '" + occupation + "' , '" + SeniorCitizen + "' , '" + ExistingAcc + "')";
            c.s.executeUpdate(query); 
            
//            SignUpThree object
            setVisible(false);
            new SignUpThree(formNo).setVisible(true);
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
   
    
    public static void main(String[] args) {
        new SignUpTwo("");
        
        
        
    }
}
