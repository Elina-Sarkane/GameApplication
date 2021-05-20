package score;

import javax.swing.*;

public class TictactoeScore{

    ImageIcon icon = new ImageIcon("trophy.png");
    JLabel tictactoeScore = new JLabel("", icon, 0);

    public TictactoeScore() {

        String scoreValues = "";

        ScoresManager iNeedMyScoreManager = new ScoresManager();
        for (score.Score score : iNeedMyScoreManager.getAllScores("Tictactoe game")) {

            scoreValues += score.playerName + " " + score.playerScore + "\n";
        }

        tictactoeScore.setText(scoreValues);

        ImageIcon trophy = new ImageIcon("trophy.png");
        JOptionPane.showMessageDialog(
                null,
                "\n" + scoreValues,
                "Tic-Tac-Toe Game Scores!",
                JOptionPane.INFORMATION_MESSAGE,
                trophy
        );
    }
}
