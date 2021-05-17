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

    public ChooseGameFrame() {

        tictactoeButton = new JButton();
        tictactoeButton.setBounds(100, 100, 300, 50);
        tictactoeButton.addActionListener(this);
        tictactoeButton.setText("TIC-TAC-TOE GAME");
        tictactoeButton.setFocusable(false);
        tictactoeButton.setFont(new Font("Calibri", Font.BOLD,20));
        //tictactoeButton.setHorizontalAlignment(JButton.CENTER);
        //tictactoeButton.setVerticalAlignment();

        pongButton = new JButton();
        pongButton.setBounds(100, 200, 300, 50);
        pongButton.addActionListener(this);
        pongButton.setText("PONG GAME");
        pongButton.setFocusable(false);
        pongButton.setFont(new Font("Calibri", Font.BOLD,20));

        snakeButton = new JButton();
        snakeButton.setBounds(100, 300, 300, 50);
        snakeButton.addActionListener(this);
        snakeButton.setText("SNAKE GAME");
        snakeButton.setFocusable(false);
        snakeButton.setFont(new Font("Calibri", Font.BOLD,20));

        pacmanButton = new JButton();
        pacmanButton.setBounds(100, 400, 300, 50);
        pacmanButton.addActionListener(this);
        pacmanButton.setText("PAC-MAN GAME");
        pacmanButton.setFocusable(false);
        pacmanButton.setFont(new Font("Calibri", Font.BOLD,20));

        exitButton = new JButton();
        exitButton.setBounds(100, 500, 300, 50);
        exitButton.addActionListener(this);
        exitButton.setText("EXIT");
        exitButton.setFocusable(false);
        exitButton.setFont(new Font("Calibri", Font.BOLD,20));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(520, 700);
        this.setVisible(true);
        this.add(tictactoeButton);
        this.add(pongButton);
        this.add(snakeButton);
        this.add(pacmanButton);
        this.add(exitButton);
    }

   @Override
    public void actionPerformed(ActionEvent e) {
       if (e.getSource() == tictactoeButton) {
           // chooseGameFrame.dispose();
           TicTacToe tictactoe = new TicTacToe();
        }else if (e.getSource() == pongButton){
           PongGameFrame pongGameFrame = new PongGameFrame();
       }else if (e.getSource() == snakeButton){
           SnakeGameFrame snakeGameFrame = new SnakeGameFrame();
       }else if (e.getSource() == pacmanButton){
           PacManMain pacmanMain = new PacManMain();
           pacmanMain.setVisible(true);
           pacmanMain.setTitle("Pacman");
           pacmanMain.setSize(380,420);
           pacmanMain.setDefaultCloseOperation(EXIT_ON_CLOSE);
           pacmanMain.setLocationRelativeTo(null);
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

