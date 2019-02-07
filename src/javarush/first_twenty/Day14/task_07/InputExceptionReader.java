package Day14.task_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Aleksandr_Svibovich on 9/20/2018.
 */
public class InputExceptionReader {
    public static void main(String[] args) {
        readData();

    }

    private static void readData() {
        ArrayList<Integer> listNum = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            while (listNum.add(Integer.parseInt(br.readLine()))) {

            }
        } catch (NumberFormatException e) {
            System.out.println("Exception NFE!");
            printList(listNum);
        }catch (IOException e) {
            System.out.println("Exception IO!");
            printList(listNum);
        }

    }

    private static void printList(ArrayList<Integer> listNum) {
        Iterator<Integer> it = listNum.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
