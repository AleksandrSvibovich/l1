package HM.part9.task_06;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyMenu extends JFrame {
    private static final int DEFAULT_WDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;
    private Action saveAcction;
    private Action saveAsAction;
    private JCheckBoxMenuItem readOnlyItem;
    private JPopupMenu popup;


    class TestAction extends AbstractAction {
        public TestAction(String name) {
            super(name);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(getValue(Action.NAME) + " selected.");
        }
    }

    public MyMenu() {

        JMenu fileMenu = new JMenu("File");
        fileMenu.add(new TestAction("New"));
        ;

        // demo operative buttons
        JMenuItem openItem = fileMenu.add(new TestAction("Open"));
        openItem.setAccelerator(KeyStroke.getKeyStroke("ctrl O"));

        fileMenu.addSeparator();
        saveAcction = new TestAction("Save");
        JMenuItem saveItem = fileMenu.add(saveAcction);
        saveItem.setAccelerator(KeyStroke.getKeyStroke("ctrl S"));

        saveAsAction = new TestAction("Save As");
        fileMenu.add(saveAsAction);
        fileMenu.addSeparator();

        fileMenu.add(new AbstractAction("Exit") {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // demo apply flags
        readOnlyItem = new JCheckBoxMenuItem("Read Only");
        readOnlyItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean saveOk = !readOnlyItem.isSelected();
                saveAcction.setEnabled(saveOk);
                saveAsAction.setEnabled(saveOk);
            }
        });

        ButtonGroup group = new ButtonGroup();

        JRadioButtonMenuItem insertItem = new JRadioButtonMenuItem("Insert");
        insertItem.setSelected(true);

        JRadioButtonMenuItem overtypeItem = new JRadioButtonMenuItem("Overtype");
        group.add(insertItem);
        group.add(overtypeItem);

        // demo pictogramm
        Action cutAction = new TestAction("Cut");
        cutAction.putValue(Action.SMALL_ICON, new ImageIcon("cut.gif"));
        Action copyAction = new TestAction("Copy");
        copyAction.putValue(Action.SMALL_ICON, new ImageIcon("copy.gif"));
        Action pasteAction = new TestAction("Paste");
        pasteAction.putValue(Action.SMALL_ICON, new ImageIcon("paste.gif"));

        JMenu editMenu = new JMenu("Edit");
        editMenu.add(cutAction);
        editMenu.add(copyAction);
        editMenu.add(pasteAction);

        // demo inner menu
        JMenu optionMenu = new JMenu("Options");
        optionMenu.add(readOnlyItem);
        optionMenu.addSeparator();
        optionMenu.add(insertItem);
        optionMenu.add(overtypeItem);

        editMenu.addSeparator();
        editMenu.add(optionMenu);

        // fast access demo
        JMenu help = new JMenu("Help");
        help.setMnemonic('H');

        JMenuItem indexItem = new JMenuItem("Index");
        indexItem.setMnemonic('I');
        help.add(indexItem);

        // set letter of fast access
        Action aboutAction = new TestAction("About");
        aboutAction.putValue(Action.MNEMONIC_KEY,new Integer('A'));
        help.add(aboutAction);

        // show all menus in line
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu empty = new JMenu();

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(help);
        menuBar.add(empty);

        // demo popup
        popup = new JPopupMenu();
        popup.add(cutAction);
        popup.add(pasteAction);
        popup.add(copyAction);

        JPanel panel = new JPanel();
        panel.setComponentPopupMenu(popup);
        add(panel);

        // next line is have target workaround mistake 4966109
//        panel.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                super.mouseClicked(e);
//            }
//        });

    }
}
