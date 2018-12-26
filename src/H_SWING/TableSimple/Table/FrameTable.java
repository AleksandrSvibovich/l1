package H_SWING.TableSimple.Table;

import javax.swing.*;

/**
 * Created by Aleksandr_Svibovich on 12/14/2018.
 */
public class FrameTable extends JFrame {
    private JTable table;

    String headers[] = {"header one","header two","header three","header four"};

    String[][] arr2levels = {{"Wendy","Like","Hot","Patates"},{"Mike","Like","Cold","Milk"},
            {"Tom","Don't Like","Wet","Floor"},{"Tom","Don't Like","Wet","Floor"},{"Tom","Don't Like","Wet","Floor"},
            {"Tom","Don't Like","Wet","Floor"},{"Tom","Don't Like","Wet","Floor"},
            {"Tom","Don't Like","Wet","Floor"},{"Tom","Don't Like","Wet","Floor"},
            {"Tom","Don't Like","Wet","Floor"},{"Tom","Don't Like","Wet","Floor"},
            {"Tom","Don't Like","Wet","Floor"},{"We","Will","Rock","You"}};

    public FrameTable(){
        table = new JTable(arr2levels, headers);
        table.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        table.setCellSelectionEnabled(true);

        // делает тоже самое что и строка выше
//        table.setColumnSelectionAllowed(true);
//        table.setRowSelectionAllowed(true);
        JScrollPane sPane = new JScrollPane(table);
        add(sPane);

    }
}
