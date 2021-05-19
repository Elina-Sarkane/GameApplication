package score;

import snakeGame.SnakeGamePanel;

import javax.swing.*;

public class SnakeScore {

    SnakeGamePanel snakeGamePanel = new SnakeGamePanel();
    public SnakeScore() {
        ImageIcon trophy = new ImageIcon("trophy.png");
        JOptionPane.showMessageDialog(
                null,
                "Score saved!",
                "Score!",
                JOptionPane.INFORMATION_MESSAGE,
                trophy
        );
    }
}
