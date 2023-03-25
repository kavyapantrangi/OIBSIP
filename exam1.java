/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examination;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;


public class exam1 extends JFrame implements ActionListener {
    JLabel qno,question;
    JRadioButton o1,o2,o3,o4;
    public static int timer=60;
    public static int ans=0;
    ButtonGroup groupoptions;
    String testans[][]=new String[10][1];
    
    String questions[][]=new String[10][5];
    String answers[][]=new String[10][2];
    public static int i=0;
    public static int marks=0;
//    String username;
    JButton submit,nextq;
    exam1()
    {
//        this.username=username;
        setVisible(true);
        setBounds(50,0,1000,860);
        setLayout(null);
       qno=new JLabel("1");
        qno.setBounds(100,100,50,30);
        qno.setFont(new Font("Tahoma",Font.PLAIN,24));
        add(qno);
        question =new JLabel();
         question.setBounds(130,100,1500,30);
        question.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(question);
        
        questions[0][0] = " Which of the following option leads to the portability and security of Java?";

        questions[0][1] ="Bytecode is executed by JVM";
        questions[0][2] ="The applet makes the Java code secure and portable";
        questions[0][3] ="Use of exception handling";
        questions[0][4] ="Dynamic binding between objects";

        questions[1][0] = "Which of the following is not a Java features?";
        questions[1][1] ="Dynamic";
        questions[1][2] ="Architecture Neutral";
        questions[1][3] ="Use of pointers";
        questions[1][4] ="Object-oriented";
        
       questions[2][0] = "_____ is used to find and fix bugs in the Java programs.";
       questions[2][1] ="JVM";
       questions[2][2] ="JRE";
       questions[2][3] ="JDK";
       questions[2][4] ="JDB";

        questions[3][0] = "An interface with no fields or methods is known as?";
        questions[3][1] = "Runnable Interface";
        questions[3][2] = "Abstract Interface";
        questions[3][3] = "Marker Interface";
        questions[3][4] = "CharSequence Interface";

        questions[4][0] = " Which of the following is a valid long literal?";

        questions[4][1]="ABH8097";
        questions[4][2]="L990023";
        questions[4][3]="904423";
        questions[4][4]="0xnf029L";

        questions[5][0] = "Which of the following is a marker interface?";
        questions[5][1] = "Runnable interface";
        questions[5][2] = "Remote interface";
        questions[5][3] = "Readable interface";
        questions[5][4] = "Result interface";

        questions[6][0] ="Which of the following tool is used to generate API documentation in HTML format from doc comments in source code?";

        questions[6][1]="javap tool";
        questions[6][2]="javaw command";
        questions[6][3]="Javadoc tool";
        questions[6][4]="javah command";

        questions[7][0] = "In java, jar stands for?";
        questions[7][1] = "Java Archive Runner";
        questions[7][2] = "Java Archive";
        questions[7][3] = "Java Application Resource";
        questions[7][4] = "Java Application Runner";

        questions[8][0] = "Which of the following is a mutable class in java?";
        questions[8][1] = "java.lang.StringBuilder";
        questions[8][2] = "java.lang.Short";
        questions[8][3] = "java.lang.Byte";
        questions[8][4] = "java.lang.String";

        questions[9][0] =  "In which process, a local variable has the same name as one of the instance variables?";

        questions[9][1]="Serialization";
        questions[9][2]="Variable Shadowing";
        questions[9][3]="Abstraction";
        questions[9][4]="Multi-threading";
        //for answers
        answers[0][1] = "Bytecode is executed by JVM";
        answers[1][1] = "Use of pointers";
        answers[2][1] = "JDB";
        answers[3][1] = "Marker Interface";
        answers[4][1] = "0xnf029L";
        answers[5][1] = "Remote interface";
        answers[6][1] = "Javadoc tool";
        answers[7][1] = "Java Archive";
        answers[8][1] = "java.lang.StringBuilder";
        answers[9][1] = "Variable Shadowing";
         o1=new JRadioButton("a.");
        o1.setBounds(150,220,500,40);
        o1.setBackground(Color.white);
        o1.setFont(new Font("raleway",Font.BOLD,18));
        add(o1);
          o2=new JRadioButton("b.");
        o2.setBounds(150,300,500,40);
        o2.setBackground(Color.white);
        o2.setFont(new Font("raleway",Font.BOLD,18));
        add(o2);
       o3=new JRadioButton("c.");
        o3.setBounds(150,380,500,40);
        o3.setBackground(Color.white);
        o3.setFont(new Font("raleway",Font.BOLD,18));
        add(o3);
      o4=new JRadioButton("d.");
        o4.setBounds(150,460,500,40);
        o4.setBackground(Color.white);
        o4.setFont(new Font("raleway",Font.BOLD,18));
        add(o4);
     groupoptions=new ButtonGroup();
        groupoptions.add(o1);
        groupoptions.add(o2);
        groupoptions.add(o3);
        groupoptions.add(o4);
        
        nextq=new JButton("Next Question");
        nextq.setBounds(1000,500,200,50);
        nextq.setFont(new Font("Raleway",Font.CENTER_BASELINE,20));
        nextq.setBackground(new Color(100,70,46));
        nextq.setForeground(Color.WHITE);
        nextq.addActionListener(this);
add(nextq);
 submit=new JButton("Submit");
        submit.setBounds(1000,300,200,50);
        submit.setFont(new Font("Raleway",Font.CENTER_BASELINE,20));
        submit.setBackground(new Color(100,70,46));
        submit.setForeground(Color.WHITE);
         submit.addActionListener(this);
         submit.setEnabled(false);
add(submit);
start(i);
setVisible(true);
                
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==nextq)
        {
            repaint();
            
            o1.setEnabled(true);
             o2.setEnabled(true);
              o3.setEnabled(true);
               o4.setEnabled(true);
            ans=1; 
        if(groupoptions.getSelection()==null)
        {
           testans[i][0]="";    
        }
        else
        {
         testans[i][0]=groupoptions.getSelection().getActionCommand();
        }
        if(i==8)
        {
            nextq.setEnabled(false);
            submit.setEnabled(true);
        }
            i++;
            start(i);
        
        }
        else if(ae.getSource()==submit)
        {
            ans=1;
           if(groupoptions.getSelection()==null)
           {
           testans[i][0]="";    
           }
        else
        {
         testans[i][0]=groupoptions.getSelection().getActionCommand();
        }
            for(int j=0;j<testans.length;j++)
            {
                if(testans[j][0].equals(answers[j][1]))
                {
                    marks+=10;
                }
                else
                {
                    marks+=0;
                }
            }
            setVisible(false);
            new report(marks);
            
            
            
    }
        
    }
    
    public void paint(Graphics g)
    {
        super.paint(g);
        String time="Time left:"+timer+"seconds";//15
        g.setColor(Color.red);
        g.setFont(new Font("raleway",Font.BOLD,25));
        if(timer>0)
        {
            g.drawString(time, 900, 200);
        }
        else
        {
            g.drawString("Times up!!",900,200);
        }
        timer--;
        try
        {
            Thread.sleep(1000);
            repaint();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        if(ans==1)
        {
            ans=0;
            timer=60;
        }
        else if(timer<0)
        {
        timer=60;
        o1.setEnabled(true);
        o2.setEnabled(true);
        o3.setEnabled(true);
        o4.setEnabled(true);
        if(i==8)
        {
            nextq.setEnabled(false);
            submit.setEnabled(true);
        }
        
        
        if(i==9)
        {
            if(groupoptions.getSelection()==null)
        {
           testans[i][0]="";    
        }
        else
        {
         testans[i][0]=groupoptions.getSelection().getActionCommand();
        }
            for(int j=0;j<testans.length;j++)
            {
                if(testans[j][0].equals(answers[j][1]))
                {
                    marks+=10;
                }
                else
                {
                    marks+=0;
                }
            }
            setVisible(false);
            new report(marks);
        
        }
       
        
        else
        {
        
        
        //under else
        if(groupoptions.getSelection()==null)
        {
           testans[i][0]="";    
        }
        else
        {
         testans[i][0]=groupoptions.getSelection().getActionCommand();
        }
        
        i++;
        start(i);
        }
    }
    }
    public void  start(int i){
        qno.setText(""+(i+1)+".");
        question.setText(questions[i][0]);
       
        o1.setText(questions[i][1]);
         o1.setActionCommand(questions[i][1]);
        o2.setText(questions[i][2]);
         o2.setActionCommand(questions[i][2]);
        o3.setText(questions[i][3]);
         o3.setActionCommand(questions[i][3]);
        o4.setText(questions[i][4]);
         o4.setActionCommand(questions[i][4]);
         groupoptions.clearSelection();
               
        
        
    }
    public static void main(String args[])
    {
        new exam1();
    }
    
}
