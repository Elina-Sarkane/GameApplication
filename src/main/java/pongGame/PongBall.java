package pongGame;

import java.awt.*;
import java.util.Random;

public class PongBall extends Rectangle{

    Random random;
    int xVelocity;
    int yVelocity;
    int ballSpeed = 3;


    PongBall(int x, int y, int width, int height){
        super(x, y, width, height);
        random= new Random();
        int randomXDirection = random.nextInt(2);
        if(randomXDirection == 0)
            randomXDirection--;
        setXDirection(randomXDirection*ballSpeed);

        int randomYDirection = random.nextInt(2);
        if(randomYDirection == 0)
            randomYDirection--;
        setXDirection(randomYDirection*ballSpeed);
    }

    public void setXDirection(int randomXDirection){
        xVelocity = randomXDirection;
    }
    public void setYDirection(int randomYDirection) {
        yVelocity = randomYDirection;
    }
    public void move(){
        x += xVelocity;
        y += yVelocity;
    }
    public void draw(Graphics g){
        g.setColor(Color.white);
        g.fillOval(x, y, width, height);
    }
}