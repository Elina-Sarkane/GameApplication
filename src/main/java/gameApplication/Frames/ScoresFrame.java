package gameApplication.Frames;

import javax.swing.*;
import java.awt.*;

public class ScoresFrame {

    JFrame scores = new JFrame();

    public ScoresFrame(){
        //scores log
        scores.setVisible(true);
        scores.setSize(520, 520);
        scores.setTitle("Scores!");
        scores.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        scores.setResizable(false);

        ImageIcon scoresImage = new ImageIcon("menuImage.png");
        scores.setIconImage(scoresImage.getImage());
        scores.getContentPane().setBackground(new Color(51, 153, 255));
    }

}
