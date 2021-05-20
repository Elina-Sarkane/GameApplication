package snakeGame;

import gameApplication.gameSettings.SnakeGameSettingFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelSnake extends  JPanel implements ActionListener {

    JFrame frame = new JFrame();
    JPanel title_panel = new JPanel();
    JLabel textField = new JLabel();
    JButton settingButton;
    JPanel settingPanel;

    SnakeGamePanel snakeGamePanel = new SnakeGamePanel();

    public PanelSnake() {

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 700);
        frame.getContentPane().setBackground(Color.GREEN);
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setTitle("Snake Game!");
        ImageIcon image = new ImageIcon("snakeImage.png");
        frame.setIconImage(image.getImage());

        textField.setBackground(new Color(25, 25, 25));
        textField.setForeground(new Color(81, 232, 101));
        textField.setFont(new Font("Calibre", Font.BOLD, 70));
        textField.setHorizontalAlignment(JLabel.CENTER);
        textField.setText("snake Game");
        textField.setOpaque(true);

        title_panel.setLayout(new BorderLayout());
        title_panel.setBounds(0, 0, 800, 100);

        settingButton = new JButton();
        settingButton.setBounds(10, 10, 10, 10);
        settingButton.addActionListener(this);
        ImageIcon icon = new ImageIcon("settingImage.png");
        settingButton.setIcon(icon);
        settingButton.setFocusable(false);
        settingButton.setBackground(new Color(225, 220, 96));
        settingButton.setBorder(BorderFactory.createBevelBorder(0));
        settingButton.setVisible(true);

        //settingPanel = new JPanel();
       // settingPanel.setBackground(Color.red);
        //settingPanel.setBounds(450, 18, 50, 50);
        //settingPanel.setLayout(new BorderLayout());
       // settingPanel.setVisible(true);

        frame.add(snakeGamePanel);
        frame.add(settingPanel);
       // settingPanel.add(settingButton);
        title_panel.add(textField);
        frame.add(title_panel, BorderLayout.NORTH);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == settingButton){
            frame.dispose();
            SnakeGameSettingFrame snakeGameSettingFrame = new SnakeGameSettingFrame();
        }
    }
}
