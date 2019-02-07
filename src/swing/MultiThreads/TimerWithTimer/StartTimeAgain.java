package swing.MultiThreads.TimerWithTimer;

import javax.swing.*;
import java.awt.*;

public class StartTimeAgain {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                TimerWith frame = new TimerWith();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(300,250);
                frame.setTitle("Timer Thread");
                frame.setVisible(true);
            }
        });
    }
}
