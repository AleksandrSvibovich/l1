package H_SWING.MultiThreads.TimerWithTimer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

public class TimerWith extends JFrame {
    private JLabel label;
    private JButton start;
    private JButton stop;
    private long timeSec;
    private Timer timer;

    public TimerWith(){
        setLayout(new FlowLayout());
        label = new JLabel("This default text");
        start = new JButton("Start");
        stop = new JButton("Stop");
        stop.setEnabled(false);

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateTime();
            }
        };

        timer = new Timer(100, actionListener);

        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timeSec = Calendar.getInstance().getTimeInMillis();
                stop.setEnabled(true);
                start.setEnabled(false);
                timer.start();
            }
        });

        stop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                long stopTimeSec = Calendar.getInstance().getTimeInMillis();
                label.setText("time is: "+ (double)(stopTimeSec-timeSec)/1000);
                stop.setEnabled(false);
                start.setEnabled(true);
                timer.stop();
            }
        });

        add(start);
        add(stop);
        add(label);
    }

    private void updateTime() {
        long temp = Calendar.getInstance().getTimeInMillis();
        label.setText("time is out "+(double)(temp-timeSec)/1000);
    }
}
