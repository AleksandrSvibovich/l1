package swing.Phone_book;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Aleksandr_Svibovich on 12/5/2018.
 */
public class PhoneBook {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                PhoneBookFrame frame = new PhoneBookFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(200,300);
                frame.setTitle("Phone Book");
                frame.setResizable(false);
                frame.setVisible(true);
            }
        });
    }
}
