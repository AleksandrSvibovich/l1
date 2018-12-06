package H_SWING.AudioMixer;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Aleksandr_Svibovich on 12/6/2018.
 */
public class RunApp {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                MixerFrame frame = new MixerFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(360,520);
                frame.setTitle("Mixer Test");
                frame.setResizable(false);
                frame.setVisible(true);
            }
        });
    }
}
