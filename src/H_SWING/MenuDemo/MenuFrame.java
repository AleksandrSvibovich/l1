package H_SWING.MenuDemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by Aleksandr_Svibovich on 12/13/2018.
 */
public class MenuFrame extends JFrame {
    JLabel label; 
    JMenuBar menuBar;
    JToolBar toolBar;
    JPopupMenu popupMenu;

    DebugAction setAct;
    DebugAction clearAct;
    DebugAction resumeAct;

    ActionListener listener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String comStr = e.getActionCommand();
            if (comStr.equalsIgnoreCase("Exit")) {
                System.exit(0);
            } else {
                label.setText(comStr + " Selected");
            }
        }
    };


    public MenuFrame() {
        label = new JLabel();
        menuBar = new JMenuBar();
        makeFillMenu();
        makeActions();
        makeToolBar();
        makeOptionsMenu();
        makeMenuHelp();
        makeEditPMenu();
        addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    popupMenu.show(e.getComponent(), e.getX(), e.getY());
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    popupMenu.show(e.getComponent(), e.getX(), e.getY());
                }
            }
        });

        add(toolBar, BorderLayout.NORTH);
        setJMenuBar(menuBar);
        add(label, BorderLayout.CENTER);

        listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String comStr = e.getActionCommand();
                if (comStr.equalsIgnoreCase("Exit")) {
                    System.exit(0);
                } else {
                    label.setText(comStr + " Selected");
                }
            }
        };
    }

    private void makeFillMenu() {
        JMenu menu = new JMenu("File");
        menu.setMnemonic(KeyEvent.VK_F);

        JMenuItem open = new JMenuItem("Open", KeyEvent.VK_O);
        open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));

        JMenuItem close = new JMenuItem("Close", KeyEvent.VK_C);
        close.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_MASK));

        JMenuItem save = new JMenuItem("Save", KeyEvent.VK_S);
        save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));

        JMenuItem exit = new JMenuItem("Exit", KeyEvent.VK_E);
        exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_MASK));

        menu.add(open);
        menu.add(close);
        menu.add(save);
        menu.add(new JSeparator());
        menu.add(exit);

        exit.addActionListener(listener);
        close.addActionListener(listener);
        save.addActionListener(listener);
        open.addActionListener(listener);


        menuBar.add(menu);

    }

    private void makeActions() {
        ImageIcon icon = new ImageIcon("test.gif");

        setAct = new DebugAction("Set Point", icon, KeyEvent.VK_S, KeyEvent.VK_B, "set point");
        clearAct = new DebugAction("Clear Point", icon, KeyEvent.VK_C, KeyEvent.VK_L, "clear Point");
        resumeAct = new DebugAction("Resume Point", icon, KeyEvent.VK_R, KeyEvent.VK_R, "resume Point");

        clearAct.setEnabled(false);
    }

    private void makeToolBar() {
        toolBar = new JToolBar();
        JButton set = new JButton(setAct);
        JButton clear = new JButton(clearAct);
        JButton resume = new JButton(resumeAct);

        toolBar.add(set);
        toolBar.add(clear);
        toolBar.add(resume);
    }

    private void makeOptionsMenu() {
        JMenu options = new JMenu("Options");
        JMenu colors = new JMenu("Colors");

        JCheckBoxMenuItem red = new JCheckBoxMenuItem("Red");
        JCheckBoxMenuItem green = new JCheckBoxMenuItem("green");
        JCheckBoxMenuItem blue = new JCheckBoxMenuItem("blue");

        colors.add(red);
        colors.add(green);
        colors.add(blue);
        options.add(colors);

        JMenu priority = new JMenu("Priority");
        JRadioButtonMenuItem high = new JRadioButtonMenuItem("High");
        JRadioButtonMenuItem medium = new JRadioButtonMenuItem("Medium");
        JRadioButtonMenuItem low = new JRadioButtonMenuItem("Low");

        priority.add(high);
        priority.add(medium);
        priority.add(low);

        ButtonGroup bg = new ButtonGroup();
        bg.add(high);
        bg.add(low);

        options.add(priority);

        JMenu debug = new JMenu("Debug");
        JMenuItem set = new JMenuItem(setAct);
        JMenuItem clear = new JMenuItem(clearAct);
        JMenuItem resume = new JMenuItem(resumeAct);

        debug.add(set);
        debug.add(clear);
        debug.add(resume);

        options.add(debug);

        JMenu reset = new JMenu("Reset");
        options.addSeparator();
        options.add(reset);

        red.addActionListener(listener);
        green.addActionListener(listener);
        blue.addActionListener(listener);
        high.addActionListener(listener);
        low.addActionListener(listener);
        reset.addActionListener(listener);

        menuBar.add(options);


    }

    private void makeMenuHelp() {
        JMenu help = new JMenu("Help");
        JMenuItem about = new JMenuItem("About");
        about.setToolTipText("About text");
        help.add(about);
        menuBar.add(help);

        about.addActionListener(listener);

    }

    private void makeEditPMenu() {
        popupMenu = new JPopupMenu();

        JMenuItem cut = new JMenuItem("Cut");
        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem paste = new JMenuItem("Paste");

        popupMenu.add(cut);
        popupMenu.add(copy);
        popupMenu.add(paste);

        cut.addActionListener(listener);
        copy.addActionListener(listener);
        paste.addActionListener(listener);

    }

    private class DebugAction extends AbstractAction {
        DebugAction(String name, Icon image, int mnem, int accel, String tooltip) {
            super(name, image);
            putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(accel, InputEvent.CTRL_MASK));
            putValue(MNEMONIC_KEY, mnem);
            putValue(SHORT_DESCRIPTION, tooltip);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String comStr = e.getActionCommand();
            label.setText(comStr + " Selected");
            if (comStr.equalsIgnoreCase("Set Point")){
                clearAct.setEnabled(true);
                setAct.setEnabled(false);
            }else {
                setAct.setEnabled(true);
                clearAct.setEnabled(false);
            }
        }
    }
}

