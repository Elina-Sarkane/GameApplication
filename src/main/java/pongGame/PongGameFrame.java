package pongGame;

import javax.swing.*;
import java.awt.*;

public class PongGameFrame extends JFrame {

    PongGamePanel pongGamePanel;

    public PongGameFrame(){
        pongGamePanel = new PongGamePanel();
        this.add(pongGamePanel);
        this.setTitle("Ping Pong Game");
        this.setResizable(false);
        this.setBackground(Color.black);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);


    }
}
