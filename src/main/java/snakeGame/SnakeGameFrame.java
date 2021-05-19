package snakeGame;
import javax.swing.*;
import java.awt.*;

public class SnakeGameFrame extends JFrame {

    JFrame snakeFrame = new JFrame();

    public SnakeGameFrame(){

        //snakeFrame.add(new PanelSnake());
        snakeFrame.add(new SnakeGamePanel());
        //this.setTitle("Snake Game");
        ImageIcon image = new ImageIcon("snakeImage.png");
        snakeFrame.setIconImage(image.getImage());
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        snakeFrame.setResizable(false);
        snakeFrame.setSize(800, 800);
        snakeFrame.getContentPane().setBackground(Color.red);
        snakeFrame.pack();
        snakeFrame.setVisible(true);
        snakeFrame.setLocationRelativeTo(null);
        snakeFrame.setLayout(new BorderLayout());
    }
}
