package MyLP.Mover;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Aleksandr_Svibovich on 11/30/2018.
 */
public class AboutDialog extends JDialog {
    public AboutDialog(JFrame owner) {
        super(owner,"About...", true);
        setLocation(600,400);
        add(new JLabel("<html><h1>Mishuta, Hello!</h></html>"), BorderLayout.NORTH);
        add(new JLabel("This program, moving cursor with preset time interval "), BorderLayout.CENTER);
        JButton ok = new JButton("Ok");
        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        JPanel panel = new JPanel();
        panel.add(ok);
        add(panel, BorderLayout.SOUTH);
        pack();
    }
}
