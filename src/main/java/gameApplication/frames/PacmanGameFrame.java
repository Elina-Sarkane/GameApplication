package gameApplication.frames;

import pacmanGame.PacManMain;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PacmanGameFrame extends JFrame implements ActionListener {

    JFrame pacmanFrame;
    JButton newGameButton;
    JButton continueGameButton;
    JButton backButton;
    JButton exitButton;


    public PacmanGameFrame() {

        newGameButton = new JButton();
        newGameButton.setBounds(100, 30, 250, 50);
        newGameButton.addActionListener(this);
        newGameButton.setText("NEW GAME");
        newGameButton.setFocusable(false);
        newGameButton.setFont(new Font("Calibre", Font.BOLD,20));
        newGameButton.setBackground(new Color(225, 220, 96));
        newGameButton.setBorder(BorderFactory.createBevelBorder(0));

        continueGameButton = new JButton();
        continueGameButton.setBounds(100, 110, 250, 50);
        continueGameButton.addActionListener(this);
        continueGameButton.setText("CONTINUE GAME");
        continueGameButton.setFocusable(false);
        continueGameButton.setFont(new Font("Calibre", Font.BOLD,20));
        continueGameButton.setBackground(new Color(225, 220, 96));
        continueGameButton.setBorder(BorderFactory.createBevelBorder(0));

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

        pacmanFrame = new JFrame();
        pacmanFrame.setTitle("Pac-Man Game!");
        ImageIcon chooseGameImage = new ImageIcon("menuImage.png");
        pacmanFrame.setIconImage(chooseGameImage.getImage());
        pacmanFrame.setResizable(false);
        pacmanFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pacmanFrame.getContentPane().setBackground(new Color(151, 186, 213));
        pacmanFrame.setLayout(null);
        pacmanFrame.setSize(450, 550);
        pacmanFrame.setVisible(true);
        pacmanFrame.add(newGameButton);
        pacmanFrame.add(continueGameButton);
        pacmanFrame.add(backButton);
        pacmanFrame.add(exitButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == newGameButton) {
            pacmanFrame.dispose();
            PacManMain pacmanMain = new PacManMain();
            pacmanMain.setVisible(true);
            pacmanMain.setTitle("Pacman");
            pacmanMain.setSize(380,420);
            pacmanMain.setDefaultCloseOperation(EXIT_ON_CLOSE);
            pacmanMain.setLocationRelativeTo(null);
        } else if (e.getSource() == continueGameButton) {
            pacmanFrame.dispose();
            //continue game
        }else if(e.getSource() == backButton){
            pacmanFrame.dispose();
            ChooseGameFrame chooseGameFrame = new ChooseGameFrame();
        }else {
            System.exit(0);
        }
    }

}
