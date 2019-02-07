package MyLP.GameOfLife;

import javax.swing.*;
import java.awt.*;

import MyLP.GameOfLife.controller.Controller;
import MyLP.GameOfLife.model.Model;
import MyLP.GameOfLife.view.View;

/**
 * Created by Aleksandr_Svibovich on 1/25/2019.
 */
public class Application implements Runnable {
    private static final int HEIGHT = 800;
    private static final int WIDTH = 740;

    public static void main(String[] args) {
        new Application().run();
    }

    @Override
    public void run() {
//                Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
//                FrameGameOfLife frame = new FrameGameOfLife(HEIGHT,WIDTH);
//                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//                frame.setSize(WIDTH,HEIGHT);
//                frame.setLocation(dimension.width/2 - WIDTH/2, dimension.height/2 - HEIGHT/2);
//                frame.setTitle("Version 1.0.0");
//                frame.setResizable(true);
//                frame.setVisible(true);
        Controller controller = new Controller(new View(), new Model());
        controller.run();
    }
}
