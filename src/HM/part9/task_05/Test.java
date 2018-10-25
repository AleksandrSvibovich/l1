package HM.part9.task_05;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Aleksandr_Svibovich on 10/19/2018.
 */
public class Test {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                DropList frame = new DropList();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(400,400);
                frame.setVisible(true);
            }
        });
    }
}
