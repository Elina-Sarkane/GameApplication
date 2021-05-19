package gameApplication.frames;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogInFrame extends JFrame implements ActionListener {

    JFrame logInFrame;
    JButton newUserButton;
    JButton existingUserButton;
    JButton scoresButton;
    JButton backButton;
    JButton exitButton;

    public LogInFrame(){

        newUserButton = new JButton();
        newUserButton.setBounds(100, 30, 250, 50);
        newUserButton.addActionListener(this);
        newUserButton.setText("NEW USER");
        newUserButton.setFocusable(false);
        newUserButton.setFont(new Font("Calibre", Font.BOLD,20));
        newUserButton.setBackground(new Color(225, 220, 96));
        newUserButton.setBorder(BorderFactory.createBevelBorder(0));

        existingUserButton = new JButton();
        existingUserButton.setBounds(100, 110, 250, 50);
        existingUserButton.addActionListener(this);
        existingUserButton.setText("EXISTING USER");
        existingUserButton.setFocusable(false);
        existingUserButton.setFont(new Font("Calibre", Font.BOLD,20));
        existingUserButton.setBackground(new Color(225, 220, 96));
        existingUserButton.setBorder(BorderFactory.createBevelBorder(0));

        scoresButton = new JButton();
        scoresButton.setBounds(100, 190, 250, 50);
        scoresButton.addActionListener(this);
        scoresButton.setText("SCORES");
        scoresButton.setFocusable(false);
        scoresButton.setFont(new Font("Calibre", Font.BOLD,20));
        scoresButton.setBackground(new Color(225, 220, 96));
        scoresButton.setBorder(BorderFactory.createBevelBorder(0));

        backButton = new JButton();
        backButton.setBounds(100, 270, 250, 50);
        backButton.addActionListener(this);
        backButton.setText("GO BACK");
        backButton.setFocusable(false);
        backButton.setFont(new Font("Calibre", Font.BOLD,20));
        backButton.setBackground(new Color(225, 220, 96));
        backButton.setBorder(BorderFactory.createBevelBorder(0));

        exitButton = new JButton();
        exitButton.setBounds(100, 350, 250, 50);
        exitButton.addActionListener(this);
        exitButton.setText("EXIT");
        exitButton.setFocusable(false);
        exitButton.setFont(new Font("Calibre", Font.BOLD,20));
        exitButton.setBackground(new Color(225, 220, 96));
        exitButton.setBorder(BorderFactory.createBevelBorder(0));

        logInFrame = new JFrame();
        logInFrame.setTitle("Log In Menu!");
        ImageIcon chooseGameImage = new ImageIcon("menuImage.png");
        logInFrame.setIconImage(chooseGameImage.getImage());
        logInFrame.setResizable(false);
        logInFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        logInFrame.getContentPane().setBackground(new Color(151, 186, 213));
        logInFrame.setLayout(null);
        logInFrame.setSize(450, 550);
        logInFrame.setVisible(true);
        logInFrame.add(newUserButton);
        logInFrame.add(existingUserButton);
        logInFrame.add(scoresButton);
        logInFrame.add(backButton);
        logInFrame.add(exitButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == newUserButton){
            logInFrame.dispose();
            //newUserFrame
        }else if(e.getSource() == existingUserButton){
            logInFrame.dispose();
            //existingUserFrame + database
        }else if(e.getSource() == scoresButton) {
            logInFrame.dispose();
            ScoresFrame scoresFrame = new ScoresFrame();
        }else if (e.getSource() == backButton){
            logInFrame.dispose();
            GameMenuFrame gameMenuFrame = new GameMenuFrame();
        }else {
            System.exit(0);
        }
    }

}
