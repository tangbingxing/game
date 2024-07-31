import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * @Classname Paddle
 * @Description 球拍
 * @Version 1.0.0
 * @Date 2024/6/9 20:53
 * @Created by m1346
 */

public class Paddle extends Rectangle {
    int id;
    int yVelocity;
    int speed = 10;

    //创建球拍对象函数
    Paddle(int x, int y, int PADDLE_WIDTH, int PADDLE_HEIGHT, int id) {
        super(x, y, PADDLE_WIDTH, PADDLE_HEIGHT);
        this.id = id;
    }

    //按下按键监听函数
    public void keyPressed(KeyEvent e) {
        switch (id) {
            case 1:
                if (e.getKeyCode() == KeyEvent.VK_W) {
                    setYDirection(-speed);
                    move();
                }
                if (e.getKeyCode() == KeyEvent.VK_S) {
                    setYDirection(speed);
                    move();
                }
                break;
            case 2:
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    setYDirection(-speed);
                    move();
                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    setYDirection(speed);
                    move();
                }
                break;
        }
    }

    //释放按键监听函数
    public void keyReleased(KeyEvent e) {
        switch (id) {
            case 1:
                if (e.getKeyCode() == KeyEvent.VK_W) {
                    setYDirection(0);
                    move();
                }
                if (e.getKeyCode() == KeyEvent.VK_S) {
                    setYDirection(0);
                    move();
                }
                break;
            case 2:
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    setYDirection(0);
                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    setYDirection(0);
                }
                break;
        }
    }

    //设置y方向速度函数
    public void setYDirection(int yDirection) {
        yVelocity = yDirection;
    }

    //球拍移动函数
    public void move() {
        y = y + yVelocity;
    }

    //绘制球拍函数
    public void draw(Graphics g) {
        if (id == 1) {
            g.setColor(Color.BLUE);
        } else {
            g.setColor(Color.RED);
        }
        g.fillRect(x, y, width, height);
    }
}
