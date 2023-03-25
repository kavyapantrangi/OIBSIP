/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examination;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author bobby
 */
public class report extends JFrame implements ActionListener {
    int marks;
     JButton  logout;
    report( int marks)
    {
        this.marks=marks;
         setVisible(true);
         setTitle("result");
        setBounds(50,0,1000,860);
        setLayout(null);
        JLabel j1=new JLabel("Your Exam has been completed Successfully!!!");
        j1.setBounds(150,50,1000,50);
        j1.setFont(new Font("raleway",Font.ITALIC,25));
        add(j1);
        JLabel j2=new JLabel("your Score is"+" "+marks);
        j2.setBounds(150,100,1000,50);
        j2.setFont(new Font("raleway",Font.ITALIC,25));
        add(j2);
        //button
       logout=new JButton("LogOut");
       logout.setForeground(Color.blue);
       logout.setBackground(Color.WHITE);
      logout.setBounds(300,400,200,40);
       logout.setFont(new Font("Osward",Font.PLAIN,20));
        logout.addActionListener(this);
        add(logout); 
        
    }
    public void actionPerformed(ActionEvent ae)
    {
    if(ae.getSource()==logout)
    {
        setVisible(false);
        new loginform().setVisible(true);
    }
    }
    public static void main(String[] args)
    {
        new report(0);
    }
    
}
