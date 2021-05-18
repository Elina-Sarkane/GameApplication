package gameApplication.Frames;

import gameApplication.FinalGameInstruction;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InstructionGameFrame extends JFrame implements ActionListener {

    JFrame instructionGameFrame;
    JButton tictactoeButton;
    JButton pongButton;
    JButton snakeButton;
    JButton pacmanButton;
    JButton exitButton;
    JButton backButton;

    public InstructionGameFrame() {

        tictactoeButton = new JButton();
        tictactoeButton.setBounds(100, 30, 250, 50);
        tictactoeButton.addActionListener(this);
        tictactoeButton.setText("TIC-TAC-TOE GAME");
        tictactoeButton.setFocusable(false);
        tictactoeButton.setFont(new Font("Calibri", Font.BOLD, 20));
        tictactoeButton.setBackground(new Color(225, 220, 96));
        tictactoeButton.setBorder(BorderFactory.createBevelBorder(0));

        pongButton = new JButton();
        pongButton.setBounds(100, 110, 250, 50);
        pongButton.addActionListener(this);
        pongButton.setText("PONG GAME");
        pongButton.setFocusable(false);
        pongButton.setFont(new Font("Calibri", Font.BOLD, 20));
        pongButton.setBackground(new Color(225, 220, 96));
        pongButton.setBorder(BorderFactory.createBevelBorder(0));

        snakeButton = new JButton();
        snakeButton.setBounds(100, 190, 250, 50);
        snakeButton.addActionListener(this);
        snakeButton.setText("SNAKE GAME");
        snakeButton.setFocusable(false);
        snakeButton.setFont(new Font("Calibri", Font.BOLD, 20));
        snakeButton.setBackground(new Color(225, 220, 96));
        snakeButton.setBorder(BorderFactory.createBevelBorder(0));

        pacmanButton = new JButton();
        pacmanButton.setBounds(100, 270, 250, 50);
        pacmanButton.addActionListener(this);
        pacmanButton.setText("PAC-MAN GAME");
        pacmanButton.setFocusable(false);
        pacmanButton.setFont(new Font("Calibri", Font.BOLD, 20));
        pacmanButton.setBackground(new Color(225, 220, 96));
        pacmanButton.setBorder(BorderFactory.createBevelBorder(0));

        backButton = new JButton();
        backButton.setBounds(100, 350, 250, 50);
        backButton.addActionListener(this);
        backButton.setText("GO BACK");
        backButton.setFocusable(false);
        backButton.setFont(new Font("Calibri", Font.BOLD, 20));
        backButton.setBackground(new Color(225, 220, 96));
        backButton.setBorder(BorderFactory.createBevelBorder(0));

        exitButton = new JButton();
        exitButton.setBounds(100, 430, 250, 50);
        exitButton.addActionListener(this);
        exitButton.setText("EXIT");
        exitButton.setFocusable(false);
        exitButton.setFont(new Font("Calibri", Font.BOLD, 20));
        exitButton.setBackground(new Color(225, 220, 96));
        exitButton.setBorder(BorderFactory.createBevelBorder(0));

        instructionGameFrame = new JFrame();
        instructionGameFrame.setTitle("Game Instructions!");
        ImageIcon chooseGameImage = new ImageIcon("menuImage.png");
        instructionGameFrame.setIconImage(chooseGameImage.getImage());
        instructionGameFrame.setResizable(false);
        instructionGameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        instructionGameFrame.getContentPane().setBackground(new Color(151, 186, 213));
        instructionGameFrame.setLayout(null);
        instructionGameFrame.setSize(450, 550);
        instructionGameFrame.setVisible(true);
        instructionGameFrame.add(tictactoeButton);
        instructionGameFrame.add(pongButton);
        instructionGameFrame.add(snakeButton);
        instructionGameFrame.add(pacmanButton);
        instructionGameFrame.add(backButton);
        instructionGameFrame.add(exitButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == tictactoeButton) {
            instructionGameFrame.dispose();
            FinalGameInstruction finalGameInstruction = new FinalGameInstruction();
        } else if (e.getSource() == pongButton) {
            instructionGameFrame.dispose();
            //pong instruction
        } else if (e.getSource() == snakeButton) {
            instructionGameFrame.dispose();
            //snake instruction
        } else if (e.getSource() == pacmanButton) {
            instructionGameFrame.dispose();
            //pacman instruction
        } else if (e.getSource() == backButton) {
            instructionGameFrame.dispose();
            GameMenuFrame gameMenuFrame = new GameMenuFrame();
        } else {
            System.exit(0);
        }
    }
}
