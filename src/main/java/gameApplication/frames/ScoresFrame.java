package gameApplication.frames;

import score.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScoresFrame extends JFrame implements ActionListener {

        JFrame scoresFrame;
        JButton tictactoeScoreButton;
        JButton pongScoreButton;
        JButton snakeScoreButton;
        JButton pacmanScoreButton;
        JButton backButton;
        JButton exitButton;

    public ScoresFrame(){

        tictactoeScoreButton = new JButton();
        tictactoeScoreButton.setBounds(100, 30, 250, 50);
        tictactoeScoreButton.addActionListener(this);
        tictactoeScoreButton.setText("TIC-TAC-TOE SCORES");
        tictactoeScoreButton.setFocusable(false);
        tictactoeScoreButton.setFont(new Font("Calibre", Font.BOLD,20));
        tictactoeScoreButton.setBackground(new Color(225, 220, 96));
        tictactoeScoreButton.setBorder(BorderFactory.createBevelBorder(0));

        pongScoreButton = new JButton();
        pongScoreButton.setBounds(100, 110, 250, 50);
        pongScoreButton.addActionListener(this);
        pongScoreButton.setText("PONG SCORES");
        pongScoreButton.setFocusable(false);
        pongScoreButton.setFont(new Font("Calibre", Font.BOLD,20));
        pongScoreButton.setBackground(new Color(225, 220, 96));
        pongScoreButton.setBorder(BorderFactory.createBevelBorder(0));

        snakeScoreButton = new JButton();
        snakeScoreButton.setBounds(100, 190, 250, 50);
        snakeScoreButton.addActionListener(this);
        snakeScoreButton.setText("SNAKE SCORES");
        snakeScoreButton.setFocusable(false);
        snakeScoreButton.setFont(new Font("Calibre", Font.BOLD,20));
        snakeScoreButton.setBackground(new Color(225, 220, 96));
        snakeScoreButton.setBorder(BorderFactory.createBevelBorder(0));

        pacmanScoreButton = new JButton();
        pacmanScoreButton.setBounds(100, 270, 250, 50);
        pacmanScoreButton.addActionListener(this);
        pacmanScoreButton.setText("PAC-MAN SCORES");
        pacmanScoreButton.setFocusable(false);
        pacmanScoreButton.setFont(new Font("Calibre", Font.BOLD,20));
        pacmanScoreButton.setBackground(new Color(225, 220, 96));
        pacmanScoreButton.setBorder(BorderFactory.createBevelBorder(0));

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
        exitButton.setText("EXIT");exitButton.setFocusable(false);
        exitButton.setFont(new Font("Calibre", Font.BOLD,20));
        exitButton.setBackground(new Color(225, 220, 96));
        exitButton.setBorder(BorderFactory.createBevelBorder(0));

        scoresFrame = new JFrame();
        scoresFrame.setTitle("Score Menu!");
        ImageIcon chooseGameImage = new ImageIcon("menuImage.png");
        scoresFrame.setIconImage(chooseGameImage.getImage());
        scoresFrame.setResizable(false);
        scoresFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        scoresFrame.getContentPane().setBackground(new Color(151, 186, 213));
        scoresFrame.setLayout(null);
        scoresFrame.setSize(450, 630);
        scoresFrame.setVisible(true);
        scoresFrame.add(tictactoeScoreButton);
        scoresFrame.add(pongScoreButton);
        scoresFrame.add(snakeScoreButton);
        scoresFrame.add(pacmanScoreButton);
        scoresFrame.add(backButton);
        scoresFrame.add(exitButton);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == tictactoeScoreButton){
                scoresFrame.dispose();
                TictactoeScore tictactoeScore = new TictactoeScore();
                ScoresFrame scoresFrame = new ScoresFrame();
            }else if(e.getSource() == pongScoreButton) {
                scoresFrame.dispose();
                PongScore pongScore = new PongScore();
                ScoresFrame scoresFrame = new ScoresFrame();
            }else if(e.getSource() == snakeScoreButton) {
                scoresFrame.dispose();
                SnakeScore snakeScore = new SnakeScore();
                ScoresFrame scoresFrame = new ScoresFrame();
            }else if(e.getSource() == pacmanScoreButton) {
                scoresFrame.dispose();
                PacmanScore pacmanScore = new PacmanScore();
                ScoresFrame scoresFrame = new ScoresFrame();
            }else if (e.getSource() == backButton){
                scoresFrame.dispose();
                GameMenuFrame gameMenuFrame = new GameMenuFrame();
            }else {
                System.exit(0);
            }
        }


    }
