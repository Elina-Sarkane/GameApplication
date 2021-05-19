package score;

import javax.swing.*;

public class TictactoeScore {

    ScoresManager scoresManager = new ScoresManager();
    public static void showScore(Score score) {
       System.out.println(score.playerName + "  " + score.playerScore);
    }

    /*public void tictactoeScore() {



        for (score.Score score : scoresManager.getAllScores("Tictactoe game")) {
            System.out.println(score.playerName + "  " + score.playerScore);

            ImageIcon tictactoe = new ImageIcon("tictactoeImage.png");
            JOptionPane.showMessageDialog(
                    null,
                    "Score is ",
                    "Score",
                    JOptionPane.INFORMATION_MESSAGE,
                    tictactoe
            );
        }
    }*/
}
