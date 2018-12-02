package MyLP.Cells;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CellsFrame extends JFrame {

    private final JPanel panel;
    private JButton start;
    private JButton stop;
    private JButton pause;
    private Thread thread;
    private boolean isStartEnable;
    private boolean isStopEnable;
    private boolean isPauseEnable;
    Cell cell;


    public CellsFrame(){
        panel = new JPanel();
        start = new JButton("Start");
        pause = new JButton("Pause");
        stop = new JButton("Stop");
        stop.setEnabled(isStopEnable);
        pause.setEnabled(isPauseEnable);




        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                start.setEnabled(false);

            }
        });

        stop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        pause.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        panel.add(start);
        panel.add(pause);
        panel.add(stop);
        add(panel, BorderLayout.SOUTH);
//        add(cell);
        cell = new Cell(60,450,460, Color.RED);
        add(cell);


    }



}
