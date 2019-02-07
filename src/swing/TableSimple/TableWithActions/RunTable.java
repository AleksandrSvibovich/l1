package swing.TableSimple.TableWithActions;

import java.awt.*;

/**
 * Created by Aleksandr_Svibovich on 12/14/2018.
 */
public class RunTable {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                ActionTableFrame frame = new ActionTableFrame();
                frame.setTitle("Table Action Test");
                frame.setSize(450,160);
                frame.setResizable(true);
                frame.setVisible(true);
            }
        });
    }


}
