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




    public CellsFrame(){
        panel = new JPanel();
        start = new JButton("Start");
        pause = new JButton("Pause");
        stop = new JButton("Stop");
        stop.setEnabled(false);
        pause.setEnabled(false);

        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                start.setEnabled(false);
                stop.setEnabled(true);
                pause.setEnabled(true);
            }
        });

        stop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                start.setEnabled(true);

            }
        });

        panel.add(start);
        panel.add(pause);
        panel.add(stop);
        add(panel, BorderLayout.SOUTH);
    }

    private void goToLife() {
        thread = new Thread(new Cell());
        thread.start();
    }


}
