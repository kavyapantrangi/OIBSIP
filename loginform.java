
package examination;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class loginform extends JFrame implements ActionListener {
    JButton start,Profile;
     JTextField name;
   JPasswordField Password;
   
    loginform()
    {
    
        setLayout(null);
      setVisible(true);
      setSize(700,400);
//      setLocation(350,90);

      getContentPane().setBackground(Color.black);
      ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("pics/exam.jpeg"));
        JLabel j1=new JLabel(i1);
        j1.setBounds(650,150,500,500);
        setVisible(true);
        add(j1);
                JLabel j2=new JLabel("Welcome to Online Examination ");
                j2.setBounds(130,100,700,60);
                j2.setForeground(Color.red);
             j2.setFont(new Font("Osward",Font.PLAIN,30));
                add(j2);
                 JLabel username=new JLabel("Username");

        username.setBounds(100,60,500,300);
          username.setForeground(Color.MAGENTA);
        add(username);
        username.setFont(new Font("Osward",Font.PLAIN,25));
         name=new JTextField();
        name.setBounds(310,190,200,30);
        name.setBackground(new Color(51,153,255));
        name.setFont(new Font("Osward",Font.PLAIN,25));
        
//        name.addActionListener(this);
        add(name);
        //pinnumber
        JLabel password1=new JLabel("Password");
        password1.setBounds(100,50,500,400);
        password1.setForeground(Color.MAGENTA);
        add(password1);
        password1.setFont(new Font("Osward",Font.PLAIN,25));
     Password=new JPasswordField();
        Password.setBounds(310,230,200,30);
        Password.setBackground(new Color(51,153,255));
        Password.setFont(new Font("Osward",Font.PLAIN,25));
//        Password.addActionListener(this);
        add(Password);
      start=new JButton("Start");
        start.setForeground(Color.blue);
        start.setBackground(Color.WHITE);
        start.setBounds(100,400,150,40);
        start.setFont(new Font("Osward",Font.PLAIN,25));
        start.addActionListener(this);
        add(start);
        //goto profile
              Profile=new JButton("Go To Profile");
       Profile.setForeground(Color.blue);
       Profile.setBackground(Color.WHITE);
      Profile.setBounds(300,400,200,40);
       Profile.setFont(new Font("Osward",Font.PLAIN,20));
        Profile.addActionListener(this);
        add(Profile); 
        
//      setBounds();
    }
    public void actionPerformed(ActionEvent ae){
//         if(name.equals("")|| Password.equals(""));
//         {
//              JOptionPane.showMessageDialog(null, "your details has been updated successfully");
//         }
//         
//         
        
        if(ae.getSource()==Profile)
        {
 if(Password.equals(null)|| name.equals(null)){
                 JOptionPane.showMessageDialog(null, "your details has been updated successfully");
 }else
 {
setVisible(false);
new exam().setVisible(true);
        }
        }
        else if(ae.getSource()==start)
        { 
            if(Password.equals(null)|| name.equals(null)){
                 JOptionPane.showMessageDialog(null, "your details has been updated successfully");
            }
            else
            {
            setVisible(false);
            new exam1().setVisible(true);
                }

        }          
    }
   public static void main(String args[])
    {
        new loginform();
    }
    
}
