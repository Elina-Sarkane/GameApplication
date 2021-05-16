package snakeGame;

import javax.swing.*;

public class SnakeGameFrame extends JFrame {

    SnakeGameFrame(){

        this.add(new SnakeGamePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
