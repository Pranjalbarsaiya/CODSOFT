
package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {
    
    JButton rules,back;
    JTextField fname;
    
    Login() {
        
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        
        
        ImageIcon i1 =  new ImageIcon(ClassLoader.getSystemResource("Quizicons/login.jpg"));
        JLabel image =  new JLabel(i1);
        image.setBounds(0,0,600,500);
        add(image);
        
        JLabel heading = new JLabel("Great Visions");
        heading.setBounds(750,60,300,45);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD, 40));
        heading.setForeground(Color.WHITE);
        add(heading);
        
        JLabel name = new JLabel("Enter Your Name");
        name.setBounds(810,150,300,20);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD, 18));
        name.setForeground(Color.WHITE);
        add(name);
        
        fname = new JTextField();
        fname.setBounds(735, 200, 300, 25);
        fname.setFont(new Font("Times New Roman",Font.BOLD,20)); 
        add(fname);
        
        rules = new JButton("Rules");
        rules.setBounds(735,270,120,25);
        rules.setBackground(Color.BLUE);
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        
        
        back = new JButton("Back");
        back.setBounds(915,270,125,25);
        back.setBackground(Color.BLUE);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        
        setSize(1200, 500);
        setLocation(200,150);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == rules){
            String name = fname.getText();
            setVisible(false);
           new Rules(name);
        } else if (ae.getSource() == back){
            setVisible(false);
        }
    }
    public static void main(String[]args){
        new Login();
    }
    
}
