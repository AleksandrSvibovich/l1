package MyLP.Cells;

import javax.swing.*;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

public class CellsFrame extends JFrame {
    MyPanel panel2 = new MyPanel(300,400);

    public CellsFrame() {
        setLayout(new FlowLayout());
        JPanel panel = new JPanel();
        JButton start = new JButton("Start");
        JButton stop = new JButton("Stop");


        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                startPainting();
            }
        };
        Timer timer = new Timer(1000,listener);

        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fillArray(50);
                timer.start();
            }
        });
        stop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timer.stop();
                System.exit(0);
            }
        });



//        JTable table = getMyTable();
//        panel2.add(table);

        panel.add(start);
        panel.add(stop);
        add(panel, BorderLayout.SOUTH);
        add(panel2, BorderLayout.NORTH);

    }

    private void fillArray(int i) {
        for (int j = 0; j <i ; j++) {
            panel2.add(new Rectangle());
        }
    }

    private void startPainting() {
        panel2.repaint();
    }

//    private JTable getMyTable() {
//        JTable table = new JTable(16, 40);
//        TableColumnModel model = table.getColumnModel();
//        Enumeration<TableColumn> e = model.getColumns();
//        while (e.hasMoreElements()) {
//            TableColumn column = (TableColumn) e.nextElement();
//            column.setMinWidth(10);
//            column.setMaxWidth(10);
//        }
//        table.setColumnSelectionAllowed(true);
//        table.setRowSelectionAllowed(true);
//        return table;
//    }


}
