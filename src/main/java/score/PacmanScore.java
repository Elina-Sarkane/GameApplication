package score;

import javax.swing.*;

public class PacmanScore{

    //JFrame pacmanFrame = new JFrame();
    ImageIcon icon = new ImageIcon("trophy.png");
    JLabel pacmanScores = new JLabel("", icon, 0);

    public PacmanScore() {

        String scoreValues = "";

        ScoresManager iNeedMyScoreManager = new ScoresManager();
        for (Score score : iNeedMyScoreManager.getAllScores("Pacman game")) {
            scoreValues += score.playerName + " " + score.playerScore + "\n";
        }

        pacmanScores.setText(scoreValues);

        ImageIcon trophy = new ImageIcon("trophy.png");
        JOptionPane.showMessageDialog(
                null,
                "\n" + scoreValues,
                "Pac-Man Game Scores!",
                JOptionPane.INFORMATION_MESSAGE,
                trophy
        );

        /*pacmanScores.setBackground(new Color(151, 186, 213));
        pacmanScores.setFont(new Font("Calibre", Font.BOLD, 20));
        pacmanScores.setOpaque(true);
        pacmanScores.setVerticalTextPosition(SwingConstants.BOTTOM);
        pacmanScores.setHorizontalTextPosition(SwingConstants.CENTER);

        pacmanFrame.add(pacmanScores);
        pacmanFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon pacmanImage = new ImageIcon("menuImage.png");
        pacmanFrame.setIconImage(pacmanImage.getImage());
        pacmanFrame.setSize(450, 550);
        pacmanFrame.setBackground(new Color(151, 186, 213));
        pacmanFrame.setTitle("Pac Man Scores!");
        pacmanFrame.setResizable(false);
        pacmanFrame.setVisible(true);*/

    }

   /* public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PacmanScore();
            }
        });
    }*/
}
