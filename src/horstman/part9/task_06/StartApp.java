package horstman.part9.task_06;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Aleksandr_Svibovich on 10/22/2018.
 */
public class StartApp {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                int sizeHorizontal = 750;
                int sizeVertical = 550;
                int locationX = (screenSize.width - sizeHorizontal) /2 ;
                int locationY = (screenSize.height - sizeVertical) /2 ;

                MenuFrame menuFrame = new MenuFrame();
                menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                menuFrame.setSize(450,450);
                menuFrame.setBounds(locationX,locationY,sizeHorizontal,sizeVertical);
                menuFrame.setVisible(true);
            }
        });
    }
}
