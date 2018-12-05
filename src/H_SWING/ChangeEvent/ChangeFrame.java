package H_SWING.ChangeEvent;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

/**
 * Created by Aleksandr_Svibovich on 12/5/2018.
 */
public class ChangeFrame extends JFrame {
    private JLabel label;
    private JButton button;
    private JToggleButton toggleBtn;
    private JToggleButton toggleBtn2;

    public ChangeFrame(){
        setLayout(new FlowLayout());
        label = new JLabel("<html>The actual action is:<br>"+"none");
        button = new JButton("Press For Change");
        toggleBtn = new JToggleButton();
        toggleBtn2 = new JToggleButton("Text");

        button.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                ButtonModel model = button.getModel();
                String action ="";

                if(model.isEnabled()){
                    action += "Enabled <br>";
                }
                if (model.isArmed()){
                    action += "Armed <br>";
                }
                if (model.isPressed()){
                    action += "Pressed <br>";
                }
                if (model.isRollover()){
                    action += "Rollover <br>";
                }

                label.setText("<html>The actual action is:<br>" + action);
            }
        });


        add(label);
        add(button);
        add(toggleBtn);
        add(toggleBtn2);
        pack();
    }
}
