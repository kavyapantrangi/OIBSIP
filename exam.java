/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examination;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


 

   
public class exam extends JFrame implements ActionListener  {
    JTextField use_name,f_name,l_name,ema,phone;
    long random;
            JPasswordField Password;
            JRadioButton male,female;
            JButton next,dashboard;
//           String form;

   exam()
    {
         Random ran=new Random();
         random=Math.abs((ran.nextLong()%9000L)+1000L);
        //for layout of the box
        getContentPane().setBackground(Color.BLACK);
        setVisible(true);
        setLayout(null);
        setSize(850,500);
        setLocation(350,200);
        //end of the layout
        //for the heading
        JLabel text=new JLabel("Update Your Account and Password");
        text.setBounds(150,10,600,30);
        text.setForeground(Color.MAGENTA);
        text.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,30));
        add(text);
//

        //ending the heading
        //creation of name label
        JLabel username=new JLabel("Username");
        username.setBounds(100,100,200,30);
        username.setForeground(Color.ORANGE);
        add(username);
        username.setFont(new Font("Osward",Font.PLAIN,20));

        //creation of password
        JLabel password1=new JLabel("Password");
        password1.setBounds(100,150,200,30);
        password1.setForeground(Color.ORANGE);
        add(password1);
        password1.setFont(new Font("Osward",Font.PLAIN,20));

        //firstname
        JLabel fname=new JLabel("First Name");
        fname.setBounds(100,200,200,30);
        fname.setForeground(Color.ORANGE);
        add(fname);
        fname.setFont(new Font("Osward",Font.PLAIN,20));

        //lastname
        JLabel lname=new JLabel("Last Name");
        lname.setBounds(100,250,200,30);
        lname.setForeground(Color.ORANGE);
        add(lname);
        lname.setFont(new Font("Osward",Font.PLAIN,20));

      
        JLabel gender=new JLabel("Gender ");
        gender.setBounds(100,300,200,30);
        gender.setForeground(Color.ORANGE);
        add(gender);
        gender.setFont(new Font("Osward",Font.PLAIN,20));
        //mobile number
        JLabel mobile=new JLabel("Mobile Number");
        mobile.setBounds(100,350,200,30);
        mobile.setForeground(Color.ORANGE);
        add(mobile);
        mobile.setFont(new Font("Osward",Font.PLAIN,20));
        //email address
        JLabel email=new JLabel("Email");
        email.setBounds(100,400,200,30);
        email.setForeground(Color.ORANGE);
        add(email);
        email.setFont(new Font("Osward",Font.PLAIN,20));
//textfields
        //textfield for username
        use_name=new JTextField();
        use_name.setBounds(300,100,300,30);
        use_name.setBackground(Color.LIGHT_GRAY);
        add(use_name);

        //password field
      Password=new JPasswordField();
        Password.setBounds(300,150,300,30);
        Password.setBackground(Color.lightGray);
        add(Password);
        //fname field
      f_name=new JTextField();
        f_name.setBounds(300,200,300,30);
        f_name.setBackground(Color.LIGHT_GRAY);
        add(f_name);
        //lname field
        l_name=new JTextField();
        l_name.setBounds(300,250,300,30);
        l_name.setBackground(Color.LIGHT_GRAY);
        add(l_name);
        //emailFiled
        ema=new JTextField();
        ema.setBounds(300,400,300,30);
        ema.setBackground(Color.LIGHT_GRAY);
        add(ema);
        //mobilefield
       phone=new JTextField();
        phone.setBounds(300,350,300,30);
        phone.setBackground(Color.LIGHT_GRAY);
        add(phone);
        //radio button
         male=new JRadioButton("Male");
        male.setBounds(310,300,100,30);
        male.setBackground(Color.LIGHT_GRAY);
        add(male);
        female=new JRadioButton("Female");
        female.setBounds(450,300,100,30);
        female.setBackground(Color.LIGHT_GRAY);
        add(female);
        ButtonGroup group=new ButtonGroup();
        group.add(male);
        group.add(female);
         next=new JButton("Update");
        next.setBackground(Color.cyan);
        next.setBounds(500,470,170,30);
        next.setForeground(Color.BLACK);
       next.addActionListener(this);
        add(next);
         dashboard=new JButton("Back");
        dashboard.setBackground(Color.cyan);
        dashboard.setBounds(300,470,170,30);
        dashboard.setForeground(Color.BLACK);
       dashboard.addActionListener(this);
        add(dashboard);



    }
    public void actionPerformed(ActionEvent ae){
//         form=""+random;
        String usename=use_name.getText();
        char[] password=Password.getPassword();
        String fname=f_name.getText();
        String lname=l_name.getText();
        String emai=ema.getText();
        String phon=phone.getText();
        String gender=null;
        if(male.isSelected())
        {
            gender="male";
        }else if(female.isSelected())
        {
            gender="female";
        }
      if(ae.getSource()==next)
        {
            if(usename.equals("")||password.equals("")||fname.equals("")||lname.equals("")||emai.equals("")||phon.equals("")||gender.equals(""))
            {
            JOptionPane.showMessageDialog(null, "All Details are Required");
            
            }
            else
            {
                 JOptionPane.showMessageDialog(null, "your details has been updated successfully");
            }
   
    
    }
      else if(ae.getSource()==dashboard)
        {
            
            
    setVisible(false);
    new loginform().setVisible(true);
    
    }
      
      
        

    }

public static void main(String args[]) {

   new exam();

    }
}
    
