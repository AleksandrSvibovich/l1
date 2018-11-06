package HM.part9.task_06;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Aleksandr_Svibovich on 10/22/2018.
 */
public class MenuFrame extends JFrame{

    private JMenu menu;
    private JPopupMenu popup;

    public MenuFrame(){

        // Бар который содержит лепится вверх
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        // меню те что видны, т.е. основные вкладки
        JMenu file = new JMenu("File");
        file.addActionListener(new TestAction("New"));

        JMenu open = new JMenu("Open");
        open.addActionListener(new TestAction("Open"));

        JMenu empty = new JMenu("         ");
        empty.addActionListener(new TestAction("Empty"));

        // под меню, которые видны после нажатия на основное меню
        JMenuItem level2 = new JMenuItem("level2");
        JMenuItem level22 = new JMenuItem("level22");
        JMenuItem level222 = new JMenuItem("level222");

        // добавить действия после нажатия на под меню
        level2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JDialog dialog = new JDialog();
                dialog.setSize(150,145);
                dialog.setVisible(true);
                dialog.setLayout(new GridLayout(2,2));
                dialog.add(new JTextArea());
                dialog.add(new JPasswordField());
                dialog.add(new JLabel("Hernja"));
                dialog.add(new JButton("Biiig Button"));
            }
        });

        // цепляем подменю к основным меню
        file.add(level2);
        file.add(level22);
        open.add(level222);

        // добавляем основные меню к Меню Бару, чтобы все это было видно
        menuBar.add(file);
        menuBar.add(open);
        menuBar.add(empty);

    }

    private class TestAction extends AbstractAction{

        public TestAction(String name){
            super(name);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(getValue(Action.NAME) + " Selected");
        }
    }
}
