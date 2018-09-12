package Day2.task_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Aleksandr_Svibovich on 9/12/2018.
 */
public class MNreplace {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter total qty strings");
        int N = Integer.parseInt(br.readLine());
        System.out.println("Enter qty of string which we will move");
        int M = Integer.parseInt(br.readLine());

        ArrayList<String> list = new ArrayList<>();

        System.out.println("enter " + N + " strings: ");
        for (int i = 0; i <N; i++) {
            list.add(br.readLine());
        }

        changeSrings(list,M);


    }

    public static void changeSrings(ArrayList<String> list, int qty){
        for (int i = 0; i <qty; i++) {
            list.add(list.size(),list.get(i));
            list.remove(0);
        }

        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }
}
