package MyLP.Mover;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MoverFrame extends JFrame {
    private JPanel northPanel;
    private JPanel southPanel;
    private JButton start;
    private JButton stop;
    private JLabel label;
    private JTextField field;
    private Thread thread1;
    private JMenuBar jMenu;
    private JMenu file;
    private JMenu empty;
    private JMenuItem about;
    private AboutDialog dialog;

    public MoverFrame() {
        jMenu = new JMenuBar();
        setJMenuBar(jMenu);

        file = new JMenu("File");
        empty = new JMenu("");
        about = new JMenuItem("About");
        about.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(dialog == null){
                    dialog = new AboutDialog(MoverFrame.this);
                    dialog.setVisible(true);
                }else {
                    dialog.setVisible(true);
                }
            }
        });

        file.add(about);
        jMenu.add(file);
        jMenu.add(empty);

        start = new JButton("Start");
        stop = new JButton("Stop");
        label = new JLabel("Enter time in sec.");
        field = new JTextField(3);

        northPanel = new JPanel();
        northPanel.setLayout(new GridLayout(1, 2));
        northPanel.add(label);
        northPanel.add(field);

        add(northPanel, BorderLayout.NORTH);

        southPanel = new JPanel();
        southPanel.setLayout(new GridLayout(1, 2));

        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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
        add(southPanel, BorderLayout.SOUTH);
        pack();
    }


    private void actionMove() {
        String fieldText = field.getText();
        int userTimeOut = Integer.parseInt(fieldText);
        MoverRuner moverRuner1 = new MoverRuner(userTimeOut);
        thread1 = new Thread(moverRuner1);
        thread1.start();
    }
}


