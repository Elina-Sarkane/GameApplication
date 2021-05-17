package gameApplication.Frames;

import javax.swing.*;
import java.awt.*;

public class PacmanGameFrame {

    JFrame pacmanGame = new JFrame();

    public PacmanGameFrame() {
        //pacman game log
        pacmanGame.setVisible(true);
        pacmanGame.setSize(520, 520);
        pacmanGame.setTitle("Pac-Man game!");
        pacmanGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pacmanGame.setResizable(false);

        ImageIcon pacmanGameImage = new ImageIcon("menuImage.png");
        pacmanGame.setIconImage(pacmanGameImage.getImage());
        pacmanGame.getContentPane().setBackground(new Color(51, 153, 255));
    }

}
