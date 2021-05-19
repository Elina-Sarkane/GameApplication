package snakeGame;
import javax.swing.*;
import java.awt.*;

public class SnakeGameFrame extends JFrame {

    public SnakeGameFrame(){

        this.add(new SnakeGamePanel());
        this.setTitle("Snake Game");
        ImageIcon image = new ImageIcon("snakeImage.png");
        this.setIconImage(image.getImage());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(800, 800);
        this.getContentPane().setBackground(Color.red);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
    }
}
