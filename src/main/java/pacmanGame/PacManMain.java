package pacmanGame;

import javax.swing.*;

public class PacManMain extends JFrame {

    public PacManMain() {
        add(new PacManPanel());
    }


    public static void main(String[] args) {
        PacManMain pac = new PacManMain();
        pac.setVisible(true);
        pac.setTitle("Pacman");
        pac.setSize(380,420);
        pac.setDefaultCloseOperation(EXIT_ON_CLOSE);
        pac.setLocationRelativeTo(null);

    }

}
