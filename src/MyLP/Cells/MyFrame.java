package MyLP.Cells;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyFrame extends JFrame {
    private static final int WIDTH = 302;
    private static final int HEIGHT = 400;
    MyPanel panel2 = new MyPanel(WIDTH,HEIGHT);
    RemoveCell rc = new RemoveCell();
    Thread killThread = new Thread(rc);

    public MyFrame() {
        setLayout(new FlowLayout());
        JPanel panel = new JPanel();
        JButton start = new JButton("Start");
        JButton stop = new JButton("Stop");


        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CellsActions().generate(WIDTH,HEIGHT);
                panel2.repaint();
            }
        };
        Timer timer = new Timer(1000,listener);

        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                start.setEnabled(false);
                timer.start();
                killThread.start();

            }
        });

        stop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                start.setEnabled(true);
                timer.stop();
            }
        });


        panel.add(start);
        panel.add(stop);
        add(panel, BorderLayout.SOUTH);
        add(panel2, BorderLayout.NORTH);

    }
}