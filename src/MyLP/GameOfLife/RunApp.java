package MyLP.GameOfLife;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Aleksandr_Svibovich on 1/25/2019.
 */
public class RunApp {
    private static final int HEIGHT = 600;
    private static final int WIDTH = 390;

    public static void main(String[] args) {
        startApp();
    }

    private static void startApp() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
                FrameGameOfLife frame = new FrameGameOfLife(HEIGHT,WIDTH);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(WIDTH,HEIGHT);
                frame.setLocation(dimension.width/2 - WIDTH/2, dimension.height/2 - HEIGHT/2);
                frame.setTitle("Version 1.0.0");
                frame.setResizable(false);
                frame.setVisible(true);
            }
        });
    }
}
