package HM.part9.task_08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Aleksandr_Svibovich on 11/28/2018.
 */
public class BounceFrame extends JFrame {
    private BallComponent comp;

    public BounceFrame() {
        comp = new BallComponent();
        JPanel buttonPanel = new JPanel();
        addButton(buttonPanel,"Start", new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                addBall();
            }
        });

        addButton(buttonPanel,"Close", new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        add(buttonPanel, BorderLayout.SOUTH);
        add(comp,BorderLayout.NORTH);
        pack();
    }

    private void addButton(JPanel buttonPanel, String title, ActionListener actionListener) {
        JButton button = new JButton(title);
        buttonPanel.add(button);
        button.addActionListener(actionListener);
    }

    public void addBall(){
        Ball b = new Ball();
        comp.add(b);
        add(comp);
        Runnable r = new BallRunable(b,comp);
        Thread t = new Thread(r);
        t.start();
    }
}
