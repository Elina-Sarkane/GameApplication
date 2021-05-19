import gameApplication.frames.GameMenuFrame;
import score.ScoresManager;
import score.TictactoeScore;

import java.util.ArrayList;

public class FinalMain {

    public static void main(String[] args) {


        ArrayList<String> availableGames = new ArrayList<String>();
        availableGames.add("Tictactoe game");
        availableGames.add("Pong game");
        availableGames.add("Snake game");
        availableGames.add("Pacman game");

        new ScoresManager(availableGames);

        GameMenuFrame gameMenuFrame = new GameMenuFrame();
    }
}
