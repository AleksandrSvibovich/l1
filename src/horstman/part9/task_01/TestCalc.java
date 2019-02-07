package horstman.part9.task_01;

import javax.swing.*;

/**
 * Created by Aleksandr_Svibovich on 10/16/2018.
 */
public class TestCalc {
    public static void main(String[] args) {
        CalcPanel c = new CalcPanel();
        JFrame frame = new JFrame();
        frame.add(c);
        frame.setSize(250,250);
        frame.setVisible(true);
    }
}
