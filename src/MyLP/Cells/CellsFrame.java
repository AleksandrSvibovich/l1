package MyLP.Cells;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CellsFrame extends JFrame {
    MyPanel panel2 = new MyPanel(302,400);

    public CellsFrame() {
        setLayout(new FlowLayout());
        JPanel panel = new JPanel();
        JButton start = new JButton("Start");
        JButton stop = new JButton("Stop");


        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel2.createCells();
                panel2.repaint();
            }
        };
        Timer timer = new Timer(500,listener);

        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timer.start();
            }
        });
        stop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timer.stop();
            }
        });


        panel.add(start);
        panel.add(stop);
        add(panel, BorderLayout.SOUTH);
        add(panel2, BorderLayout.NORTH);

    }
}