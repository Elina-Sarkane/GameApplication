package gameApplication.frames;

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
        tictactoeButton.setFont(new Font("Calibre", Font.BOLD, 20));
        tictactoeButton.setBackground(new Color(225, 220, 96));
        tictactoeButton.setBorder(BorderFactory.createBevelBorder(0));

        pongButton = new JButton();
        pongButton.setBounds(100, 110, 250, 50);
        pongButton.addActionListener(this);
        pongButton.setText("PONG GAME");
        pongButton.setFocusable(false);
        pongButton.setFont(new Font("Calibre", Font.BOLD, 20));
        pongButton.setBackground(new Color(225, 220, 96));
        pongButton.setBorder(BorderFactory.createBevelBorder(0));

        snakeButton = new JButton();
        snakeButton.setBounds(100, 190, 250, 50);
        snakeButton.addActionListener(this);
        snakeButton.setText("SNAKE GAME");
        snakeButton.setFocusable(false);
        snakeButton.setFont(new Font("Calibre", Font.BOLD, 20));
        snakeButton.setBackground(new Color(225, 220, 96));
        snakeButton.setBorder(BorderFactory.createBevelBorder(0));

        pacmanButton = new JButton();
        pacmanButton.setBounds(100, 270, 250, 50);
        pacmanButton.addActionListener(this);
        pacmanButton.setText("PAC-MAN GAME");
        pacmanButton.setFocusable(false);
        pacmanButton.setFont(new Font("Calibre", Font.BOLD, 20));
        pacmanButton.setBackground(new Color(225, 220, 96));
        pacmanButton.setBorder(BorderFactory.createBevelBorder(0));

        backButton = new JButton();
        backButton.setBounds(100, 350, 250, 50);
        backButton.addActionListener(this);
        backButton.setText("GO BACK");
        backButton.setFocusable(false);
        backButton.setFont(new Font("Calibre", Font.BOLD, 20));
        backButton.setBackground(new Color(225, 220, 96));
        backButton.setBorder(BorderFactory.createBevelBorder(0));

        exitButton = new JButton();
        exitButton.setBounds(100, 430, 250, 50);
        exitButton.addActionListener(this);
        exitButton.setText("EXIT");
        exitButton.setFocusable(false);
        exitButton.setFont(new Font("Calibre", Font.BOLD, 20));
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

    void tictactoeInstruction() {
        ImageIcon tictactoe = new ImageIcon("tictactoeImage.png");
        JOptionPane.showMessageDialog(
                null,
                "The game is played on a 3x3 grid.\n" +
                        "Player one is X, and player two is O.\n" +
                        "The first who gets 3 of his marks in a row (up, down, diagonally) is the winner.\n" +
                        "When all squares are full, game is over.",
                "Tic-Tac-Toe Game Instruction!",
                JOptionPane.INFORMATION_MESSAGE,
                tictactoe
        );
    }
    void pongInstruction() {
        ImageIcon pong = new ImageIcon("pongImage.png");
        JOptionPane.showMessageDialog(
                null,
                "The game principles is similar as in real life ping pong game.\n" +
                        "Player 1 is BLUE, on the left side, move paddle by pressing W (goes up) and S (goes down) on your keyboard.\n" +
                        "Player 2 ir RED, on the right side, move paddle by pressing UP and DOWN keys on your keyboard.\n" +
                        "Every player gets a point if it doesn't miss the ball",
                "Pong Game Instruction!",
                JOptionPane.INFORMATION_MESSAGE,
                pong
        );
    }
    void snakeInstruction() {
        ImageIcon snake = new ImageIcon("snakeImage.png");
        JOptionPane.showMessageDialog(
                null,
                "In this game the player controls a snake.\n" +
                        "The objective is to eat as many apples as possible. Each time the snake eats an apple its body grows.\n" +
                        "The snake must avoid all walls and its own body.\n" +
                        "You can control the snake with the cursor keys - UP, DOWN, LEFT and RIGHT\n" +
                        "If the game is finished, the GAME OVER message is displayed in the middle of the board.",
                "Snake Game Instruction!",
                JOptionPane.INFORMATION_MESSAGE,
                snake
        );
    }
    void pacmanInstruction() {
        ImageIcon pacman = new ImageIcon("pacmanImage.png");
        JOptionPane.showMessageDialog(
                null,
                "Guide Pacman around the maze and eat all the little dots whilst avoiding ghosts.\n" +
                        "You can start the game by pressing SPACE on your keyboard and control Pacman with cursor keys.\n" +
                        "Pacman has 3 lives, each time a ghost catches you, you'll loose one live (displayed as red hearts in the bottom of the board).\n" +
                        "You'll be offered to start a new game right after you loose all your lives.",
                "Pac-Man Game Instruction!",
                JOptionPane.INFORMATION_MESSAGE,
                pacman
        );
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == tictactoeButton) {
            instructionGameFrame.dispose();
            tictactoeInstruction();
            InstructionGameFrame instructionGameFrame = new InstructionGameFrame();
        } else if (e.getSource() == pongButton) {
            instructionGameFrame.dispose();
            pongInstruction();
            InstructionGameFrame instructionGameFrame = new InstructionGameFrame();
        } else if (e.getSource() == snakeButton) {
            instructionGameFrame.dispose();
            snakeInstruction();
            InstructionGameFrame instructionGameFrame = new InstructionGameFrame();
        } else if (e.getSource() == pacmanButton) {
            instructionGameFrame.dispose();
            pacmanInstruction();
            InstructionGameFrame instructionGameFrame = new InstructionGameFrame();
        } else if (e.getSource() == backButton) {
            instructionGameFrame.dispose();
            GameMenuFrame gameMenuFrame = new GameMenuFrame();
        } else {
            System.exit(0);
        }
    }
}
