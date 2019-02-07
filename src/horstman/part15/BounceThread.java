package horstman.part15;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Aleksandr_Svibovich on 11/28/2018.
 */
public class BounceThread {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new BounceFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(450,450);
                frame.setVisible(true);
            }
        });
    }
}
