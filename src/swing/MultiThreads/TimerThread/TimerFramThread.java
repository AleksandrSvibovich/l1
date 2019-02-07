package swing.MultiThreads.TimerThread;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

public class TimerFramThread extends JFrame {
    private JLabel label;
    private JButton start;
    private JButton stop;
    private long startTime;
    private boolean isRunning = false;
    Thread thread;

    public TimerFramThread() {
        setLayout(new FlowLayout());
        label = new JLabel("Press start to begin");
        start = new JButton("Start");
        stop = new JButton("Stop");

        stop.setEnabled(false);

        Runnable myThread = new Runnable() {
            @Override
            public void run() {
                try {
                    while (true) {
                        Thread.sleep(10);
                        updateTime();
//                        SwingUtilities.invokeLater(new Runnable() {
//                            @Override
//                            public void run() {
//                                updateTime();
//                            }
//                        });
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        thread = new Thread(myThread);
        thread.start();

        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startTime = Calendar.getInstance().getTimeInMillis();
                stop.setEnabled(true);
                start.setEnabled(false);
                isRunning = true;
            }
        });

        stop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                long finish = Calendar.getInstance().getTimeInMillis();
                label.setText(" Elapsed time is " + (double) (finish - startTime) / 1000);
                stop.setEnabled(false);
                start.setEnabled(true);
                isRunning = false;
            }
        });

        add(start);
        add(stop);
        add(label);
    }

    private void updateTime() {
        if (!isRunning) return;
        long temp = Calendar.getInstance().getTimeInMillis();
        label.setText(" Elapsed time is " + (double) (temp - startTime) / 1000);
    }
}
