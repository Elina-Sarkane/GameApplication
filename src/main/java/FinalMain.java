import gameApplication.frames.GameMenuFrame;
import score.ScoresManager;

import java.util.ArrayList;

public class FinalMain {
    public static void main(String[] args) {

        ArrayList<String> availableGames = new ArrayList<String>();
        availableGames.add("Tictactoe");
        availableGames.add("Pong");
        availableGames.add("Snake");
        availableGames.add("Pacman");


        new ScoresManager(availableGames);
        GameMenuFrame gameMenuFrame = new GameMenuFrame();
    }
}
