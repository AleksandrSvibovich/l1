package horstman.part9.task_05;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Hashtable;

/**
 * Created by Aleksandr_Svibovich on 10/19/2018.
 */
public class DropList extends JFrame {
    private JPanel panel;
    private JComboBox<String> jComboBox;
    private JLabel label;
    private static final int SIZE = 28;
    private JSlider slider;

    public DropList() {

        JPanel panelSlider = new JPanel();
        slider = new JSlider(0, 100, 50);
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                JSlider sl = (JSlider) e.getSource();
                int value = sl.getValue();
                label.setFont(new Font("Serif", Font.PLAIN, value));
            }
        });
        // добавлем штрипки под бегунком
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        slider.setPaintTrack(false);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setLabelTable(getLabelTable());

        panelSlider.add(slider);
        add(panelSlider, BorderLayout.NORTH);


        label = new JLabel("This text should be change");
        label.setFont(new Font("Serif", Font.PLAIN, SIZE));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        add(label, BorderLayout.CENTER);

        jComboBox = new JComboBox<>();
        jComboBox.addItem("Serif");
        jComboBox.addItem("SanSerif");
        jComboBox.addItem("Monospaced");
        jComboBox.addItem("Dialog");

        jComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selected = jComboBox.getSelectedIndex();
                String fontName = jComboBox.getItemAt(selected);
                label.setFont(new Font(fontName, Font.BOLD, SIZE));
            }
        });

        panel = new JPanel();
        panel.add(jComboBox);
        add(panel, BorderLayout.SOUTH);
        pack();
    }

    private Hashtable<Integer,Component> getLabelTable() {
        Hashtable<Integer,Component> labelTable = new Hashtable<>();
        labelTable.put(0, new JLabel("0"));
        labelTable.put(20, new JLabel("20"));
        labelTable.put(40, new JLabel("40"));
        labelTable.put(60, new JLabel("60"));
        labelTable.put(80, new JLabel("80"));
        labelTable.put(100, new JLabel("100"));
        return labelTable;
    }

}
