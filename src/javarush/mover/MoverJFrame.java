package JR.Mover;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Aleksandr_Svibovich on 11/28/2018.
 */
public class MoverJFrame extends JFrame {
    private JPanel panel;
    private JButton start;
    private JButton stop;
    private JTextField limit;
    private JPanel northPanel;
    Runnable r;
    Thread tr1;

    public MoverJFrame() {

        northPanel = new JPanel();
        panel = new JPanel();
        start = new JButton("Start");
        stop = new JButton("Stop");
        limit = new JTextField(5);

        northPanel.setLayout(new GridLayout(1, 2));
        northPanel.add(new JLabel(" Limit "), SwingConstants.CENTER);
        northPanel.add(limit);

        stop.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                start.setEnabled(true);
                tr1.interrupt();
            }
        });

        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String x = limit.getText();
                limit.setEnabled(false);
                start.setEnabled(false);
                startMouseMoving(Integer.parseInt(x));

            }
        });

        panel.add(start);
        panel.add(stop);
        add(panel, BorderLayout.SOUTH);
        add(northPanel, BorderLayout.NORTH);

    }

    private void startMouseMoving(int time) {
        r = new MoverRunable(time);
        tr1 = new Thread(r);
        tr1.start();
    }
}


