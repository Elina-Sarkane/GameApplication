package pacmanGame;

import javax.swing.*;

public class PacManMain extends JFrame {

    public PacManMain() {
        add(new PacManPanel());
    }


    public static void main(String[] args) {
        PacManMain pacmanMain = new PacManMain();
        pacmanMain.setVisible(true);
        pacmanMain.setTitle("Pacman Game");
        ImageIcon pacman = new ImageIcon("pacman.png");
        pacmanMain.setIconImage(pacman.getImage());
        pacmanMain.setSize(380,420);
        //pacmanMain.setDefaultCloseOperation(EXIT_ON_CLOSE);
        pacmanMain.setLocationRelativeTo(null);

    }

}
