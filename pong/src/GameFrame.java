import javax.swing.*;
import java.awt.*;

/**
 * @Classname GameFrame
 * @Description 游戏框架
 * @Version 1.0.0
 * @Date 2024/6/9 20:53
 * @Created by m1346
 */

public class GameFrame extends JFrame {
    GamePanel panel;
    GameFrame() {
        panel = new GamePanel();
        this.add(panel);
        this.setTitle("Pong Game");
        this.setResizable(false);
        this.setBackground(Color.black);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
