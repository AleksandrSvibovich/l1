package Day1.task_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Aleksandr_Svibovich on 9/11/2018.
 */
public class AddTenStrings {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        ArrayList<String> strings10 = readTenLines();
        printList(strings10);

    }

    public static ArrayList<String> readTenLines() throws IOException {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i <=9; i++) {
            list.add(0,br.readLine());
        }
        return list;
    }

    public static void printList( ArrayList<String> list ){
        for (int i = 0; i <list.size(); i++) {
            System.out.println( "String : " + list.get(i));
        }
    }
}
