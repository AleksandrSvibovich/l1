package Day19.task_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Aleksandr_Svibovich on 9/24/2018.
 * Создать список целых чисел. Ввести с клавиатуры 20 целых чисел. Создать метод по безопасному
 * извлечению чисел из списка:
 * int safeGetElement(ArrayList<Integer> list, int index, int defaultValue)
 * Метод должен возвращать элемент списка (list) по его индексу (index).
 * Если в процессе получения элемента возникло исключение, его нужно перехватить, и метод должен вернуть defaultValue.
 */
public class SafetyExact {
    public static void main(String[] args) {
        ArrayList<Integer> list20 = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i <7; i++) {
            try {
                list20.add(i,Integer.parseInt(br.readLine()));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println(getSafetyNum(list20,9));
    }
    public static int getSafetyNum(ArrayList<Integer> list20, int position){
        int defaultNum = 0;
        try{
            return list20.get(position);
        }catch (IndexOutOfBoundsException ex){
            return defaultNum;
        }
    }
}
