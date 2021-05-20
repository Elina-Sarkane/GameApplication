package tictactoeGame;

import gameApplication.gameSettings.TicTacToeGameSettingFrame;
import score.ScoresManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class TicTacToe implements ActionListener {

    Random random = new Random();
    JFrame frame = new JFrame();
    JPanel title_panel = new JPanel();
    JPanel button_panel = new JPanel();
    JLabel textField = new JLabel();
    JButton[] buttons = new JButton[9];
    JButton settingButton;
    JPanel settingPanel;
    boolean player1_turn;

    ScoresManager scoresManager = new ScoresManager();

   public TicTacToe(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(550, 550);
        frame.getContentPane().setBackground(new Color(50, 50, 50));
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setTitle("Tic-Tac-Toe Game!");
        ImageIcon image = new ImageIcon("tictactoeImage.png");
        frame.setIconImage(image.getImage());

        textField.setBackground(new Color(25, 25, 25));
        textField.setForeground(new Color(81, 232, 101));
        textField.setFont(new Font("Calibre", Font.BOLD,70));
        textField.setHorizontalAlignment(JLabel.CENTER);
        textField.setText("Tic-Tac-Toe");
        textField.setOpaque(true);

        title_panel.setLayout(new BorderLayout());
        title_panel.setBounds(0, 0, 800, 100);

        button_panel.setLayout(new GridLayout(3, 3));
        button_panel.setBackground(new Color(150, 150, 150));

        for(int i=0; i<9; i++){
            buttons[i] = new JButton();
            button_panel.add(buttons[i]);
            buttons[i].setFont(new Font("Calibre", Font.BOLD,120));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
        }

        settingButton = new JButton();
        settingButton.setBounds(10, 10, 10, 10);
        settingButton.addActionListener(this);
        ImageIcon icon = new ImageIcon("settingImage.png");
        settingButton.setIcon(icon);
        settingButton.setFocusable(false);
        settingButton.setBackground(new Color(225, 220, 96));
        settingButton.setBorder(BorderFactory.createBevelBorder(0));
        settingButton.setVisible(true);

        settingPanel = new JPanel();
        settingPanel.setBackground(Color.red);
        settingPanel.setBounds(450, 18, 50, 50);
        settingPanel.setLayout(new BorderLayout());
        settingPanel.setVisible(true);

        frame.add(settingPanel);
        settingPanel.add(settingButton);
        title_panel.add(textField);
        frame.add(title_panel, BorderLayout.NORTH);
        frame.add(button_panel);

        firstTurn();

    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == settingButton) {
            frame.dispose();
            TicTacToeGameSettingFrame ticTacToeGameSettingFrame = new TicTacToeGameSettingFrame();
        }

            for (int i = 0; i < 9; i++) {
                if (e.getSource() == buttons[i]) {
                    if (player1_turn) {
                        if (buttons[i].getText() == "") {
                            buttons[i].setForeground(new Color(255, 0, 0));
                            buttons[i].setText("X");
                            player1_turn = false;
                            textField.setText("O turn");
                            check();
                        }
                    } else {
                        if (buttons[i].getText() == "") {
                            buttons[i].setForeground(new Color(0, 0, 255));
                            buttons[i].setText("O");
                            player1_turn = true;
                            textField.setText("X turn");
                            check();
                        }
                    }
                }
            }
    }

    public void firstTurn(){
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        if (random.nextInt(2)==0){
            player1_turn = true;
            textField.setText("X turn");
        }else{
            player1_turn = false;
            textField.setText("O turn");
        }

    }
    public void check(){
        //check X win condition
        if(
                (buttons[0].getText()=="X") &&
                        (buttons[1].getText()=="X") &&
                        (buttons[2].getText()=="X")
        ){
            xWins(0,1, 2);
        }
        if(
                (buttons[3].getText()=="X") &&
                        (buttons[4].getText()=="X") &&
                        (buttons[5].getText()=="X")
        ){
            xWins(3,4, 5);
        }
        if(
                (buttons[6].getText()=="X") &&
                        (buttons[7].getText()=="X") &&
                        (buttons[8].getText()=="X")
        ){
            xWins(6,7, 8);
        }
        if(
                (buttons[0].getText()=="X") &&
                        (buttons[3].getText()=="X") &&
                        (buttons[6].getText()=="X")
        ){
            xWins(0,3, 6);
        }
        if(
                (buttons[1].getText()=="X") &&
                        (buttons[4].getText()=="X") &&
                        (buttons[7].getText()=="X")
        ){
            xWins(2,4, 7);
        }
        if(
                (buttons[2].getText()=="X") &&
                        (buttons[5].getText()=="X") &&
                        (buttons[8].getText()=="X")
        ){
            xWins(2,5, 8);
        }
        if(
                (buttons[0].getText()=="X") &&
                        (buttons[4].getText()=="X") &&
                        (buttons[8].getText()=="X")
        ){
            xWins(0,4, 8);
        }
        if(
                (buttons[2].getText()=="X") &&
                        (buttons[4].getText()=="X") &&
                        (buttons[6].getText()=="X")
        ){
            xWins(2,4, 6);
        }

        //check O win condition

        if(
                (buttons[0].getText()=="O") &&
                        (buttons[1].getText()=="O") &&
                        (buttons[2].getText()=="O")
        ){
            oWins(0,1, 2);
        }
        if(
                (buttons[3].getText()=="O") &&
                        (buttons[4].getText()=="O") &&
                        (buttons[5].getText()=="O")
        ){
            oWins(3,4, 5);
        }
        if(
                (buttons[6].getText()=="O") &&
                        (buttons[7].getText()=="O") &&
                        (buttons[8].getText()=="O")
        ){
            oWins(6,7, 8);
        }
        if(
                (buttons[0].getText()=="O") &&
                        (buttons[3].getText()=="O") &&
                        (buttons[6].getText()=="O")
        ){
            oWins(0,3, 6);
        }
        if(
                (buttons[1].getText()=="O") &&
                        (buttons[4].getText()=="O") &&
                        (buttons[7].getText()=="O")
        ){
            oWins(2,4, 7);
        }
        if(
                (buttons[2].getText()=="O") &&
                        (buttons[5].getText()=="O") &&
                        (buttons[8].getText()=="O")
        ){
            oWins(2,5, 8);
        }
        if(
                (buttons[0].getText()=="O") &&
                        (buttons[4].getText()=="O") &&
                        (buttons[8].getText()=="O")
        ){
            oWins(0,4, 8);
        }
        if(
                (buttons[2].getText()=="O") &&
                        (buttons[4].getText()=="O") &&
                        (buttons[6].getText()=="O")
        ){
            oWins(2,4, 6);
        }
        //game over conditions
        if(
                (buttons[0].getText()=="O") &&
                        (buttons[1].getText()=="O") &&
                        (buttons[2].getText()=="X") &&
                        (buttons[3].getText()=="X") &&
                        (buttons[4].getText() =="X") &&
                        (buttons[5].getText()=="O") &&
                        (buttons[6].getText()=="O") &&
                        (buttons[7].getText()=="O") &&
                        (buttons[8].getText()=="X")
        ){
            gameOver(0, 1, 2, 3, 4, 5 ,6 ,7 ,8);
        }
        if(
                (buttons[0].getText()=="X") &&
                        (buttons[1].getText()=="X") &&
                        (buttons[2].getText()=="O") &&
                        (buttons[3].getText()=="O") &&
                        (buttons[4].getText() =="O") &&
                        (buttons[5].getText()=="X") &&
                        (buttons[6].getText()=="X") &&
                        (buttons[7].getText()=="X") &&
                        (buttons[8].getText()=="O")
        ) {
            gameOver(0, 1, 2, 3, 4, 5, 6, 7, 8);
        }
        if(
                (buttons[0].getText()=="X") &&
                        (buttons[1].getText()=="X") &&
                        (buttons[2].getText()=="O") &&
                        (buttons[3].getText()=="O") &&
                        (buttons[4].getText() =="X") &&
                        (buttons[5].getText()=="X") &&
                        (buttons[6].getText()=="X") &&
                        (buttons[7].getText()=="O") &&
                        (buttons[8].getText()=="O")
        ) {
            gameOver(0, 1, 2, 3, 4, 5, 6, 7, 8);
        }
        if(
                (buttons[0].getText()=="O") &&
                        (buttons[1].getText()=="O") &&
                        (buttons[2].getText()=="X") &&
                        (buttons[3].getText()=="X") &&
                        (buttons[4].getText() =="O") &&
                        (buttons[5].getText()=="O") &&
                        (buttons[6].getText()=="O") &&
                        (buttons[7].getText()=="X") &&
                        (buttons[8].getText()=="X")
        ) {
            gameOver(0, 1, 2, 3, 4, 5, 6, 7, 8);
        }
        if(
                (buttons[0].getText()=="O") &&
                        (buttons[1].getText()=="X") &&
                        (buttons[2].getText()=="X") &&
                        (buttons[3].getText()=="X") &&
                        (buttons[4].getText() =="X") &&
                        (buttons[5].getText()=="O") &&
                        (buttons[6].getText()=="O") &&
                        (buttons[7].getText()=="O") &&
                        (buttons[8].getText()=="X")
        ) {
            gameOver(0, 1, 2, 3, 4, 5, 6, 7, 8);
        }
        if(
                (buttons[0].getText()=="X") &&
                        (buttons[1].getText()=="O") &&
                        (buttons[2].getText()=="O") &&
                        (buttons[3].getText()=="O") &&
                        (buttons[4].getText() =="O") &&
                        (buttons[5].getText()=="X") &&
                        (buttons[6].getText()=="X") &&
                        (buttons[7].getText()=="X") &&
                        (buttons[8].getText()=="O")
        ) {
            gameOver(0, 1, 2, 3, 4, 5, 6, 7, 8);
        }
        if(
                (buttons[0].getText()=="O") &&
                        (buttons[1].getText()=="O") &&
                        (buttons[2].getText()=="X") &&
                        (buttons[3].getText()=="X") &&
                        (buttons[4].getText() =="X") &&
                        (buttons[5].getText()=="O") &&
                        (buttons[6].getText()=="O") &&
                        (buttons[7].getText()=="X") &&
                        (buttons[8].getText()=="X")
        ) {
            gameOver(0, 1, 2, 3, 4, 5, 6, 7, 8);
        }
        if(
                (buttons[0].getText()=="X") &&
                        (buttons[1].getText()=="X") &&
                        (buttons[2].getText()=="O") &&
                        (buttons[3].getText()=="O") &&
                        (buttons[4].getText() =="O") &&
                        (buttons[5].getText()=="X") &&
                        (buttons[6].getText()=="X") &&
                        (buttons[7].getText()=="O") &&
                        (buttons[8].getText()=="O")
        ) {
            gameOver(0, 1, 2, 3, 4, 5, 6, 7, 8);
        }
        if(
                (buttons[0].getText()=="X") &&
                        (buttons[1].getText()=="O") &&
                        (buttons[2].getText()=="O") &&
                        (buttons[3].getText()=="O") &&
                        (buttons[4].getText() =="X") &&
                        (buttons[5].getText()=="X") &&
                        (buttons[6].getText()=="X") &&
                        (buttons[7].getText()=="X") &&
                        (buttons[8].getText()=="O")
        ) {
            gameOver(0, 1, 2, 3, 4, 5, 6, 7, 8);
        }
        if(
                (buttons[0].getText()=="O") &&
                        (buttons[1].getText()=="X") &&
                        (buttons[2].getText()=="X") &&
                        (buttons[3].getText()=="X") &&
                        (buttons[4].getText() =="O") &&
                        (buttons[5].getText()=="O") &&
                        (buttons[6].getText()=="O") &&
                        (buttons[7].getText()=="O") &&
                        (buttons[8].getText()=="X")
        ) {
            gameOver(0, 1, 2, 3, 4, 5, 6, 7, 8);
        }
        if(
                (buttons[0].getText()=="O") &&
                        (buttons[1].getText()=="X") &&
                        (buttons[2].getText()=="O") &&
                        (buttons[3].getText()=="X") &&
                        (buttons[4].getText() =="O") &&
                        (buttons[5].getText()=="O") &&
                        (buttons[6].getText()=="X") &&
                        (buttons[7].getText()=="O") &&
                        (buttons[8].getText()=="X")
        ) {
            gameOver(0, 1, 2, 3, 4, 5, 6, 7, 8);
        }
        if(
                (buttons[0].getText()=="X") &&
                        (buttons[1].getText()=="O") &&
                        (buttons[2].getText()=="X") &&
                        (buttons[3].getText()=="O") &&
                        (buttons[4].getText() =="X") &&
                        (buttons[5].getText()=="X") &&
                        (buttons[6].getText()=="O") &&
                        (buttons[7].getText()=="X") &&
                        (buttons[8].getText()=="O")
        ) {
            gameOver(0, 1, 2, 3, 4, 5, 6, 7, 8);
        }
        if(
                (buttons[0].getText()=="O") &&
                        (buttons[1].getText()=="X") &&
                        (buttons[2].getText()=="O") &&
                        (buttons[3].getText()=="O") &&
                        (buttons[4].getText() =="O") &&
                        (buttons[5].getText()=="X") &&
                        (buttons[6].getText()=="X") &&
                        (buttons[7].getText()=="O") &&
                        (buttons[8].getText()=="X")
        ) {
            gameOver(0, 1, 2, 3, 4, 5, 6, 7, 8);
        }
        if(
                (buttons[0].getText()=="X") &&
                        (buttons[1].getText()=="O") &&
                        (buttons[2].getText()=="X") &&
                        (buttons[3].getText()=="X") &&
                        (buttons[4].getText() =="X") &&
                        (buttons[5].getText()=="O") &&
                        (buttons[6].getText()=="O") &&
                        (buttons[7].getText()=="X") &&
                        (buttons[8].getText()=="O")
        ) {
            gameOver(0, 1, 2, 3, 4, 5, 6, 7, 8);
        }
        if(
                (buttons[0].getText()=="X") &&
                        (buttons[1].getText()=="O") &&
                        (buttons[2].getText()=="X") &&
                        (buttons[3].getText()=="O") &&
                        (buttons[4].getText() =="O") &&
                        (buttons[5].getText()=="X") &&
                        (buttons[6].getText()=="O") &&
                        (buttons[7].getText()=="X") &&
                        (buttons[8].getText()=="O")
        ) {
            gameOver(0, 1, 2, 3, 4, 5, 6, 7, 8);
        }
        if(
                (buttons[0].getText()=="O") &&
                        (buttons[1].getText()=="X") &&
                        (buttons[2].getText()=="O") &&
                        (buttons[3].getText()=="X") &&
                        (buttons[4].getText() =="X") &&
                        (buttons[5].getText()=="O") &&
                        (buttons[6].getText()=="X") &&
                        (buttons[7].getText()=="O") &&
                        (buttons[8].getText()=="X")
        ) {
            gameOver(0, 1, 2, 3, 4, 5, 6, 7, 8);
        }
        if(
                (buttons[0].getText()=="O") &&
                        (buttons[1].getText()=="X") &&
                        (buttons[2].getText()=="O") &&
                        (buttons[3].getText()=="O") &&
                        (buttons[4].getText() =="X") &&
                        (buttons[5].getText()=="X") &&
                        (buttons[6].getText()=="X") &&
                        (buttons[7].getText()=="O") &&
                        (buttons[8].getText()=="X")
        ) {
            gameOver(0, 1, 2, 3, 4, 5, 6, 7, 8);
        }
        if(
                (buttons[0].getText()=="X") &&
                        (buttons[1].getText()=="O") &&
                        (buttons[2].getText()=="X") &&
                        (buttons[3].getText()=="X") &&
                        (buttons[4].getText() =="O") &&
                        (buttons[5].getText()=="O") &&
                        (buttons[6].getText()=="O") &&
                        (buttons[7].getText()=="X") &&
                        (buttons[8].getText()=="O")
        ) {
            gameOver(0, 1, 2, 3, 4, 5, 6, 7, 8);
        }
        if(
                (buttons[0].getText()=="O") &&
                        (buttons[1].getText()=="O") &&
                        (buttons[2].getText()=="X") &&
                        (buttons[3].getText()=="X") &&
                        (buttons[4].getText() =="X") &&
                        (buttons[5].getText()=="O") &&
                        (buttons[6].getText()=="O") &&
                        (buttons[7].getText()=="X") &&
                        (buttons[8].getText()=="O")
        ) {
            gameOver(0, 1, 2, 3, 4, 5, 6, 7, 8);
        }
        if(
                (buttons[0].getText()=="X") &&
                        (buttons[1].getText()=="X") &&
                        (buttons[2].getText()=="O") &&
                        (buttons[3].getText()=="O") &&
                        (buttons[4].getText() =="O") &&
                        (buttons[5].getText()=="X") &&
                        (buttons[6].getText()=="X") &&
                        (buttons[7].getText()=="O") &&
                        (buttons[8].getText()=="X")
        ) {
            gameOver(0, 1, 2, 3, 4, 5, 6, 7, 8);
        }
        if(
                (buttons[0].getText()=="O") &&
                        (buttons[1].getText()=="X") &&
                        (buttons[2].getText()=="O") &&
                        (buttons[3].getText()=="O") &&
                        (buttons[4].getText() =="X") &&
                        (buttons[5].getText()=="X") &&
                        (buttons[6].getText()=="X") &&
                        (buttons[7].getText()=="O") &&
                        (buttons[8].getText()=="O")
        ) {
            gameOver(0, 1, 2, 3, 4, 5, 6, 7, 8);
        }
        if(
                (buttons[0].getText()=="X") &&
                        (buttons[1].getText()=="O") &&
                        (buttons[2].getText()=="X") &&
                        (buttons[3].getText()=="X") &&
                        (buttons[4].getText() =="O") &&
                        (buttons[5].getText()=="O") &&
                        (buttons[6].getText()=="O") &&
                        (buttons[7].getText()=="X") &&
                        (buttons[8].getText()=="X")
        ) {
            gameOver(0, 1, 2, 3, 4, 5, 6, 7, 8);
        }
        if(
                (buttons[0].getText()=="O") &&
                        (buttons[1].getText()=="X") &&
                        (buttons[2].getText()=="X") &&
                        (buttons[3].getText()=="X") &&
                        (buttons[4].getText() =="O") &&
                        (buttons[5].getText()=="O") &&
                        (buttons[6].getText()=="X") &&
                        (buttons[7].getText()=="O") &&
                        (buttons[8].getText()=="X")
        ) {
            gameOver(0, 1, 2, 3, 4, 5, 6, 7, 8);
        }
        if(
                (buttons[0].getText()=="X") &&
                        (buttons[1].getText()=="O") &&
                        (buttons[2].getText()=="O") &&
                        (buttons[3].getText()=="O") &&
                        (buttons[4].getText() =="X") &&
                        (buttons[5].getText()=="X") &&
                        (buttons[6].getText()=="O") &&
                        (buttons[7].getText()=="X") &&
                        (buttons[8].getText()=="O")
        ) {
            gameOver(0, 1, 2, 3, 4, 5, 6, 7, 8);
        }
        if(
                (buttons[0].getText()=="O") &&
                        (buttons[1].getText()=="X") &&
                        (buttons[2].getText()=="O") &&
                        (buttons[3].getText()=="X") &&
                        (buttons[4].getText() =="X") &&
                        (buttons[5].getText()=="O") &&
                        (buttons[6].getText()=="O") &&
                        (buttons[7].getText()=="O") &&
                        (buttons[8].getText()=="X")
        ) {
            gameOver(0, 1, 2, 3, 4, 5, 6, 7, 8);
        }
        if(
                (buttons[0].getText()=="X") &&
                        (buttons[1].getText()=="O") &&
                        (buttons[2].getText()=="X") &&
                        (buttons[3].getText()=="O") &&
                        (buttons[4].getText() =="O") &&
                        (buttons[5].getText()=="X") &&
                        (buttons[6].getText()=="X") &&
                        (buttons[7].getText()=="X") &&
                        (buttons[8].getText()=="O")
        ) {
            gameOver(0, 1, 2, 3, 4, 5, 6, 7, 8);
        }
        if(
                (buttons[0].getText()=="O") &&
                        (buttons[1].getText()=="X") &&
                        (buttons[2].getText()=="O") &&
                        (buttons[3].getText()=="O") &&
                        (buttons[4].getText() =="X") &&
                        (buttons[5].getText()=="O") &&
                        (buttons[6].getText()=="X") &&
                        (buttons[7].getText()=="O") &&
                        (buttons[8].getText()=="X")
        ) {
            gameOver(0, 1, 2, 3, 4, 5, 6, 7, 8);
        }
        if(
                (buttons[0].getText()=="X") &&
                        (buttons[1].getText()=="O") &&
                        (buttons[2].getText()=="X") &&
                        (buttons[3].getText()=="X") &&
                        (buttons[4].getText() =="O") &&
                        (buttons[5].getText()=="X") &&
                        (buttons[6].getText()=="O") &&
                        (buttons[7].getText()=="X") &&
                        (buttons[8].getText()=="O")
        ) {
            gameOver(0, 1, 2, 3, 4, 5, 6, 7, 8);
        }
        if(
                (buttons[0].getText()=="X") &&
                        (buttons[1].getText()=="O") &&
                        (buttons[2].getText()=="O") &&
                        (buttons[3].getText()=="O") &&
                        (buttons[4].getText() =="X") &&
                        (buttons[5].getText()=="X") &&
                        (buttons[6].getText()=="X") &&
                        (buttons[7].getText()=="O") &&
                        (buttons[8].getText()=="O")
        ) {
            gameOver(0, 1, 2, 3, 4, 5, 6, 7, 8);
        }
        if(
                (buttons[0].getText()=="O") &&
                        (buttons[1].getText()=="X") &&
                        (buttons[2].getText()=="X") &&
                        (buttons[3].getText()=="X") &&
                        (buttons[4].getText() =="O") &&
                        (buttons[5].getText()=="O") &&
                        (buttons[6].getText()=="O") &&
                        (buttons[7].getText()=="X") &&
                        (buttons[8].getText()=="X")
        ) {
            gameOver(0, 1, 2, 3, 4, 5, 6, 7, 8);
        }
        if(
                (buttons[0].getText()=="X") &&
                        (buttons[1].getText()=="O") &&
                        (buttons[2].getText()=="X") &&
                        (buttons[3].getText()=="O") &&
                        (buttons[4].getText() =="X") &&
                        (buttons[5].getText()=="O") &&
                        (buttons[6].getText()=="O") &&
                        (buttons[7].getText()=="X") &&
                        (buttons[8].getText()=="O")
        ) {
            gameOver(0, 1, 2, 3, 4, 5, 6, 7, 8);
        }
        if(
                (buttons[0].getText()=="O") &&
                        (buttons[1].getText()=="X") &&
                        (buttons[2].getText()=="O") &&
                        (buttons[3].getText()=="X") &&
                        (buttons[4].getText() =="O") &&
                        (buttons[5].getText()=="X") &&
                        (buttons[6].getText()=="X") &&
                        (buttons[7].getText()=="O") &&
                        (buttons[8].getText()=="X")
        ) {
            gameOver(0, 1, 2, 3, 4, 5, 6, 7, 8);
        }
    }
    public void xWins(int a, int b, int c){

        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);

        for (int i = 0; i < 9; i++){
            buttons[i].setEnabled(false);
        }
        textField.setText("X wins");
        ImageIcon trophy = new ImageIcon("trophy.png");
        JOptionPane.showMessageDialog(
                null,
                "X is the winner!",
                "Results!",
                JOptionPane.INFORMATION_MESSAGE,
                trophy
        );
        scoresManager.addNewScoreForSpecificGame("Tictactoe game", new score.Score("1 point", "X gets "));
        frame.dispose();
        TicTacToeGameSettingFrame ticTacToeGameSettingFrame = new TicTacToeGameSettingFrame();

    }
    public void oWins(int a, int b, int c){
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);

        for (int i = 0; i < 9; i++){
            buttons[i].setEnabled(false);
        }
        textField.setText("O wins");
        ImageIcon trophy = new ImageIcon("trophy.png");
        JOptionPane.showMessageDialog(
                null,
                "O is the winner!",
                "Results!",
                JOptionPane.INFORMATION_MESSAGE,
                trophy
        );
        scoresManager.addNewScoreForSpecificGame("Tictactoe game", new score.Score("1 point", "O gets "));
        frame.dispose();
        TicTacToeGameSettingFrame ticTacToeGameSettingFrame = new TicTacToeGameSettingFrame();
    }
    public void gameOver(int a, int b, int c, int d, int e, int f, int g, int h, int l){
        for (int i = 0; i < 9; i++){
            buttons[i].setEnabled(false);
        }
        textField.setText("Game Over");
        ImageIcon trophy = new ImageIcon("trophy.png");
        JOptionPane.showMessageDialog(
                null,
                "Tie result!",
                "Results!",
                JOptionPane.INFORMATION_MESSAGE,
                trophy
        );
        scoresManager.addNewScoreForSpecificGame("Tictactoe game", new score.Score("0 points", "It's a tie "));
        frame.dispose();
        TicTacToeGameSettingFrame ticTacToeGameSettingFrame = new TicTacToeGameSettingFrame();
    }
}
