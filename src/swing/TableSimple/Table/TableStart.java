package swing.TableSimple.Table;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Aleksandr_Svibovich on 12/14/2018.
 */
public class TableStart {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                FrameTable frame = new FrameTable();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setTitle("Table Test");
                frame.setSize(450,160);
                frame.setResizable(true);
                frame.setVisible(true);
            }
        });
    }
}
