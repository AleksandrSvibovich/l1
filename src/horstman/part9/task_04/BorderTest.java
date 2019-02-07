package horstman.part9.task_04;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Aleksandr_Svibovich on 10/19/2018.
 */
public class BorderTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                BorderFrame frame = new BorderFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(350,350);
                frame.setVisible(true);
            }
        });
    }
}
