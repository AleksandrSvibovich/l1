package task_01;

import java.util.ArrayList;

/**
 * Created by Aleksandr_Svibovich on 9/11/2018.
 */
public class PrintList {
    public static void printList(ArrayList<ArrayList<Integer>> list){
        for (int i = 0; i <list.size(); i++) {
            System.out.println("Now we print " + (i+1) + " list:");

            for (int j = 0; j <list.get(i).size(); j++) {
                System.out.println( "number " + list.get(i).get(j));
                if(j==(list.get(i).size())-1){
                    System.out.println("");
                }
            }
        }
    }
}
