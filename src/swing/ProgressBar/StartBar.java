package swing.ProgressBar;

import javax.swing.*;
import java.awt.*;

public class StartBar {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                ProgressFrame frame = new ProgressFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(200,300);
                frame.setTitle("Progress Frame");
                frame.setResizable(false);
                frame.setVisible(true);
            }
        });
    }
}
