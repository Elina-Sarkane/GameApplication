package pongGame;

import gameApplication.gameSettings.PongGameSettingFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PongGameFrame extends JFrame implements ActionListener {

    PongGamePanel pongGamePanel;
    JButton settingButton;
    JPanel settingPanel;

    public PongGameFrame(){

        pongGamePanel = new PongGamePanel();

        settingButton = new JButton();
        settingButton.setBounds(10, 10, 10, 10);
        settingButton.addActionListener(this);
        ImageIcon icon = new ImageIcon("settingImage.png");
        settingButton.setIcon(icon);
        settingButton.setFocusable(false);
        settingButton.setBackground(new Color(225, 220, 96));
        settingButton.setBorder(BorderFactory.createBevelBorder(0));
        settingButton.setVisible(true);

        settingPanel = new JPanel();
        settingPanel.setBackground(Color.red);
        settingPanel.setBounds(450, 18, 50, 50);
        settingPanel.setLayout(new BorderLayout());
        settingPanel.setVisible(true);


        this.add(pongGamePanel);
        //this.add(settingPanel);
        //settingPanel.add(settingButton);
        this.setTitle("Ping Pong Game!");
        ImageIcon image = new ImageIcon("pongImage.png");
        this.setIconImage(image.getImage());
        this.setResizable(false);
        this.setBackground(Color.black);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        //this.add(settingButton);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==settingButton){
            PongGameSettingFrame pongGameSettingFrame = new PongGameSettingFrame();
        }
    }
}
