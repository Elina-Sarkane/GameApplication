package gameApplication.frames;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChooseGameFrame extends JFrame implements ActionListener{

    JFrame chooseGameFrame;
    JButton tictactoeButton;
    JButton pongButton;
    JButton snakeButton;
    JButton pacmanButton;
    JButton exitButton;
    JButton backButton;

    public ChooseGameFrame() {

        tictactoeButton = new JButton();
        tictactoeButton.setBounds(100, 30, 250, 50);
        tictactoeButton.addActionListener(this);
        tictactoeButton.setText("TIC-TAC-TOE GAME");
        tictactoeButton.setFocusable(false);
        tictactoeButton.setFont(new Font("Calibre", Font.BOLD,20));
        tictactoeButton.setBackground(new Color(225, 220, 96));
        tictactoeButton.setBorder(BorderFactory.createBevelBorder(0));

        pongButton = new JButton();
        pongButton.setBounds(100, 110, 250, 50);
        pongButton.addActionListener(this);
        pongButton.setText("PONG GAME");
        pongButton.setFocusable(false);
        pongButton.setFont(new Font("Calibre", Font.BOLD,20));
        pongButton.setBackground(new Color(225, 220, 96));
        pongButton.setBorder(BorderFactory.createBevelBorder(0));

        snakeButton = new JButton();
        snakeButton.setBounds(100, 190, 250, 50);
        snakeButton.addActionListener(this);
        snakeButton.setText("SNAKE GAME");
        snakeButton.setFocusable(false);
        snakeButton.setFont(new Font("Calibre", Font.BOLD,20));
        snakeButton.setBackground(new Color(225, 220, 96));
        snakeButton.setBorder(BorderFactory.createBevelBorder(0));

        pacmanButton = new JButton();
        pacmanButton.setBounds(100, 270, 250, 50);
        pacmanButton.addActionListener(this);
        pacmanButton.setText("PAC-MAN GAME");
        pacmanButton.setFocusable(false);
        pacmanButton.setFont(new Font("Calibre", Font.BOLD,20));
        pacmanButton.setBackground(new Color(225, 220, 96));
        pacmanButton.setBorder(BorderFactory.createBevelBorder(0));

        backButton = new JButton();
        backButton.setBounds(100, 350, 250, 50);
        backButton.addActionListener(this);
        backButton.setText("GO BACK");
        backButton.setFocusable(false);
        backButton.setFont(new Font("Calibre", Font.BOLD,20));
        backButton.setBackground(new Color(225, 220, 96));
        backButton.setBorder(BorderFactory.createBevelBorder(0));

        exitButton = new JButton();
        exitButton.setBounds(100, 430, 250, 50);
        exitButton.addActionListener(this);
        exitButton.setText("EXIT");
        exitButton.setFocusable(false);
        exitButton.setFont(new Font("Calibre", Font.BOLD,20));
        exitButton.setBackground(new Color(225, 220, 96));
        exitButton.setBorder(BorderFactory.createBevelBorder(0));

        chooseGameFrame = new JFrame();
        chooseGameFrame.setTitle("Choose games!");
        ImageIcon chooseGameImage = new ImageIcon("menuImage.png");
        chooseGameFrame.setIconImage(chooseGameImage.getImage());
        chooseGameFrame.setResizable(false);
        chooseGameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        chooseGameFrame.getContentPane().setBackground(new Color(151, 186, 213));
        chooseGameFrame.setLayout(null);
        chooseGameFrame.setSize(450, 550);
        chooseGameFrame.setVisible(true);
        chooseGameFrame.add(tictactoeButton);
        chooseGameFrame.add(pongButton);
        chooseGameFrame.add(snakeButton);
        chooseGameFrame.add(pacmanButton);
        chooseGameFrame.add(backButton);
        chooseGameFrame.add(exitButton);
    }

   @Override
    public void actionPerformed(ActionEvent e) {
       if (e.getSource() == tictactoeButton) {
           chooseGameFrame.dispose();
           TictactoeGameFrame tictactoeGameFrame = new TictactoeGameFrame();
       } else if (e.getSource() == pongButton) {
           chooseGameFrame.dispose();
           PongGameFrame pongGameFrame = new PongGameFrame();
       } else if (e.getSource() == snakeButton) {
           chooseGameFrame.dispose();
           SnakeGameFrame snakeGameFrame = new SnakeGameFrame();
       } else if (e.getSource() == pacmanButton) {
           chooseGameFrame.dispose();
           PacmanGameFrame pacmanGameFrame = new PacmanGameFrame();
       }else if(e.getSource() == backButton){
           chooseGameFrame.dispose();
           GameMenuFrame gameMenuFrame = new GameMenuFrame();
       }else {
           System.exit(0);
       }
    }
}

