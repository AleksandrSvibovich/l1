package task_01;

import java.util.Scanner;

/**
 * Created by Aleksandr_Svibovich on 9/11/2018.
 */
public class EnterText {
    static Scanner sc = new Scanner(System.in);

    public static int[] getNumArray(int limit){
        int[] array = new int[limit];
        for (int i = 0; i <limit; i++) {
            System.out.println("Please enter one by one Integer number. " + "You need enter " + ((limit)-(i)) + " number(-s) ");
            int recievedNum = sc.nextInt();
            array[i] = recievedNum;
        }

        return array;
    }
}
