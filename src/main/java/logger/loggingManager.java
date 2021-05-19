package logger;

import java.util.Date;

public class loggingManager {
  private LOG_LEVEL CURRENT_LOG_LEVEL;

  public loggingManager(LOG_LEVEL log_level){
    CURRENT_LOG_LEVEL = log_level;
  }

  public void showDebugMessage(String message){
    Date messageTime = new Date();
    switch (CURRENT_LOG_LEVEL){
      case FILE:
      // TODO: Implement sending of message to dedicate file that developer can look through
      break;
      case CONSOLE:
        System.out.println(messageTime + ": " + message);
        break;
      default:
        // dont show any message if log level is not FILE or CONSOLE
        break;
    }
  }
  public enum LOG_LEVEL {
    CONSOLE,
    FILE,
    NONE
  };
}

