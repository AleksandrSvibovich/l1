package H_SWING.TextEditor;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Aleksandr_Svibovich on 12/12/2018.
 */
public class StartTextEditor {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                TextEditorFrame frame = new TextEditorFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setTitle("Text Editor");
                frame.setSize(290,340);
                frame.setResizable(false);
                frame.setVisible(true);
            }
        });
    }
}
