package MyLP.Cells;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MyFrame extends JFrame {
    private static final int HEIGHT = 303;
    private static final int WIDTH = 403;
    MyPanel panel2 = new MyPanel(HEIGHT, WIDTH);

    public MyFrame() {
        setLayout(new FlowLayout());
        JPanel panel = new JPanel();
        JButton start = new JButton("Start");
        JButton stop = new JButton("Stop");
        JButton clean = new JButton("Clean");
        JButton step = new JButton("Step");

        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel2.initiateStartScreen();
                start.setEnabled(false);
                start.setText("Running");
                clean.setEnabled(false);
                panel2.repaint();
            }
        });

        stop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                start.setEnabled(true);
                start.setText("Start");
                clean.setEnabled(true);
            }
        });

        clean.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel2.list = null;
                panel2.repaint();
            }
        });

        step.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel2.list = panel2.getNextGeneration();
                panel2.repaint();
            }
        });

        panel2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                panel2.mouseAction(e.getX(),e.getY());
            }
        });

        panel.add(start);
        panel.add(step);
        panel.add(stop);
        panel.add(clean);

        add(panel2, BorderLayout.NORTH);
        add(panel, BorderLayout.SOUTH);


    }
}





