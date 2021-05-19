package pongGame;

import javax.swing.*;
import java.awt.*;

public class PongGameFrame extends JFrame{

    PongGamePanel pongGamePanel;

    public PongGameFrame(){

        pongGamePanel = new PongGamePanel();

        this.add(pongGamePanel);
        this.setTitle("Ping Pong Game!");
        ImageIcon image = new ImageIcon("pongImage.png");
        this.setIconImage(image.getImage());
        this.setResizable(false);
        this.setBackground(Color.black);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setLayout(null);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
