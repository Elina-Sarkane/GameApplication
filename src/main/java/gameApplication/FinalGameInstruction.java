package gameApplication;

public class FinalGameInstruction {

   void tictactoeInstruction(){
      System.out.println("Tic Tac Toe instruction");
      System.out.println("The game is played on a 3x3 grid" +
              "Player one is X, and player two is Y" +
              "The first who gets 3 of his marks in a row (up, down, diagonally) is the winner" +
      "When all squares are full, game is over");
   }

   void pongInstruction() {
      System.out.println("Pong instruction");
      System.out.println("The game principles is similar as in real life ping pong game." +
              "Player 1 is BLUE, you can move it by pressing W (goes up) and S (goes down) on your keyboard. " +
              "Player 2 ir RED, you can move it by pressing UP and DOWN keys on your keyboard." +
              "Every player gets a point if it doesn't miss the ball");
   }
   void snakeInstruction(){
      System.out.println("Snake instruction");
      System.out.println("In this game the player controls a snake." +
              "The objective is to eat as many apples as possible. Each time the snake eats an apple its body grows." +
              "The snake must avoid all walls and its own body." +
              "You can control the snake with the cursor keys - UP, DOWN, LEFT and RIGHT" +
              "If the game is finished, the GAME OVER message is displayed in the middle of the board.");
   }

   void pacmanInstruction(){
      System.out.println("Pacman instruction");
      System.out.println("Guide Pacman around the maze and eat all the little dots whilst avoiding ghosts." +
              "You can start the game by pressing SPACE on your keyboard and control Pacman with cursor keys." +
              "Pacman has 3 lives, each time a ghost catches you, you'll loose one live (displayed as red hearts in the bottom of the board." +
              "You'll be offered to start a new game right after you loose all your lives.");
   }
}
