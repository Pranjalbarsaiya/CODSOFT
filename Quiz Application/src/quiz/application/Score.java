
package quiz.application;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Score extends JFrame implements ActionListener {
    
    Score(String name,int score) {
        setBounds(400, 150, 750, 550);
        getContentPane().setBackground(Color.black);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Quizicons/scoreimg.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i1);
        image.setBounds(0, 100, 500, 300);
        add(image);

        JLabel heading = new JLabel("Thankyou " + name + " for Playing Great Visions !!");
        heading.setBounds(45, 30, 700, 30);
        heading.setFont(new Font("Times New Roman", Font.BOLD, 24));
        heading.setForeground(Color.white);
        add(heading);
        
        JLabel lblscore = new JLabel("Your score is " + score);
        lblscore.setBounds(500, 200, 300, 30);
        lblscore.setFont(new Font("Times New Roman", Font.BOLD, 24));
        lblscore.setForeground(Color.white);
        add(lblscore);
        
        JButton submit = new JButton("Play Again");
        submit.setBounds(500, 250, 180, 40);
        submit.setFont(new Font("Times New Roman", Font.PLAIN, 25));
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
        
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
        
    }
    
    public static void main(String[] args)  {
        new Score("User",0);
    }
    
}
