package gameApplication.Frames;

import javax.swing.*;
import java.awt.*;

public class TictactoeGameFrame {

    JFrame tictactoeGame = new JFrame();

    public TictactoeGameFrame(){
        tictactoeGame.setVisible(true);
        tictactoeGame.setSize(520, 520);
        tictactoeGame.setTitle("Tic-Tac-Toe Game!");
        tictactoeGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tictactoeGame.setResizable(false);

    ImageIcon tictactoeGameImage = new ImageIcon("menuImage.png");
        tictactoeGame.setIconImage(tictactoeGameImage.getImage());
        tictactoeGame.getContentPane().setBackground(new Color(51, 153, 255));
    }
}
