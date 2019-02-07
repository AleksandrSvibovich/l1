package com.my.projectc.chatui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Aleksandr_Svibovich on 12/4/2018.
 */
public class GUIchat {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                MyFrame frame = new MyFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(400,400);
                frame.setTitle("Chat Frame without backend");
                frame.setResizable(false);
                frame.setVisible(true);
            }
        });
    }
}
