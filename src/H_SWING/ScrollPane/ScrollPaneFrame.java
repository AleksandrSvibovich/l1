package H_SWING.ScrollPane;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Aleksandr_Svibovich on 12/7/2018.
 */
public class ScrollPaneFrame extends JFrame {
    public ScrollPaneFrame() {
        JLabel label = new JLabel("<html>text to scroll..oyyy eee;<br>" +
                "text to scroll..oyyy eee;text to scroll..oyyy eee;<br>" +
                "text to scroll..oyyy eee;<br>" +
                "text to scroll..oyyy eee;<br>" +
                "text to scroll..oyyy eee;<br>" +
                "text to scroll..oyyy eee<br>" +
                "to scroll..oyyy eee;<br>" +
                "text to scroll..oyyy eee;<br>" +
                "text to scroll..oyyy eee;<br>" +
                "text to scroll..oyyy eee;<br>" +
                "text to scroll..oyyy eee<br>" +
                "to scroll..oyyy eee;<br>" +
                "text to scroll..oyyy eee;<br>" +
                "text to scroll..oyyy eee;<br>" +
                "text to scroll..oyyy eee;<br>" +
                "text to scroll..oyyy eee<br>" +
                "to scroll..oyyy eee;<br>" +
                "text to scroll..oyyy eee;<br>" +
                "text to scroll..oyyy eee;<br>" +
                "text to scroll..oyyy eee;<br>" +
                "text to scroll..oyyy eee<br>" +
                "to scroll..oyyy eee;<br>" +
                "text to scroll..oyyy eee");
        label.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
        JLabel label1 = new JLabel("Text 1");
        JLabel label2 = new JLabel("<html>T<br>e<br>x<br>t<br>2");
        label2.setVerticalAlignment(SwingConstants.VERTICAL);
        JScrollPane pane = new JScrollPane(label);

        pane.setColumnHeaderView(label1);
        pane.setRowHeaderView(label2);


        add(pane);
    }
}
