package Day4.task_01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListPrint {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("add");
        list.add("me");
        list.add("here3");
        list.add("here");
        list.add("here2");

        for (int i = 0; i <list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println(" --Simple empty string-- ");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
