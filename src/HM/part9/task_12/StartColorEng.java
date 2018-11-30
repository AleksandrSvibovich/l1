package HM.part9.task_12;

import javax.swing.*;
import java.awt.*;

public class StartColorEng {
    public static void main(String[] args) {
        JFrame frame = new JFrame();


        ColorChooserPanel panel = new ColorChooserPanel();

        frame.add(panel, BorderLayout.CENTER);
        frame.setSize(400,300);
        frame.setVisible(true);
    }
}
