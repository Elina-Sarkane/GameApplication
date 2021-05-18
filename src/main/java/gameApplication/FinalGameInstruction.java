package gameApplication;

import gameApplication.Frames.InstructionGameFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FinalGameInstruction extends JFrame implements ActionListener {

   JFrame instructionFrame;
   JPanel instructionPanel;
   JButton backButton;
   JButton exitButton;

   public FinalGameInstruction() {

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

      instructionPanel = new JPanel();


      instructionFrame = new JFrame();
      instructionFrame.setTitle("Tic-Tac-Toe game instruction!");
      ImageIcon chooseGameImage = new ImageIcon("menuImage.png");
      instructionFrame.setIconImage(chooseGameImage.getImage());
      instructionFrame.setResizable(false);
      instructionFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      instructionFrame.getContentPane().setBackground(new Color(151, 186, 213));
      instructionFrame.setLayout(null);
      instructionFrame.setSize(450, 550);
      instructionFrame.setVisible(true);
      instructionFrame.add(backButton);
      instructionFrame.add(exitButton);

   }
   @Override
   public void actionPerformed(ActionEvent e) {
      if(e.getSource() == backButton){
         instructionFrame.dispose();
         InstructionGameFrame instructionGameFrame = new InstructionGameFrame();
      }else {
         System.exit(0);
      }
   }




   void tictactoeInstruction(){
      System.out.println("Tic Tac Toe instruction");
      System.out.println("The game is played on a 3x3 grid" +
              "Player one is X, and player two is Y" +
              "The first who gets 3 of his marks in a row (up, down, diagonally) is the winner" +
      "When all squares are full, game is over");
   }

   void pongInstruction() {
      System.out.println("Pong instruction");
      System.out.println("The game principles is similar as in real life ping pong game." +
              "Player 1 is BLUE, you can move it by pressing W (goes up) and S (goes down) on your keyboard. " +
              "Player 2 ir RED, you can move it by pressing UP and DOWN keys on your keyboard." +
              "Every player gets a point if it doesn't miss the ball");
   }
   void snakeInstruction(){
      System.out.println("Snake instruction");
      System.out.println("In this game the player controls a snake." +
              "The objective is to eat as many apples as possible. Each time the snake eats an apple its body grows." +
              "The snake must avoid all walls and its own body." +
              "You can control the snake with the cursor keys - UP, DOWN, LEFT and RIGHT" +
              "If the game is finished, the GAME OVER message is displayed in the middle of the board.");
   }

   void pacmanInstruction(){
      System.out.println("Pacman instruction");
      System.out.println("Guide Pacman around the maze and eat all the little dots whilst avoiding ghosts." +
              "You can start the game by pressing SPACE on your keyboard and control Pacman with cursor keys." +
              "Pacman has 3 lives, each time a ghost catches you, you'll loose one live (displayed as red hearts in the bottom of the board." +
              "You'll be offered to start a new game right after you loose all your lives.");
   }


}
