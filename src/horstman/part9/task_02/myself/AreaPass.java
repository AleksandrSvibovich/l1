package horstman.part9.task_02.myself;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Aleksandr_Svibovich on 10/17/2018.
 */
public class AreaPass extends JFrame {
    private JTextArea textArea = new JTextArea(4,20);
    private JPasswordField passwordField= new JPasswordField(20);
    private JScrollPane scrollPane = new JScrollPane(textArea);
    private JLabel label = new JLabel("Label one L");

    public AreaPass(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocation(380,60);

        JPanel jpanel = new JPanel();
        setLayout(new BorderLayout());
        jpanel.add(label,BorderLayout.CENTER);
        jpanel.add(passwordField,BorderLayout.CENTER);
        jpanel.add(scrollPane, BorderLayout.SOUTH);

        add(jpanel);

        pack();
    }
}
