package swing.Jfromatted;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Aleksandr_Svibovich on 12/11/2018.
 */
public class RunJFormatted {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFormattedFrame frame = new JFormattedFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(350,350);
                frame.setTitle("J Frormatted Frame");
                frame.setResizable(true);
                frame.setVisible(true);
            }
        }
        );
    }
}
