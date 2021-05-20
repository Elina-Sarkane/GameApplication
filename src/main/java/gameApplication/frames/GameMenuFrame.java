package gameApplication.frames;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameMenuFrame extends JFrame implements ActionListener {

    JFrame gameMenuFrame;
    JButton chooseGameButton;
    JButton scoresButton;
    JButton instructionButton;
    JButton exitButton;

    public GameMenuFrame(){

        chooseGameButton = new JButton();
        chooseGameButton.setBounds(100, 30, 250, 50);
        chooseGameButton.addActionListener(this);
        chooseGameButton.setText("CHOOSE GAME");
        chooseGameButton.setFocusable(false);
        chooseGameButton.setFont(new Font("Calibre", Font.BOLD,20));
        chooseGameButton.setBackground(new Color(225, 220, 96));
        chooseGameButton.setBorder(BorderFactory.createBevelBorder(0));

        scoresButton = new JButton();
        scoresButton.setBounds(100, 110, 250, 50);
        scoresButton.addActionListener(this);
        scoresButton.setText("SCORES");
        scoresButton.setFocusable(false);
        scoresButton.setFont(new Font("Calibre", Font.BOLD,20));
        scoresButton.setBackground(new Color(225, 220, 96));
        scoresButton.setBorder(BorderFactory.createBevelBorder(0));

        instructionButton = new JButton();
        instructionButton.setBounds(100, 190, 250, 50);
        instructionButton.addActionListener(this);
        instructionButton.setText("INSTRUCTIONS");
        instructionButton.setFocusable(false);
        instructionButton.setFont(new Font("Calibre", Font.BOLD,20));
        instructionButton.setBackground(new Color(225, 220, 96));
        instructionButton.setBorder(BorderFactory.createBevelBorder(0));

        exitButton = new JButton();
        exitButton.setBounds(100, 270, 250, 50);
        exitButton.addActionListener(this);
        exitButton.setText("EXIT");
        exitButton.setFocusable(false);
        exitButton.setFont(new Font("Calibre", Font.BOLD,20));
        exitButton.setBackground(new Color(225, 220, 96));
        exitButton.setBorder(BorderFactory.createBevelBorder(0));

        gameMenuFrame = new JFrame();
        gameMenuFrame.setTitle("Game Menu!");
        ImageIcon chooseGameImage = new ImageIcon("menuImage.png");
        gameMenuFrame.setIconImage(chooseGameImage.getImage());
        gameMenuFrame.setResizable(false);
        gameMenuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameMenuFrame.getContentPane().setBackground(new Color(151, 186, 213));
        gameMenuFrame.setLayout(null);
        gameMenuFrame.setSize(450, 550);
        gameMenuFrame.setVisible(true);
        gameMenuFrame.add(chooseGameButton);
        gameMenuFrame.add(instructionButton);
        gameMenuFrame.add(scoresButton);
        gameMenuFrame.add(exitButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == chooseGameButton){
            gameMenuFrame.dispose();
            ChooseGameFrame chooseGameFrame = new ChooseGameFrame();
        }else if(e.getSource() == scoresButton) {
            gameMenuFrame.dispose();
            ScoresFrame scoresFrame = new ScoresFrame();
        }else if (e.getSource() == instructionButton){
            gameMenuFrame.dispose();
            InstructionGameFrame instructionGameFrame = new InstructionGameFrame();
        }else {
            System.exit(0);
        }
    }
}
