package Day19.task_02;

import java.util.ArrayList;

/**
 * Created by Aleksandr_Svibovich on 9/24/2018.
 */
public class ArrListArr {
    public static void main(String[] args) {
        ArrayList<String>[] arr = filla(4);
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i].get(0));
        }
    }

    private static ArrayList<String>[] filla(int i) {
        ArrayList<String>[] aye = new ArrayList[i];
        aye[0] = new ArrayList<>();
        aye[0].add("oppp");
        aye[1] = new ArrayList<>();
        aye[1].add("oppp1");
        aye[2] = new ArrayList<>();
        aye[2].add("oppp2");
        aye[3] = new ArrayList<>();
        aye[3].add("oppp4");
        return aye;
    }
}
