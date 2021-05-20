package score;

import javax.swing.*;

public class SnakeScore{

    ImageIcon icon = new ImageIcon("trophy.png");
    JLabel snakeScores = new JLabel("", icon, 0);

    public SnakeScore() {

        String scoreValues = "";

        ScoresManager iNeedMyScoreManager = new ScoresManager();
        for (Score score : iNeedMyScoreManager.getAllScores("Snake game")) {
            scoreValues += score.playerName + " " + score.playerScore + "\n";
        }

        snakeScores.setText(scoreValues);

        ImageIcon trophy = new ImageIcon("trophy.png");
        JOptionPane.showMessageDialog(
                null,
                "\n" + scoreValues,
                "Snake Game Scores!",
                JOptionPane.INFORMATION_MESSAGE,
                trophy
        );
    }
}
