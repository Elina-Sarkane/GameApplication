package gameApplication.Frames;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PongGameFrame extends JFrame implements ActionListener {

    JFrame pongFrame;
    JButton newGameButton;
    JButton continueGameButton;
    JButton backButton;
    JButton exitButton;


    public PongGameFrame() {

        newGameButton = new JButton();
        newGameButton.setBounds(100, 30, 250, 50);
        newGameButton.addActionListener(this);
        newGameButton.setText("NEW GAME");
        newGameButton.setFocusable(false);
        newGameButton.setFont(new Font("Calibri", Font.BOLD,20));
        newGameButton.setBackground(new Color(225, 220, 96));
        newGameButton.setBorder(BorderFactory.createBevelBorder(0));

        continueGameButton = new JButton();
        continueGameButton.setBounds(100, 110, 250, 50);
        continueGameButton.addActionListener(this);
        continueGameButton.setText("CONTINUE GAME");
        continueGameButton.setFocusable(false);
        continueGameButton.setFont(new Font("Calibri", Font.BOLD,20));
        continueGameButton.setBackground(new Color(225, 220, 96));
        continueGameButton.setBorder(BorderFactory.createBevelBorder(0));

        backButton = new JButton();
        backButton.setBounds(100, 190, 250, 50);
        backButton.addActionListener(this);
        backButton.setText("GO BACK");
        backButton.setFocusable(false);
        backButton.setFont(new Font("Calibri", Font.BOLD,20));
        backButton.setBackground(new Color(225, 220, 96));
        backButton.setBorder(BorderFactory.createBevelBorder(0));

        exitButton = new JButton();
        exitButton.setBounds(100, 270, 250, 50);
        exitButton.addActionListener(this);
        exitButton.setText("EXIT");
        exitButton.setFocusable(false);
        exitButton.setFont(new Font("Calibri", Font.BOLD,20));
        exitButton.setBackground(new Color(225, 220, 96));
        exitButton.setBorder(BorderFactory.createBevelBorder(0));

        pongFrame = new JFrame();
        pongFrame.setTitle("Pong game!");
        ImageIcon chooseGameImage = new ImageIcon("menuImage.png");
        pongFrame.setIconImage(chooseGameImage.getImage());
        pongFrame.setResizable(false);
        pongFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pongFrame.getContentPane().setBackground(new Color(151, 186, 213));
        pongFrame.setLayout(null);
        pongFrame.setSize(450, 550);
        pongFrame.setVisible(true);
        pongFrame.add(newGameButton);
        pongFrame.add(continueGameButton);
        pongFrame.add(backButton);
        pongFrame.add(exitButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == newGameButton) {
            pongFrame.dispose();
            pongGame.PongGameFrame pongGameFrame = new pongGame.PongGameFrame();
        } else if (e.getSource() == continueGameButton) {
            pongFrame.dispose();
            //continue game
        }else if(e.getSource() == backButton){
            pongFrame.dispose();
            ChooseGameFrame chooseGameFrame = new ChooseGameFrame();
        }else {
            System.exit(0);
        }
    }
}
