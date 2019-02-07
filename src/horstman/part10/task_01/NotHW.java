package horstman.part10.task_01;

import javax.swing.*;
import java.awt.*;

public class NotHW extends JApplet {

    public void init(){
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JLabel label = new JLabel("Bubaleh!!!",SwingConstants.CENTER);
                add(label);
            }
        });
    }
}
