package Day6;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Aleksandr_Svibovich on 9/14/2018.
 */
public class task_02 {
    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<>();
        LinkedList<Object> linkedList = new LinkedList<>();
        add10k(linkedList);
        add10kArray(arrayList);


        System.out.println(getTimeInMS2(arrayList));


        System.out.println(getTimeInMS(linkedList));
    }

    public static void getList(ArrayList<Object> list){
        for (int i = 0; i <list.size() ; i++) {
            list.get(i);
        }
    }

    public static void getLinkedList(LinkedList<Object> list){
        for (int i = 0; i <list.size() ; i++) {
            list.get(i);
        }
    }

    public static void add10k(LinkedList<Object> list){
        for (int i = 0; i <100000 ; i++) {
            list.add(i);
        }
    }

    public static void add10kArray(ArrayList<Object> list){
        for (int i = 0; i <100000 ; i++) {
            list.add(i);
        }
    }

    public static int getTimeInMS(LinkedList<Object> list){
        long s =getStart();
        getLinkedList(list);
        long f =getStart();
        return (int)(f-s);
    }

    public static int getTimeInMS2(ArrayList<Object> list){
        long s =getStart();
        getList(list);
        long f =getStart();
        return (int)(f-s);
    }

    public static long getStart(){
        return System.currentTimeMillis();
    }
}
