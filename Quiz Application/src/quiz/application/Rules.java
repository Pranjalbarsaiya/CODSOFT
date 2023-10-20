package quiz.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;


public class Rules extends JFrame implements ActionListener {
    
    String name;
    JButton start,back;
    
    Rules(String name) {
        
        this.name = name;
        getContentPane(). setBackground(Color.BLACK);
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome " + name + " to Great Visions");
        heading.setBounds(50,40,700,30);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD, 28));
        heading.setForeground(Color.WHITE);
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(20,30,700,350);
        rules.setFont(new Font("Tahoma",Font.PLAIN, 16));
        rules.setForeground(Color.RED);
        rules.setText(
                "<html>"+
                "1. You may have lot of options in life but here all the questions are compulsory."+ "<br><br>" +
                "2. You are trained to be a programmer and not a story teller, answer point to point."+ "<br><br>"+
                "<html>"
        );
        add(rules);
        
        ImageIcon i1 =  new ImageIcon(ClassLoader.getSystemResource("Quizicons/rules.jpg"));
        JLabel image =  new JLabel(i1);
        image.setBounds(0,0,750,700);
        add(image);
        
        start = new JButton("Start");
        start.setBounds(400,500,100,30);
        start.setBackground(Color.BLUE);
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        
        back = new JButton("Back");
        back.setBounds(250,500,100,30);
        back.setBackground(Color.BLUE);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        
        setSize(800,650);
        setLocation(350,100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == start){
            setVisible(false);
            new Quiz(name);
            
        } else {
            setVisible(false);
            new Login();
        }
    }
    public static void main(String[] args) {
         new Rules("User");
    }
    
}
