package JR.SecondTwenty.Day33.task_02;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Aleksandr_Svibovich on 10/2/2018.
 */
public class NotIncapsulatedClass {

    public NotIncapsulatedClass(){
        List<Number> list = new LinkedList<Number>();
        initList(list);
        printListValues(list);
        processCastedObjects(list);

    }

    private static List<Number> initList(List<Number> list){
        list.add(new Double(1000f));
        list.add(new Double("123e-445632"));
        list.add(new Float(-90 / -3));
        list.remove(new Double("123e-445632"));
        return list;
    }

    private static void printListValues(List<Number> list){
        for (Number n : list) {
            System.out.println(n);
        }
    }

    private static void processCastedObjects(List<Number> list){
        for (Number n : list) {
            System.out.println(n.getClass().getSimpleName());
        }
    }
}
