package swing.TableSimple.TableWithActions;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

/**
 * Created by Aleksandr_Svibovich on 12/14/2018.
 */
public class ActionTableFrame extends JFrame {
    private JTable table;
    private JLabel label = new JLabel("");
    private String headers[] = {"header one", "header two", "header three", "header four"};

    private String[][] arr2levels = {{"Wendy", "Like", "Hot", "Patates"}, {"Mike", "Like", "Cold", "Milk"},
            {"Tom", "Don't Like", "Wet", "Floor"}, {"Tom", "Don't Like", "Wet", "Floor"}, {"Tom", "Don't Like", "Wet", "Floor"},
            {"Tom", "Don't Like", "Wet", "Floor"}, {"Tom", "Don't Like", "Wet", "Floor"},
            {"Tom", "Don't Like", "Wet", "Floor"}, {"Tom", "Don't Like", "Wet", "Floor"},
            {"Tom", "Don't Like", "Wet", "Floor"}, {"Tom", "Don't Like", "Wet", "Floor"},
            {"Tom", "Don't Like", "Wet", "Floor"}, {"We", "Will", "Rock", "You"}};

    public ActionTableFrame() {
        table = new JTable(arr2levels, headers);
        JScrollPane scrollPane = new JScrollPane(table);

        ListSelectionModel model = table.getSelectionModel();

        model.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                String str = "Selected Rows: ";

                int[] rows = table.getSelectedRows();
                for (int i = 0; i < rows.length; i++) {
                    str += rows[i] + " ";
                    label.setText(str);
                }
            }
        });

        add(scrollPane,BorderLayout.NORTH);
        add(label, BorderLayout.SOUTH);
    }
}
