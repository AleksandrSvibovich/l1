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

        start.addActionListener(listener);
        stop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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

    private void startPainting() {
        panel2.repaint();
    }

    private JTable getMyTable() {
        JTable table = new JTable(16, 40);
        TableColumnModel model = table.getColumnModel();
        Enumeration<TableColumn> e = model.getColumns();
        while (e.hasMoreElements()) {
            TableColumn column = (TableColumn) e.nextElement();
            column.setMinWidth(10);
            column.setMaxWidth(10);
        }
        table.setColumnSelectionAllowed(true);
        table.setRowSelectionAllowed(true);
        return table;
    }


}
