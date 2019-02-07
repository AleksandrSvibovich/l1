package horstman.part8.task_02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ActionFrame extends JFrame {

    private JPanel panel;
    private static final int DW = 300;
    private static final int DH = 400;

    public ActionFrame(){
        panel = new JPanel();

        Action yellowAction = new ColorAction("Yellow", new ImageIcon("yellow_ball.gif"), Color.YELLOW);
        Action blueAction = new ColorAction("Blue", new ImageIcon("blue.gif"), Color.BLUE);
        Action redAction = new ColorAction("Red", new ImageIcon("red.gif"), Color.RED);

        panel.add(new JButton(yellowAction));
        panel.add(new JButton(blueAction));
        panel.add(new JButton(redAction));

        add(panel);

        InputMap imap = panel.getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        imap.put(KeyStroke.getKeyStroke("ctrl Y"), "panel.yellow");
        imap.put(KeyStroke.getKeyStroke("ctrl B"),"panel.blue");
        imap.put(KeyStroke.getKeyStroke("ctrl R"),"panel.red");

        ActionMap amap = panel.getActionMap();
        amap.put("panel.yellow",yellowAction);
        amap.put("panel.blue", blueAction);
        amap.put("panel.red",redAction);


    }

    private class ColorAction extends AbstractAction{

        public ColorAction(String name, ImageIcon icon, Color c){
            putValue(Action.NAME,name);
            putValue(Action.SMALL_ICON,icon);
            putValue(Action.SHORT_DESCRIPTION, "set panel color tooltip");
            putValue("color", c);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Color c = (Color)getValue("color");
            panel.setBackground(c);
        }
    }
}
