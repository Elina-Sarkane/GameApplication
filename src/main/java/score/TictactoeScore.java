package score;

public class TictactoeScore {

    ScoresManager scoresManager = new ScoresManager();

    public void tictactoeScore() {
        for (Score.Score score : scoresManager.getAllScores("Tictactoe")) {
            System.out.println(score.playerName + "  " + score.playerScore);
        }
    }
}
