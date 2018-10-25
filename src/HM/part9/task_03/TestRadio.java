package HM.part9.task_03;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Aleksandr_Svibovich on 10/18/2018.
 */
public class TestRadio {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                RadioButtonFrame rbf = new RadioButtonFrame();
                rbf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                rbf.setSize(400,400);
                rbf.setVisible(true);
            }
        });
    }
}
