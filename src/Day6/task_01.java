package Day6;

import java.util.ArrayList;
import java.util.LinkedList;

public class task_01 {
    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<>();
        LinkedList<Object> linkedList = new LinkedList<>();

        long start = getStart();
        add10k(linkedList);
        long finish = getStart();
        System.out.println(finish-start);

        start = getStart();
        add10kArray(arrayList);
        finish = getStart();
        System.out.println(finish-start);
    }

    public static void add10k(LinkedList<Object> list){
        for (int i = 0; i <1190000 ; i++) {
            list.add(i);
        }
    }

    public static void add10kArray(ArrayList<Object> list){
        for (int i = 0; i <1190000 ; i++) {
            list.add(i);
        }
    }

    public static long getStart(){
        return System.currentTimeMillis();
    }


}
