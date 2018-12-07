package H_SWING.ScrollPane;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Aleksandr_Svibovich on 12/7/2018.
 */
public class ScrollStart {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                ScrollPaneFrame frame = new ScrollPaneFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(140,200);
                frame.setTitle("ScrollPaneFrame");
                frame.setResizable(true);
                frame.setVisible(true);
            }
        });
    }
}
