package swing.SecTimer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Aleksandr_Svibovich on 12/4/2018.
 */
public class Timer extends JFrame {
    public double sec;
    String one = "";
    String two = "";
    String three = "";

    public Timer() {
        setLayout(new FlowLayout());
        JPanel panel = new JPanel();
        JLabel timeInSeconds = new JLabel("Now nothing");
        JButton start = new JButton("Start");
        JButton stop = new JButton("Stop");
        JLabel log = new JLabel("logging on:");
        JCheckBox logOn = new JCheckBox();
        JLabel logMessage = new JLabel();


        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                if (e.getActionCommand().equalsIgnoreCase("Start")) {
                    stop.setEnabled(true);
                    start.setEnabled(false);
                    sec = (double) e.getWhen();
                    timeInSeconds.setText("in progress");
                } else {
                    start.setEnabled(true);
                    stop.setEnabled(false);
                    double result = (double) ((e.getWhen() - sec) / 1000);
                    if (logOn.isSelected()) {
                        if (one.equals("")) {
                            one = result + ";";
                        } else if (two.equals("")) {
                            two = result + ";";
                        } else if (three.equals("")) {
                            three = result + ";";
                        } else {
                            one = two;
                            two = three;
                            three = result + ";";
                        }
                        logMessage.setText(one + " " + two + " " + three + " ");
                    }
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
        add(log);
        add(logOn);
        add(logMessage);
        pack();

    }
}
