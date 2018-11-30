package HM.part9.task_06;

import javax.swing.*;
import java.awt.*;

public class Start {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                MyMenu menu = new MyMenu();
                Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
                int x = 450;
                int y = 650;
                int weight = (d.width - y) / 2;
                int height = (d.height - x) / 2;


                menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                menu.setBounds(weight, height,y, x);
                menu.setVisible(true);
            }
        });
    }
}
