package H_SWING.JList;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Aleksandr_Svibovich on 12/10/2018.
 */
public class JListTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JListFrame frame = new JListFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(320,450);
                frame.setTitle("J list Frame");
                frame.setResizable(true);
                frame.setVisible(true);
            }
        });
    }
}
