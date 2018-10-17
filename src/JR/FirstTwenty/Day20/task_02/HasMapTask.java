package Day20.task_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Aleksandr_Svibovich on 9/24/2018.
 * Задача: Программа демонстрирует работу HashMap:
 * вводит с клавиатуры набор пар (номер и строку), помещает их в HashMap и выводит на экран содержимое HashMap.
 */
public class HasMapTask {
    public static void main(String[] args) {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer,String> words = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            try {
                words.put(i, br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        for (Map.Entry<Integer,String> pair: words.entrySet()) {
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }
    }
}
