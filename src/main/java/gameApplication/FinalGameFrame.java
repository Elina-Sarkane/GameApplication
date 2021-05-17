package gameApplication;

import gameApplication.Frames.ChooseGameFrame;
import gameApplication.Frames.LogInFrame;
import gameApplication.Frames.ScoresFrame;

import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FinalGameFrame extends JFrame implements ActionListener {
    FinalGamePanel finalGamePanel;
    JButton loginButton;
    JFrame menuFrame;
    JButton chooseGameButton;
    JButton scoreButton;
    JButton exitButton;

    public FinalGameFrame() {
        finalGamePanel = new FinalGamePanel();

        JLabel menuLabel = new JLabel();
        //menuLabel.setVisible(true);
        menuLabel.setText("WELCOME TO THE GAME MENU!");
//can put image icon = ImageIcon image = new ImageIcon("menuImage") -> menuLabel.setIcon(menuImage)
        menuLabel.setHorizontalAlignment(JLabel.CENTER);
        menuLabel.setVerticalAlignment(JLabel.TOP);
        menuLabel.setForeground(new Color(0, 0, 0));
        menuLabel.setFont(new Font("Colibry", Font.BOLD,25));

//login buttom
        loginButton = new JButton();
        loginButton.setBounds(200, 90, 100, 50);
        loginButton.addActionListener(this);
        loginButton.setText("Log In");
        loginButton.setFocusable(false);
        loginButton.setBackground(new Color(255, 204, 0));
        //loginButton.setLayout(null);

//choose game button
        chooseGameButton = new JButton();
        chooseGameButton.setBounds(200, 90, 100, 50);
        chooseGameButton.addActionListener(this);
        chooseGameButton.setText("Choose Game");
        chooseGameButton.setFocusable(false);
        chooseGameButton.setBackground(new Color(255, 204, 0));

//score button
        scoreButton = new JButton();
        scoreButton.setBounds(200, 90, 100, 50);
        scoreButton.addActionListener(this);
        scoreButton.setText("Log In");
        scoreButton.setFocusable(false);
        scoreButton.setBackground(new Color(255, 204, 0));

//exit button
        exitButton = new JButton();
        exitButton.setBounds(200, 90, 100, 50);
        exitButton.addActionListener(this);
        exitButton.setText("Log In");
        exitButton.setFocusable(false);
        exitButton.setBackground(new Color(255, 204, 0));

        //Game Menu log
        menuFrame = new JFrame();
        menuFrame.setVisible(true);
        menuFrame.setSize(520, 520);
        menuFrame.setTitle("Game Menu!");
        menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menuFrame.setResizable(false);
        menuFrame.add(menuLabel);
        menuFrame.add(loginButton);
        menuFrame.add(chooseGameButton);
        menuFrame.add(scoreButton);
        menuFrame.add(exitButton);
        menuFrame.setLayout(null);

        ImageIcon menuImage = new ImageIcon("menuImage.png");
        menuFrame.setIconImage(menuImage.getImage());

        menuFrame.getContentPane().setBackground(new Color(51, 153, 255));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==loginButton){
            menuFrame.dispose();
            new LogInFrame();
        }else if (e.getSource()==chooseGameButton){
            menuFrame.dispose();
            new ChooseGameFrame();
        }else if (e.getSource()==scoreButton){
            menuFrame.dispose();
            new ScoresFrame();
        }else {

        }
    }
}
    /*public PopupMenu gameMenuButton(){
        JButton loginButton;
        JButton chooseGameButton;
        JButton scoreButton;


        loginButton = new JButton();
        loginButton.setBounds(200, 90, 100, 50);
        loginButton.addActionListener(e -> logInFrame());
        loginButton.setText("Log In");
        loginButton.setFocusable(false);
        loginButton.setBackground(new Color(255, 204, 0));
        //loginButton.setLayout(null);

        chooseGameButton = new JButton();
        chooseGameButton.setBounds(200, 90, 100, 50);
        chooseGameButton.addActionListener(e -> chooseGameFrame());
        chooseGameButton.setText("Choose Game");
        chooseGameButton.setFocusable(false);
        chooseGameButton.setBackground(new Color(255, 204, 0));
        //chooseGameButton.setLayout(null);

        return null;
    }*/
