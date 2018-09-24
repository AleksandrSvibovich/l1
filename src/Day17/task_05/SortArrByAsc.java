package Day17.task_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import static java.util.Collections.sort;

/**
 * Created by Aleksandr_Svibovich on 9/24/2018.
 * Задача: ввести с клавиатуры 30 чисел. Вывести 10-е и 11-е минимальные числа.
 Пояснение:
 Самое минимальное число – 1-е минимальное.
 Следующее минимальное после него – 2-е минимальное
 Пример:
 1 6 5  7  1  15   63   88
 Первое минимальное – 1
 Второе минимальное – 1
 Третье минимальное – 5
 Четвертое минимальное – 6
 */
public class SortArrByAsc {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i <7; i++) {
            try {
                list.add(bufferedReader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        sort(list);

        for (int i = 0; i <list.size() ; i++) {
            System.out.println("nums : " + list.get(i));
        }
    }
}
