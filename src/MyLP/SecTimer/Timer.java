package MyLP.SecTimer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

/**
 * Created by Aleksandr_Svibovich on 12/4/2018.
 */
public class Timer extends JFrame {
    public long sec;

    public Timer() {
        setLayout(new FlowLayout());
        JPanel panel = new JPanel();
        JLabel timeInSeconds = new JLabel("Now nothing");
        JButton start = new JButton("Start");
        JButton stop = new JButton("Stop");

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Calendar calendar = Calendar.getInstance();
                if (e.getActionCommand().equalsIgnoreCase("Start")) {
                    sec = calendar.getTimeInMillis();
                    timeInSeconds.setText("in progress");
                } else {

                    Long result = (calendar.getTimeInMillis()-sec)/1000;
                    timeInSeconds.setText("Result is - " + result + " sec.");
                }
            }
        };
        start.addActionListener(listener);
        stop.addActionListener(listener);

        //adding to frame components
        panel.add(timeInSeconds);
        panel.add(start);
        panel.add(stop);
        add(panel);
        pack();

    }
}
