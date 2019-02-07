package javarush.second_twenty.Day39.task_07;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Aleksandr_Svibovich on 10/8/2018.
 */
public class StaticBlock {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static
    {
        labels.put(2.5, "sdgfdg");
        labels.put(3.5, "sdgfdg");
        labels.put(6.5, "sdgfdg");
        labels.put(7.5, "sdgfdg");
        labels.put(8.5, "sdgfdg");
    }
    public static void main(String[] args) {
        System.out.println(labels);
    }
}
