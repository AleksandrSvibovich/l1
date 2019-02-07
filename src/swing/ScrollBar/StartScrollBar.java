package swing.ScrollBar;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Aleksandr_Svibovich on 12/6/2018.
 */
public class StartScrollBar {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                SBFrame frame = new SBFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(480,300);
                frame.setTitle("SB Test");
                frame.setResizable(true);
                frame.setVisible(true);
            }
        });
    }
}
