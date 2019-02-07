package horstman.part9.task_04;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Aleksandr_Svibovich on 10/19/2018.
 */
public class BorderFrame extends JFrame {
    private JPanel demoPanel;
    private JPanel buttonPanel;
    private ButtonGroup group;

    public BorderFrame(){
        demoPanel = new JPanel();
        buttonPanel = new JPanel();
        group = new ButtonGroup();

        addRadioButton("Lowered bevel",BorderFactory.createLoweredBevelBorder());
        addRadioButton("Raised bevel",BorderFactory.createRaisedBevelBorder());
        addRadioButton("Eathced",BorderFactory.createEtchedBorder());
        addRadioButton("Line",BorderFactory.createLineBorder(Color.blue));
        addRadioButton("Matte",BorderFactory.createMatteBorder(10,10,10,10,Color.CYAN));
        addRadioButton("Emty",BorderFactory.createEmptyBorder());

        Border ethced = BorderFactory.createEtchedBorder();
        Border title = BorderFactory.createTitledBorder(ethced,"Name Border");

        buttonPanel.setBorder(title);

        setLayout(new GridLayout(2,1));
        add(buttonPanel);
        add(demoPanel);
        pack();

    }

    public void addRadioButton(String name, final Border b) {
        JRadioButton button = new JRadioButton(name);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                demoPanel.setBorder(b);
            }
        });
        group.add(button);
        buttonPanel.add(button);
    }
}
