package gameApplication.Frames;

import javax.swing.*;
import java.awt.*;

public class PongGameFrame {
    JFrame pongGame = new JFrame();

    public PongGameFrame() {
        //pong game log
        pongGame.setVisible(true);
        pongGame.setSize(520, 520);
        pongGame.setTitle("Pong Game!");
        pongGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pongGame.setResizable(false);

        ImageIcon pongGameImage = new ImageIcon("menuImage.png");
        pongGame.setIconImage(pongGameImage.getImage());
        pongGame.getContentPane().setBackground(new Color(51, 153, 255));
    }
}
