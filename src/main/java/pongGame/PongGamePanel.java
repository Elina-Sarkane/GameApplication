package pongGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

public class PongGamePanel extends JPanel implements Runnable {

    static final int GAME_WIDTH = 1000;
    static final int GAME_HEIGHT = (int) (GAME_WIDTH * (0.5555));
    static final Dimension SCREEN_SIZE = new Dimension(GAME_WIDTH, GAME_HEIGHT);
    static final int BALL_DIAMETER = 20;
    static final int PADDLE_WIDTH = 25;
    static final int PADDLE_HEIGHT = 100;
    Thread gameThread;
    Image image;
    Graphics graphics;
    Random random;
    PongPaddle pongPaddle1;
    PongPaddle pongPaddle2;
    PongBall ball;
    PongGameScore pongGameScore;

    PongGamePanel(){
        newPaddles();
        newBall();
        pongGameScore = new PongGameScore(GAME_WIDTH, GAME_HEIGHT);
        this.setFocusable(true);
        this.setLayout(null);
        this.addKeyListener(new ActionListener());
        this.setPreferredSize(SCREEN_SIZE);

        gameThread = new Thread(this);
        gameThread.start();

    }

    public void newBall(){
        random = new Random();
        ball = new PongBall((GAME_WIDTH/2)-(BALL_DIAMETER/2), random.nextInt(GAME_HEIGHT-BALL_DIAMETER), BALL_DIAMETER, BALL_DIAMETER);

    }
    public void newPaddles(){

        pongPaddle1 = new PongPaddle(0, (GAME_HEIGHT/2) - (PADDLE_HEIGHT/2), PADDLE_WIDTH, PADDLE_HEIGHT, 1);
        pongPaddle2 = new PongPaddle(GAME_WIDTH-PADDLE_WIDTH, (GAME_HEIGHT/2) - (PADDLE_HEIGHT/2), PADDLE_WIDTH, PADDLE_HEIGHT, 2);
    }
    public void paint(Graphics g){

        image = createImage(getWidth(), getHeight());
        graphics = image.getGraphics();
        draw(graphics);
        g.drawImage(image, 0, 0,this);
    }
    public void draw(Graphics g){
        pongPaddle1.draw(g);
        pongPaddle2.draw(g);
        ball.draw(g);
        pongGameScore.draw(g);
    }
    public void move(){
        pongPaddle1.move();
        pongPaddle2.move();
        ball.move();
    }
    public void checkCollision(){
        //bounce ball positions from bottom and top
        if(ball.y <= 0){
            ball.setYDirection(-ball.yVelocity);
        }
        if (ball.y >= GAME_HEIGHT-BALL_DIAMETER){
            ball.setYDirection(-ball.yVelocity);
        }

        //bounce ball position from right and left
        if (ball.intersects(pongPaddle1)){
            ball.xVelocity = Math.abs(ball.xVelocity);
            ball.xVelocity++;
            if (ball.yVelocity>0)
                ball.yVelocity++;
            else
                ball.yVelocity--;
            ball.setXDirection(ball.xVelocity);
            ball.setYDirection(ball.yVelocity);
        }
        if (ball.intersects(pongPaddle2)){
            ball.xVelocity = Math.abs(ball.xVelocity);
            ball.xVelocity++;
            if (ball.yVelocity>0)
                ball.yVelocity++;
            else
                ball.yVelocity--;
            ball.setXDirection(-ball.xVelocity);
            ball.setYDirection(ball.yVelocity);
        }

        //stops paddles at window edges
        if(pongPaddle1.y <=0)
            pongPaddle1.y=0;
        if(pongPaddle1.y >= (GAME_HEIGHT-PADDLE_HEIGHT))
            pongPaddle1.y = GAME_HEIGHT-PADDLE_HEIGHT;
        if(pongPaddle2.y <=0)
            pongPaddle2.y=0;
        if(pongPaddle2.y >= (GAME_HEIGHT-PADDLE_HEIGHT))
            pongPaddle2.y = GAME_HEIGHT-PADDLE_HEIGHT;

        //give player 1 point, creates new paddles and ball
        if(ball.x <= 0){
            pongGameScore.player2++;
            newPaddles();
            newBall();
            System.out.println("Player 2 scored: " + pongGameScore.player2);
        }

        if(ball.x >= GAME_WIDTH-BALL_DIAMETER){
            pongGameScore.player1++;
            newPaddles();
            newBall();
            System.out.println("Player 1 scored: " + pongGameScore.player1);
        }
    }
    public void run(){
        long lastTime = System.nanoTime();
        double amountOfTicks = 60.0;
        double nanoSeconds = 1000000000 / amountOfTicks;
        double delta = 0;
        while (true){
            long now = System.nanoTime();
            delta += (now - lastTime) / nanoSeconds;
            lastTime = now;
            if(delta>= 1){
                move();
                checkCollision();
                repaint();
                delta--;
            }
        }

    }
    public class ActionListener extends KeyAdapter {
        public void keyPressed(KeyEvent e){
            pongPaddle1.keyPressed(e);
            pongPaddle2.keyPressed(e);
        }
        public void keyReleased(KeyEvent e){
            pongPaddle1.keyReleased(e);
            pongPaddle2.keyReleased(e);
        }
    }
}
