package MyLP.Cells;

import javax.swing.*;
import java.awt.*;

public class StartCellsMoving {
    private static final int HEIGHT = 500;
    private static final int WIDTH = 350;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
                CellsFrame frame = new CellsFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(WIDTH,HEIGHT);
                frame.setLocation(dimension.width/2 - WIDTH/2, dimension.height/2 - HEIGHT/2);
                frame.setTitle("Cells v. 1.0.0");
                frame.setResizable(true);
                frame.setVisible(true);
            }
        });
    }
}
