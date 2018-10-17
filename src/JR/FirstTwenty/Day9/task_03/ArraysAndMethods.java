package Day9.task_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Aleksandr_Svibovich on 9/17/2018.
 */
public class ArraysAndMethods {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = getNnumber(br);
        ArrayList<Integer> list = getIntegerList(br, a);
        findMinNum(list);

    }

    private static void findMinNum(ArrayList<Integer> list) {
        int min = Integer.MAX_VALUE;
        for (Integer num: list ) {
            if(num<min){
                min = num;
            }
        }
        System.out.println("Num is min " + min);
    }

    private static int getNnumber(BufferedReader br) {
        System.out.println("Enter number 'N' ");
        int a = 0;
        try {
            a = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("the num is " + a);
        return a;
    }

    private static ArrayList<Integer> getIntegerList(BufferedReader br, int a) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Ener " + a + " numbers");
        for (int i = 0; i <a; i++) {
            list.add(i,Integer.parseInt(br.readLine()));
        }
        return list;
    }
}
