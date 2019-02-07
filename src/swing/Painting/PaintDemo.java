package swing.Painting;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PaintDemo {
    JButton more;
    JButton jsize;
    JLabel label;
    PaintPanel pp;
    boolean big;

    public PaintDemo() {
        JFrame frame = new JFrame("test frame");
        frame.setSize(240, 260);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pp = new PaintPanel(100, 100);
        more = new JButton("more");
        jsize = new JButton("size");
        label = new JLabel("Random tooltip");

        more.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pp.repaint();
            }
        });

        jsize.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!big){
                    pp.changeBorderSize(5);
                }else {
                    pp.changeBorderSize(1);
                }
                big = !big;
            }
        });

        big = false;
        frame.setLayout(new FlowLayout());
        frame.add(pp);
        frame.add(jsize);
        frame.add(more);
        frame.add(label);
        frame.setVisible(true);


    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PaintDemo();
            }
        });
    }
}
