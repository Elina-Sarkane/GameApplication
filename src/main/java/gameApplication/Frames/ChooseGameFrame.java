package gameApplication.Frames;

import pacmanGame.PacManMain;
import pongGame.PongGameFrame;
import snakeGame.SnakeGameFrame;
import tictactoeGame.TicTacToe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChooseGameFrame extends JFrame implements ActionListener{

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
        tictactoeButton.setFont(new Font("Calibri", Font.BOLD,20));
        tictactoeButton.setBackground(new Color(225, 220, 96));
        tictactoeButton.setBorder(BorderFactory.createBevelBorder(0));

        pongButton = new JButton();
        pongButton.setBounds(100, 110, 250, 50);
        pongButton.addActionListener(this);
        pongButton.setText("PONG GAME");
        pongButton.setFocusable(false);
        pongButton.setFont(new Font("Calibri", Font.BOLD,20));
        pongButton.setBackground(new Color(225, 220, 96));
        pongButton.setBorder(BorderFactory.createBevelBorder(0));

        snakeButton = new JButton();
        snakeButton.setBounds(100, 190, 250, 50);
        snakeButton.addActionListener(this);
        snakeButton.setText("SNAKE GAME");
        snakeButton.setFocusable(false);
        snakeButton.setFont(new Font("Calibri", Font.BOLD,20));
        snakeButton.setBackground(new Color(225, 220, 96));
        snakeButton.setBorder(BorderFactory.createBevelBorder(0));

        pacmanButton = new JButton();
        pacmanButton.setBounds(100, 270, 250, 50);
        pacmanButton.addActionListener(this);
        pacmanButton.setText("PAC-MAN GAME");
        pacmanButton.setFocusable(false);
        pacmanButton.setFont(new Font("Calibri", Font.BOLD,20));
        pacmanButton.setBackground(new Color(225, 220, 96));
        pacmanButton.setBorder(BorderFactory.createBevelBorder(0));

        backButton = new JButton();
        backButton.setBounds(100, 350, 250, 50);
        backButton.addActionListener(this);
        backButton.setText("GO BACK");
        backButton.setFocusable(false);
        backButton.setFont(new Font("Calibri", Font.BOLD,20));
        backButton.setBackground(new Color(225, 220, 96));
        backButton.setBorder(BorderFactory.createBevelBorder(0));

        exitButton = new JButton();
        exitButton.setBounds(100, 430, 250, 50);
        exitButton.addActionListener(this);
        exitButton.setText("EXIT");
        exitButton.setFocusable(false);
        exitButton.setFont(new Font("Calibri", Font.BOLD,20));
        exitButton.setBackground(new Color(225, 220, 96));
        exitButton.setBorder(BorderFactory.createBevelBorder(0));

        this.setTitle("Choose games!");
        ImageIcon chooseGameImage = new ImageIcon("menuImage.png");
        this.setIconImage(chooseGameImage.getImage());
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(151, 186, 213));
        this.setLayout(null);
        this.setSize(450, 550);
        this.setVisible(true);
        this.add(tictactoeButton);
        this.add(pongButton);
        this.add(snakeButton);
        this.add(pacmanButton);
        this.add(backButton);
        this.add(exitButton);
    }

   @Override
    public void actionPerformed(ActionEvent e) {
       if (e.getSource() == tictactoeButton) {
           // chooseGameFrame.dispose();
           TicTacToe tictactoe = new TicTacToe();
       } else if (e.getSource() == pongButton) {
           PongGameFrame pongGameFrame = new PongGameFrame();
       } else if (e.getSource() == snakeButton) {
           SnakeGameFrame snakeGameFrame = new SnakeGameFrame();
       } else if (e.getSource() == pacmanButton) {
           PacManMain pacmanMain = new PacManMain();
           pacmanMain.setVisible(true);
           pacmanMain.setTitle("Pacman");
           pacmanMain.setSize(380, 420);
           pacmanMain.setDefaultCloseOperation(EXIT_ON_CLOSE);
           pacmanMain.setLocationRelativeTo(null);
       }else if(e.getSource() == backButton){

       }else {
           System.exit(0);
       }
    }

}
//this.add(chooseGameLabel);
//this.setTitle("Choose Game!");

//this.setResizable(false);

       /* new JLabel();
        chooseGameLabel.setVisible(true);
        chooseGameLabel.setText("CHOOSE GAME!");
        chooseGameLabel.setHorizontalAlignment(JLabel.CENTER);
        chooseGameLabel.setVerticalAlignment(JLabel.TOP);
        chooseGameLabel.setForeground(new Color(0, 0, 0));
        chooseGameLabel.setFont(new Font("Colibry", Font.BOLD, 25));

        ImageIcon chooseGameImage = new ImageIcon("menuImage.png");
        chooseGameFrame.setIconImage(chooseGameImage.getImage());
        chooseGameFrame.getContentPane().setBackground(new Color(51, 153, 255));*/

