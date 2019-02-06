package MyLP.GameOfLife;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Aleksandr_Svibovich on 1/25/2019.
 */
public class FrameGameOfLife extends JFrame {

    private final int PADDING_X = 40;
    private final int PADDING_Y = 100;
    private  FieldGameOfLife fieldGameOfLife;
    private Life life;
    private Dead dead;
    private ExecutorService service;
    private Engine engine = new Engine();

    public FrameGameOfLife(int height, int width) {
        setLayout(new FlowLayout());
        JPanel panel = new JPanel();
        JButton start = new JButton("Start");
        JButton stop = new JButton("Stop");
        JButton clear = new JButton("Clear");
        fieldGameOfLife = new FieldGameOfLife(width - PADDING_X, height - PADDING_Y);
        engine.setFiled(fieldGameOfLife);
        dead = new Dead(fieldGameOfLife, engine);
        life = new Life(fieldGameOfLife, engine);

        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                service = Executors.newFixedThreadPool(2);
                service.submit(life);
                service.submit(dead);
                start.setEnabled(false);
                clear.setEnabled(false);
                start.setText("Running");
                service.shutdown();
            }
        });

        stop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                life.setFlag(false);
                dead.setFlag(false);
                start.setEnabled(true);
                clear.setEnabled(true);
                start.setText("Start");
                service.shutdown();
            }
        });

        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fieldGameOfLife.setListCell(new ArrayList<>());
                fieldGameOfLife.repaint();
            }
        });

        panel.add(start);
        panel.add(stop);
        panel.add(clear);

        add(fieldGameOfLife, BorderLayout.NORTH);
        add(panel, BorderLayout.SOUTH);
    }


}
