package Day9.task_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by Aleksandr_Svibovich on 9/17/2018.
 */
public class SortByAlph {

    static String[] list = new String[5];

    public static void main(String[] args) {

        list = set20words(list);
        sortList(list);

    }

    private static void sortList(String[] list) {
        Arrays.sort(list);

        for (String text: list) {
            System.out.println(text);
        }
    }

    public static String[] set20words(String[] list) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i <list.length; i++) {
            try {
                list[i] = (br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return list;
    }
}
