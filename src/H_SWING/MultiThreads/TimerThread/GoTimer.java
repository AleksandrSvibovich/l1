package H_SWING.MultiThreads.TimerThread;

import javax.swing.*;
import java.awt.*;

public class GoTimer {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                TimerFramThread frame = new TimerFramThread();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(300,250);
                frame.setTitle("Timer Thread");
                frame.setVisible(true);
            }
        });
    }
}
