package Day17.task_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Aleksandr_Svibovich on 9/24/2018.
 * Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 букв алфавита).
 * Вывести результат на экран.
 */
public class Alphabet {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text= "";
        for (int i = 0; i <10; i++) {
            try {
                text += br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        countLetter(text);

    }

    private static void countLetter(String text) {
        Map<String,Integer> mapa = new HashMap<>();
        String[] arr = text.split("");
        for (int i = 0; i <arr.length; i++) {
            if (mapa.containsKey(arr[i])){
                int value = mapa.get(arr[i]);
                mapa.put(arr[i],(value+1));
            }else {
                mapa.put(arr[i],1);
            }
        }

        for (Map.Entry<String,Integer> pair:mapa.entrySet()) {
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }
    }
}
