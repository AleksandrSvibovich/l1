package MyLP.Cells;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyFrame extends JFrame {
    private static final int HEIGHT = 302;
    private static final int WIDTH = 402;
    MyPanel panel2 = new MyPanel(HEIGHT, WIDTH);

    public MyFrame() {
        setLayout(new FlowLayout());
        JPanel panel = new JPanel();
        JButton start = new JButton("Start");
        JButton stop = new JButton("Stop");
        JButton clean = new JButton("Clean");

//        ActionListener listener = new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                panel2.repaint();
//            }
//        };
//
//        Timer timer = new Timer(3000, listener);

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
                panel2.array = null;
                panel2.repaint();
            }
        });


        panel.add(start);
        panel.add(stop);
        panel.add(clean);

        add(panel2, BorderLayout.NORTH);
        add(panel, BorderLayout.SOUTH);


    }
}





