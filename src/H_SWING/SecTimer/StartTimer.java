package H_SWING.SecTimer;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Aleksandr_Svibovich on 12/4/2018.
 */
public class StartTimer {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Timer frame = new Timer();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(320,90);
                frame.setTitle("Timer");
                frame.setResizable(false);
                frame.setVisible(true);
            }
        });
    }
}
