package Day1.task_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Aleksandr_Svibovich on 9/11/2018.
 */
public class RemoveString {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<String> stringsList = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        addStrings(5);
        sortString(stringsList);
        printList(stringsList);
    }

    public static void addStrings(int limit) throws IOException {
        for (int i = 0; i < limit; i++) {
            String s = br.readLine();
            stringsList.add(s);
        }
    }

    public static ArrayList<String> sortString(ArrayList<String> incomeList) {
        String temp = "";
        for (int i = 0; i < 13; i++) {
            temp = incomeList.get(4);
            incomeList.add(0, temp);
            incomeList.remove(4);

        }
        return incomeList;
    }

    public static void printList(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("String # " + (i + 1) + " " + list.get(i));
        }
    }
}
