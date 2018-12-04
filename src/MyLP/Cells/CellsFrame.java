package MyLP.Cells;

import javax.swing.*;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

public class CellsFrame extends JFrame {



    public CellsFrame(){
        JPanel panel = new JPanel();
        JButton start = new JButton("Start");
        JButton stop = new JButton("Stop");

        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        stop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        JPanel panel2 = new JPanel();
        JTable table = getMyTable();
        panel2.add(table);

        panel.add(start);
        panel.add(stop);
        add(panel, BorderLayout.SOUTH);
        add(panel2, BorderLayout.NORTH);

    }

    private JTable getMyTable() {
        JTable table = new JTable(17,59);
        TableColumnModel model = table.getColumnModel();
        Enumeration<TableColumn> e = model.getColumns();
        while (e.hasMoreElements()){
            TableColumn column = (TableColumn) e.nextElement();
            column.setMinWidth(10);
            column.setMaxWidth(10);
        }
        return table;
    }


}
