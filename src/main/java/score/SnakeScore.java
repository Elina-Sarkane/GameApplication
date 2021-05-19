package score;

public class SnakeScore {

    ScoresManager scoresManager = new ScoresManager();

    public void snake() {
        for (Score.Score score : scoresManager.getAllScores("Snake")) {
            System.out.println(score.playerName + "  " + score.playerScore);
        }
    }
}
