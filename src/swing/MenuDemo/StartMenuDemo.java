package swing.MenuDemo;



import javax.swing.*;
import java.awt.*;

/**
 * Created by Aleksandr_Svibovich on 12/13/2018.
 */
public class StartMenuDemo {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                MenuFrame frame = new MenuFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(200,300);
                frame.setTitle("Menu Frame Demo");
                frame.setResizable(false);
                frame.setVisible(true);
            }
        });
    }

}
