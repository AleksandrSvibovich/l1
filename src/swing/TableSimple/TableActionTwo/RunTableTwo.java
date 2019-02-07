package swing.TableSimple.TableActionTwo;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Aleksandr_Svibovich on 12/17/2018.
 */
public class RunTableTwo {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                TableTwoFrame frame = new TableTwoFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setTitle("Frame Two Actions");
                frame.setSize(450,300);
                frame.setResizable(false);
                frame.setVisible(true);

            }
        });
    }
}
