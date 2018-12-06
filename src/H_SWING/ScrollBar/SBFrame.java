package H_SWING.ScrollBar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

/**
 * Created by Aleksandr_Svibovich on 12/6/2018.
 */
public class SBFrame extends JFrame {

    public SBFrame(){
        setLayout(new FlowLayout());
        JLabel labVert = new JLabel("Vertical scroll bar: 0;");
        JLabel labHoriz = new JLabel("Horizontal scroll bar: 0");
        JScrollBar bar = new JScrollBar();
        JScrollBar bar2 = new JScrollBar(Adjustable.HORIZONTAL);
        JLabel info;

        bar.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                if(bar.getValueIsAdjusting()) return;

                labVert.setText("Value of vertical scroll bar: " + e.getValue() + "; ");
            }
        });

        bar2.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                labHoriz.setText("Value of Horizontal scroll bar: " + e.getValue());
            }
        });

        info = new JLabel("<html> Scroll bar defaults<br>" +
        "minimum value: " +
        bar.getMinimum() + "<br>" +
        "maximum: " +
        bar.getMaximum() + "<br>" +
        "Visible amount: " +
        bar.getVisibleAmount() + "<br>" +
        "Block increment: " +
        bar.getBlockIncrement() + "<br>" +
        "Unit increment: " +
        bar.getUnitIncrement());

        add(bar);
        add(bar2);
        add(labVert);
        add(labHoriz);
        add(info);
        pack();
    }
}
