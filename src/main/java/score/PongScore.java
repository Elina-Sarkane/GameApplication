package score;

public class PongScore {

    ScoresManager scoresManager = new ScoresManager();

    public static void showScore(Score score) {
        System.out.println(score.playerName + "  " + score.playerScore);
    }

   public void pong() {
        for (score.Score score : scoresManager.getAllScores("Pong game")) {
            System.out.println(score.playerName + "  " + score.playerScore);
        }
    }
}
