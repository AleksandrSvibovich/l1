package H_SWING.ChangeEvent;
import javax.swing.*;
import java.awt.*;

/**
 * Created by Aleksandr_Svibovich on 12/5/2018.
 */
public class StartChange {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                ChangeFrame frame = new ChangeFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(320,450);
                frame.setTitle("Change Frame");
                frame.setResizable(false);
                frame.setVisible(true);
            }
        });
    }
}
