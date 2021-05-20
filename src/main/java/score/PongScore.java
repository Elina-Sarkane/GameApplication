package score;

import javax.swing.*;

public class PongScore{

   // JFrame pongFrame = new JFrame();
    ImageIcon icon = new ImageIcon("trophy.png");
    JLabel pongScores = new JLabel("", icon, 0);

    public PongScore() {

        String scoreValues = "";

        ScoresManager iNeedMyScoreManager = new ScoresManager();
        for (Score score : iNeedMyScoreManager.getAllScores("Pong game")) {
            scoreValues += score.playerName + " " + score.playerScore + "\n";
        }
        pongScores.setText(scoreValues);

        ImageIcon trophy = new ImageIcon("trophy.png");
        JOptionPane.showMessageDialog(
                null,
                "\n" + scoreValues,
                "Pong Game Scores!",
                JOptionPane.INFORMATION_MESSAGE,
                trophy
        );
    }
}
