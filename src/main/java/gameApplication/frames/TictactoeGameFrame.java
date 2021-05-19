package gameApplication.frames;

import tictactoeGame.TicTacToe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TictactoeGameFrame extends JFrame implements ActionListener {

    JFrame tictactoeFrame;
    JButton newGameButton;
    JButton instructionButton;
    JButton backButton;
    JButton exitButton;


    public TictactoeGameFrame() {

        newGameButton = new JButton();
        newGameButton.setBounds(100, 30, 250, 50);
        newGameButton.addActionListener(this);
        newGameButton.setText("NEW GAME");
        newGameButton.setFocusable(false);
        newGameButton.setFont(new Font("Calibre", Font.BOLD,20));
        newGameButton.setBackground(new Color(225, 220, 96));
        newGameButton.setBorder(BorderFactory.createBevelBorder(0));

        instructionButton = new JButton();
        instructionButton.setBounds(100, 110, 250, 50);
        instructionButton.addActionListener(this);
        instructionButton.setText("INSTRUCTION");
        instructionButton.setFocusable(false);
        instructionButton.setFont(new Font("Calibre", Font.BOLD,20));
        instructionButton.setBackground(new Color(225, 220, 96));
        instructionButton.setBorder(BorderFactory.createBevelBorder(0));

        backButton = new JButton();
        backButton.setBounds(100, 190, 250, 50);
        backButton.addActionListener(this);
        backButton.setText("GO BACK");
        backButton.setFocusable(false);
        backButton.setFont(new Font("Calibre", Font.BOLD,20));
        backButton.setBackground(new Color(225, 220, 96));
        backButton.setBorder(BorderFactory.createBevelBorder(0));

        exitButton = new JButton();
        exitButton.setBounds(100, 270, 250, 50);
        exitButton.addActionListener(this);
        exitButton.setText("EXIT");
        exitButton.setFocusable(false);
        exitButton.setFont(new Font("Calibre", Font.BOLD,20));
        exitButton.setBackground(new Color(225, 220, 96));
        exitButton.setBorder(BorderFactory.createBevelBorder(0));

        tictactoeFrame = new JFrame();
        tictactoeFrame.setTitle("Tic-Tac-Toe game!");
        ImageIcon chooseGameImage = new ImageIcon("menuImage.png");
        tictactoeFrame.setIconImage(chooseGameImage.getImage());
        tictactoeFrame.setResizable(false);
        tictactoeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tictactoeFrame.getContentPane().setBackground(new Color(151, 186, 213));
        tictactoeFrame.setLayout(null);
        tictactoeFrame.setSize(450, 550);
        tictactoeFrame.setVisible(true);
        tictactoeFrame.add(newGameButton);
        tictactoeFrame.add(instructionButton);
        tictactoeFrame.add(backButton);
        tictactoeFrame.add(exitButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == newGameButton) {
            tictactoeFrame.dispose();
            TicTacToe ticTacToe = new TicTacToe();
        }else if (e.getSource() == instructionButton){
            tictactoeFrame.dispose();
            tictactoeInstruction();
            TictactoeGameFrame tictactoeGameFrame = new TictactoeGameFrame();
        }else if(e.getSource() == backButton){
            tictactoeFrame.dispose();
            ChooseGameFrame chooseGameFrame = new ChooseGameFrame();
        }else {
            System.exit(0);
        }
    }

    void tictactoeInstruction() {
        ImageIcon tictactoe = new ImageIcon("tictactoeImage.png");
        JOptionPane.showMessageDialog(
                null,
                "The game is played on a 3x3 grid.\n" +
                        "Player one is X, and player two is O.\n" +
                        "The first who gets 3 of his marks in a row (up, down, diagonally) is the winner.\n" +
                        "When all squares are full, it's a tie and game is over.",
                "Tic-Tac-Toe Game Instruction!",
                JOptionPane.INFORMATION_MESSAGE,
                tictactoe
        );
    }
}
