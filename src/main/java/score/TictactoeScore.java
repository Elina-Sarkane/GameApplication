package score;

public class TictactoeScore {

    ScoresManager scoresManager = new ScoresManager();

    public void tictactoeScore() {
        for (score.Score score : scoresManager.getAllScores("Tictactoe game")) {
            System.out.println(score.playerName + "  " + score.playerScore);
        }
    }
}
