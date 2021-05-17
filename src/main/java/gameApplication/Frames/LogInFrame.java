package gameApplication.Frames;

import javax.swing.*;
import java.awt.*;

public class LogInFrame {
    JFrame logIn = new JFrame();

    public LogInFrame(){
        logIn.setVisible(true);
        logIn.setSize(520, 520);
        logIn.setTitle("Log in!");
        logIn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        logIn.setResizable(false);

        ImageIcon logInImage = new ImageIcon("menuImage.png");
        logIn.setIconImage(logInImage.getImage());
        logIn.getContentPane().setBackground(new Color(51, 153, 255));
    }
}
