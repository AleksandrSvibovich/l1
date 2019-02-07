package com.my.projectc.chatui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Aleksandr_Svibovich on 12/4/2018.
 */
public class MyFrame extends JFrame {


    public MyFrame(){
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JLabel label = new JLabel("Enter text ");
        JTextField field = new JTextField(10);
        JButton send = new JButton("Send");
        JButton reset = new JButton("Reset");

        panel.add(label);
        panel.add(field);
        panel.add(send);
        panel.add(reset);
        panel.setBackground(Color.GRAY);

        add(panel,BorderLayout.SOUTH);


        JMenuBar bar = new JMenuBar();
        setJMenuBar(bar);
        JMenu file = new JMenu("File");
        JMenu help = new JMenu("Help");

        JMenuItem open = new JMenuItem("Open");
        JMenuItem saveAs = new JMenuItem("Save as");
        JMenuItem about = new JMenuItem("About");

        file.add(open);
        file.add(saveAs);

        help.add(about);

        bar.add(file);
        bar.add(help);

        JPanel panelMessage = new JPanel();
        panelMessage.setBackground(Color.WHITE);
        add(panelMessage,BorderLayout.CENTER);


    }
}
