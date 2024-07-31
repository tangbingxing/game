import javax.swing.*;

/**
 * @Classname GameFrame
 * @Description 游戏框架
 * @Version 1.0.0
 * @Date 2024/6/10 20:41
 * @Created by m1346
 */

public class GameFrame extends JFrame {
    GameFrame() {
        this.add(new GamePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
