package swing.ProgressBar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProgressFrame extends JFrame {
    public ProgressFrame(){
        setLayout(new FlowLayout());

        JButton buttonPushMe = new JButton("Push Me");
        JProgressBar bar = new JProgressBar();
        JLabel labelInfo = new JLabel("Result of bar moving is: ");
        bar.setStringPainted(true);
        bar.setIndeterminate(true);

        buttonPushMe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bar.setValue(bar.getValue()+10);
            }
        });

        add(bar);
        add(labelInfo);
        add(buttonPushMe);

    }
}
