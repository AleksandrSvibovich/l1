package JR.Mover;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Aleksandr_Svibovich on 11/28/2018.
 */
public class MoverRun {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new MoverJFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setTitle("Mover Run v1.0.6");
                frame.setSize(290,190);
                frame.setLocation(815,445);
                frame.setResizable(false);
                frame.setVisible(true);
            }
        });

    }
}
