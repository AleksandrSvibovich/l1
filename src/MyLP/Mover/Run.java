package MyLP.Mover;

import javax.swing.*;
import java.awt.*;

public class Run {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                MoverFrame mf = new MoverFrame();
                mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                mf.setSize(260,190);
                mf.setTitle("Mover v 1.08");
                mf.setLocation(600,400);
                mf.setResizable(false);
                mf.setVisible(true);
            }
        });
    }
}
