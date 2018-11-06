package HM.part9.task_07;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Aleksandr_Svibovich on 10/31/2018.
 */
public class startPanel {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                PanelMy my = new PanelMy();
                my.setTitle("GridBagLayoutTest");
                my.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                my.setVisible(true);
            }
        });
    }
}
