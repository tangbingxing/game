import java.awt.*;
import java.util.Random;

/**
 * @Classname Ball
 * @Description 乒乓球
 * @Version 1.0.0
 * @Date 2024/6/9 20:53
 * @Created by m1346
 */

public class Ball extends Rectangle{
    Random random;
    int xVelocity;
    int yVelocity;
    int initialSpeed = 2;
    Ball(int x,int y,int width,int height) {
        super(x,y,width,height);
        random = new Random();
        int randomXDirection = random.nextInt(2);
        if(randomXDirection==0)
            randomXDirection--;
        setXDirection(randomXDirection*initialSpeed);

        int randomYDirection = random.nextInt(2);
        if(randomYDirection==0)
            randomYDirection--;
        setYDirection(randomYDirection*initialSpeed);
    }

    /**
     * 设置x方向的速度
     * @param xDirection
     */
    public void setXDirection(int xDirection) {
        xVelocity = xDirection;
    }

    /**
     * 设置y方向的速度
     * @param xYirection
     */
    public void setYDirection(int xYirection) {
        yVelocity = xYirection;
    }

    /**
     * 乒乓球移动
     */
    public void move() {
        x += xVelocity;
        y += yVelocity;
    }

    /**
     * 绘制乒乓球
     * @param g
     */
    public void draw(Graphics g) {
        g.setColor(Color.white);
        g.fillOval(x,y,height,width);
    }
}
