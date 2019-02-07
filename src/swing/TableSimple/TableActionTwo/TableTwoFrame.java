package swing.TableSimple.TableActionTwo;

import javax.swing.*;

/**
 * Created by Aleksandr_Svibovich on 12/17/2018.
 */
public class TableTwoFrame extends JFrame {
    private String[][] dataArr = {{"Wendy", "Like", "Hot", "Patates"}, {"Mike", "Like", "Cold", "Milk"},
            {"Tom", "Don't Like", "Wet", "Floor"}, {"Tom", "Don't Like", "Wet", "Floor"}, {"Tom", "Don't Like", "Wet", "Floor"},
            {"Tom", "Don't Like", "Wet", "Floor"}, {"Tom", "Don't Like", "Wet", "Floor"},
            {"Tom", "Don't Like", "Wet", "Floor"}, {"Tom", "Don't Like", "Wet", "Floor"},
            {"Tom", "Don't Like", "Wet", "Floor"}, {"Tom", "Don't Like", "Wet", "Floor"},
            {"Tom", "Don't Like", "Wet", "Floor"}, {"We", "Will", "Rock", "You"}};

    private String[] header = {"Col one","Col two","Col three"," Col four"};

    public TableTwoFrame() {
        JTable table = new JTable(dataArr,header);
    }
}
