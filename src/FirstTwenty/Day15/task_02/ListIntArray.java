package Day15.task_02;

import java.util.ArrayList;

/**
 * Created by Aleksandr_Svibovich on 9/21/2018.
 */
public class ListIntArray {
    public static void main(String[] args) {
        ArrayList<int[]> list = new ArrayList<>();
        list.add(new int[5]);
        list.add(new int[2]);
        list.add(new int[4]);
        list.add(new int[7]);
        list.add(new int[0]);

        fillArr(list);
    }

    private static void fillArr(ArrayList<int[]> list) {
        for (int i = 0; i <list.size(); i++) {
            for (int j = 0; j <list.get(i).length; j++) {
                list.get(i)[j] = j;
            }
        }
        for (int i = 0; i <list.size(); i++) {
            for (int j = 0; j <list.get(i).length; j++) {
                System.out.println(list.get(i)[j]);
            }

        }
    }
}
