package score;

public class SnakeScore {

    ScoresManager scoresManager = new ScoresManager();

    public static void showScore(Score score) {
        System.out.println(score.playerName + "  " + score.playerScore);
    }

    /*ScoresManager scoresManager = new ScoresManager();

    public void snake() {
        for (score.Score score : scoresManager.getAllScores("Snake")) {
            System.out.println(score.playerName + "  " + score.playerScore);
        }
    }*/
}
