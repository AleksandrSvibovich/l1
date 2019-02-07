package com.my.projectc.cell;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Aleksandr_Svibovich on 1/22/2019.
 */
public class MyCellFrame extends JFrame {

    private static final int HEIGHT = 303;
    private static final int WIDTH = 403;
    private MyCellPanel gamePanel = new MyCellPanel(HEIGHT, WIDTH);
    private LifeThread controlThread = new LifeThread(gamePanel);

    public MyCellFrame() {
        setLayout(new FlowLayout());
        JPanel panel = new JPanel();
        JButton start = new JButton("Start");
        JButton stop = new JButton("Stop");
        JButton clear = new JButton("Clear");

        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controlThread.start();
                start.setEnabled(false);
                clear.setEnabled(false);
                start.setText("Running");
            }
        });

        stop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controlThread.setThreadStop();
                controlThread = new LifeThread(gamePanel);
                start.setEnabled(true);
                clear.setEnabled(true);
                start.setText("Start");
            }
        });

        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gamePanel.list = null;
                controlThread.setThreadStop();
                gamePanel.repaint();
            }
        });

        gamePanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                controlThread.mouseAction(e.getX(),e.getY());
            }
        });

        panel.add(start);
        panel.add(stop);
        panel.add(clear);

        add(gamePanel, BorderLayout.NORTH);
        add(panel, BorderLayout.SOUTH);
    }

}