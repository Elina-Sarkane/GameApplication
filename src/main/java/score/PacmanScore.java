package score;

public class PacmanScore {
    ScoresManager scoresManager = new ScoresManager();

    public void pacman() {
        for (score.Score score : scoresManager.getAllScores("Pacman game")) {
            System.out.println(score.playerName + "  " + score.playerScore);
        }
    }
}
