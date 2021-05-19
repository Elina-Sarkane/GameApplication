package score;

public class PacmanScore {
    ScoresManager scoresManager = new ScoresManager();

    public static void showScore(Score score) {
        System.out.println(score.playerName + "  " + score.playerScore);
    }

    /*public void pacman() {
        for (score.Score score : scoresManager.getAllScores("Pacman game")) {
            System.out.println(score.playerName + "  " + score.playerScore);
        }
    }*/
}
