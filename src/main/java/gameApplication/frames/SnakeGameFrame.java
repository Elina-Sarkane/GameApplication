package gameApplication.frames;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SnakeGameFrame extends JFrame implements ActionListener {

    JFrame snakeFrame;
    JButton newGameButton;
    JButton instructionButton;
    JButton backButton;
    JButton exitButton;


    public SnakeGameFrame() {

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

        snakeFrame = new JFrame();
        snakeFrame.setTitle("Snake game!");
        ImageIcon chooseGameImage = new ImageIcon("menuImage.png");
        snakeFrame.setIconImage(chooseGameImage.getImage());
        snakeFrame.setResizable(false);
        snakeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        snakeFrame.getContentPane().setBackground(new Color(151, 186, 213));
        snakeFrame.setLayout(null);
        snakeFrame.setSize(450, 550);
        snakeFrame.setVisible(true);
        snakeFrame.add(newGameButton);
        snakeFrame.add(instructionButton);
        snakeFrame.add(backButton);
        snakeFrame.add(exitButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == newGameButton) {
            snakeFrame.dispose();
            snakeGame.SnakeGameFrame snakeGameFrame = new snakeGame.SnakeGameFrame();
        }else if (e.getSource() == instructionButton){
            snakeFrame.dispose();
            snakeInstruction();
            SnakeGameFrame snakeGameFrame = new SnakeGameFrame();
        }else if(e.getSource() == backButton){
            snakeFrame.dispose();
            ChooseGameFrame chooseGameFrame = new ChooseGameFrame();
        }else {
            System.exit(0);
        }
    }
    void snakeInstruction() {
        ImageIcon snake = new ImageIcon("snakeImage.png");
        JOptionPane.showMessageDialog(
                null,
                "In this game the player controls a snake.\n" +
                        "The objective is to eat as many apples as possible. Each time the snake eats an apple, its body grows.\n" +
                        "The snake must avoid all walls and its own body.\n" +
                        "Control the snake with the cursor keys - UP, DOWN, LEFT and RIGHT\n" +
                        "If the game is finished, the GAME OVER message is displayed in the middle of the board.",
                "Snake Game Instruction!",
                JOptionPane.INFORMATION_MESSAGE,
                snake
        );
    }

}
