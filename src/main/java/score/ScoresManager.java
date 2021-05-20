package score;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import logger.loggingManager;
import logger.loggingManager.LOG_LEVEL;


public class ScoresManager {
  /* We use special extention for file name to give a little bit of security to our files so user who dont have proper experience cannot easily open it to change something there*/
  private static final String SCORE_FILE_EXTENSION = "_scores.zino";
  // channel all system.out.print to single place so you can turn it off or on when you need it
  private loggingManager loggingManager = new loggingManager(LOG_LEVEL.CONSOLE);

  public ScoresManager(){
    loggingManager.showDebugMessage("Availability of score files will not be checked, "
        + "pass ArrayList<String> of available game names "
        + "if you want to ensure score files exist");
  }
  public ScoresManager(ArrayList<String> availableGames){
    this.createScoresFile(availableGames);
  }


  public boolean addNewScoreForSpecificGame(String gameName, score.Score score){
    try {
      FileWriter fileWriter = new FileWriter(gameName + SCORE_FILE_EXTENSION, true);
      fileWriter.append(score.playerScore +" --- "+ score.playerName + "\n");
      fileWriter.close();
      loggingManager.showDebugMessage("Score Saved Successfully for game: " + gameName);
      return true;
    } catch (IOException e) {
      loggingManager.showDebugMessage("An error occurred while saving score for game: " + gameName);
      loggingManager.showDebugMessage(e.getStackTrace().toString());
    }
    return false;
  }

  public ArrayList<score.Score> getAllScores(String gameName) {
    ArrayList<score.Score> scores = new ArrayList<score.Score>();
    try {
      File file = new File(gameName + SCORE_FILE_EXTENSION);
      Scanner myReader = new Scanner(file);
      while (myReader.hasNextLine()) {
        String[] scoreData = myReader.nextLine().split("---");
        scores.add(new score.Score(scoreData[0], scoreData[1]));
      }
      myReader.close();
      loggingManager.showDebugMessage("Scores retrieved successfully for: " + gameName);
    } catch (FileNotFoundException e) {
      loggingManager.showDebugMessage("An error occurred while reading scores for: " + gameName);
      loggingManager.showDebugMessage(e.getStackTrace().toString());
    }
    return scores;
  }

  private void createScoresFile(ArrayList<String> availableGames){
    loggingManager.showDebugMessage("Checking for existing game scores");
    for (String gameName : availableGames){
      try {
        File file = new File(gameName.trim().toLowerCase() + SCORE_FILE_EXTENSION);
        if (file.createNewFile()) {
          loggingManager.showDebugMessage(file.getName() + " created");
        } else {
          loggingManager.showDebugMessage(file.getName() + " found");
        }
      } catch (IOException e) {
        loggingManager.showDebugMessage("An error occurred with score file for game: " +gameName);
        loggingManager.showDebugMessage(e.getStackTrace().toString());
      }
    }
  }

  public void removeScoresFile(String gameName){
    loggingManager.showDebugMessage("attempting to remove game scores");

    File file = new File(gameName.trim().toLowerCase() + SCORE_FILE_EXTENSION);
    if (file.delete()) {
      loggingManager.showDebugMessage(gameName + " scores removed");
    } else {
      loggingManager.showDebugMessage(gameName + " scores may not exist or not enough permission");
    }
  }

}
