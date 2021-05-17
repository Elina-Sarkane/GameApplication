package gameApplication.Frames;

import javax.swing.*;
import java.awt.*;

public class SnakeGameFrame {

    JFrame snakeGame = new JFrame();

    public  SnakeGameFrame() {
        //snake game log
        snakeGame.setVisible(true);
        snakeGame.setSize(520, 520);
        snakeGame.setTitle("Snake Game!");
        snakeGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        snakeGame.setResizable(false);

        ImageIcon snakeGameImage = new ImageIcon("menuImage.png");
        snakeGame.setIconImage(snakeGameImage.getImage());
        snakeGame.getContentPane().setBackground(new Color(51, 153, 255));
    }

}
