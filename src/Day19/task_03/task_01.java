package Day19.task_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Aleksandr_Svibovich on 9/24/2018.
 * Ввести с клавиатуры в список 20 слов. Нужно подсчитать количество одинаковых слов в списке.
 * Результат нужно представить в виде словаря Map<String, Integer>, где первый параметр – уникальная строка,
 * а второй – число, сколько раз данная строка встречалась в списке.
 * Вывести содержимое словаря на экран.
 * В тестах регистр (большая/маленькая буква) влияет на результат.
 */
public class task_01 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            try {
                words.add(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        Map<String, Integer> mapa = new TreeMap<>();
        for (int i = 0; i < words.size(); i++) {
            if (mapa.containsKey(words.get(i))) {
                int value = mapa.get(words.get(i));
                mapa.put(words.get(i), (value + 1));
            } else {
                mapa.put(words.get(i), 1);
            }
        }

        for (Map.Entry<String,Integer> pair : mapa.entrySet() ) {
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }
    }
}
