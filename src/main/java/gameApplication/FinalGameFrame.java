package gameApplication;

import javax.swing.*;

public class FinalGameFrame extends JFrame {
    FinalGamePanel finalGamePanel;

    public FinalGameFrame(){
        finalGamePanel = new FinalGamePanel();

        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        jFrame.setSize(520, 520);
        jFrame.setTitle("Game Menu!");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
