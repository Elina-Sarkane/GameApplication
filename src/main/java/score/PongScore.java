package score;

public class PongScore {
    ScoresManager scoresManager = new ScoresManager();

    public void pong() {
        for (Score.Score score : scoresManager.getAllScores("Pong game")) {
            System.out.println(score.playerName + "  " + score.playerScore);
        }
    }
}
