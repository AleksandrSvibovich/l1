package HM.part9.task_03;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Aleksandr_Svibovich on 10/18/2018.
 */
public class RadioButtonFrame extends JFrame {
    private JPanel panel;
    private JPanel panel2;
    private JPanel panel3;
    private ButtonGroup group;
    private JLabel label;
    private static final int DEFAULT_SIZE = 36;

    public RadioButtonFrame(){
        panel2 = new JPanel();
        panel3 = new JPanel();
        label = new JLabel("Text for resize");
        label.setFont(new Font("Serif",Font.PLAIN, DEFAULT_SIZE));
        panel2.add(label);
        add(panel2,BorderLayout.CENTER);

        panel = new JPanel();
        group = new ButtonGroup();

        Border etched = BorderFactory.createEtchedBorder();
        Border titled = BorderFactory.createTitledBorder(etched,"E Title");
        panel.setBorder(titled);

        addRadioButton("Small", 12);
        addRadioButton("Medium", 18);
        addRadioButton("Large", 22);
        addRadioButton("Giant", 36);

        add(panel,BorderLayout.SOUTH);
        pack();
    }

    private void addRadioButton(String name, int size) {
        boolean selected = (size == DEFAULT_SIZE);
        JRadioButton button = new JRadioButton(name,selected);
        group.add(button);
        panel.add(button);

        ActionListener action = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setFont(new Font("Serif",Font.PLAIN,size));
            }
        };
        button.addActionListener(action);
    }
}
