package MyLP.MultiCells;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Aleksandr_Svibovich on 1/22/2019.
 */
public class RunnerApp {
    private static final int HEIGHT = 500;
    private static final int WIDTH = 350;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
                MyCellFrame mcf = new MyCellFrame();
                mcf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                mcf.setSize(WIDTH,HEIGHT);
                mcf.setLocation(dimension.width/2 - WIDTH/2, dimension.height/2 - HEIGHT/2);
                mcf.setTitle("Version 0.0.12");
                mcf.setResizable(false);
                mcf.setVisible(true);
            }
        });
    }
}
