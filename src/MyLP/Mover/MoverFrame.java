package MyLP.Mover;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.PrivateKey;

public class MoverFrame extends JFrame {
    private JPanel northPanel;
    private JPanel southPanel;
    private JButton start;
    private JButton stop;
    private JLabel label;
    private JTextField field;
    private MoverRuner moverRuner;
    private Thread thread1 = new Thread(moverRuner);

    public MoverFrame(){
        start = new JButton("Start");
        stop = new JButton("Stop");
        label = new JLabel("Enter time in sec.");
        field = new JTextField(3);

        northPanel = new JPanel();
        northPanel.setLayout(new GridLayout(1,2));
        northPanel.add(label);
        northPanel.add(field);

        add(northPanel,BorderLayout.NORTH);

        southPanel = new JPanel();
        southPanel.setLayout(new GridLayout(1,2));

        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getUserTimeOut(field.getText());
                start.setEnabled(false);
                field.setEnabled(false);
                actionMove();
            }

        });

        stop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                start.setEnabled(true);
                thread1.interrupt();
            }
        });

        southPanel.add(start);
        southPanel.add(stop);
        add(southPanel,BorderLayout.SOUTH);

    }

    private void getUserTimeOut(String text) {
        int num;
        if(!text.equalsIgnoreCase("")){
            num = Integer.parseInt(text);
        }else {
            num = 5;
        }
        moverRuner =  new MoverRuner(num);

    }


    private void actionMove() {
        thread1.run();
    }
}
