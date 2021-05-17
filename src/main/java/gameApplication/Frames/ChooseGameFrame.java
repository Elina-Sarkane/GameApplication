package gameApplication.Frames;

import javax.swing.*;
import java.awt.*;

public class ChooseGameFrame {
    JFrame chooseGame = new JFrame();

    public ChooseGameFrame() {
        chooseGame.setVisible(true);
        chooseGame.setSize(520, 520);
        chooseGame.setTitle("Choose Game!");
        chooseGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        chooseGame.setResizable(false);

        ImageIcon chooseGameImage = new ImageIcon("menuImage.png");
        chooseGame.setIconImage(chooseGameImage.getImage());
        chooseGame.getContentPane().setBackground(new Color(51, 153, 255));
    }
}
