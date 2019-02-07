package horstman.part9.task_02.fromBook;

import java.awt.*;

/**
 * Created by Aleksandr_Svibovich on 10/17/2018.
 */
public class Start {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                TextComponentFrame f = new TextComponentFrame();
                f.setVisible(true);
            }
        });
    }
}
