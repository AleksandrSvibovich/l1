package Day18.task_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Aleksandr_Svibovich on 9/24/2018.
 * Задача: Программа вводит с клавиатуры пару (число и строку) и выводит их на экран.
 Новая задача: Программа вводит с клавиатуры пары (число и строку), сохраняет их в HashMap.
 Пустая строка – конец ввода данных. Числа могу повторяться. Строки всегда уникальны. Введенные данные не должны потеряться!
 Затем программа выводит содержание HashMap на экран.
 */
public class MapaTask {
    public static void main(String[] args) throws IOException {
        mapaFiller();
    }

    private static void mapaFiller() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String,String> mapa = new HashMap<>();
        while (true){
            System.out.println("enter num");
            String num = br.readLine();
            System.out.println("enter string");
            String strings = br.readLine();
            if(strings.isEmpty()){
                printMapa(mapa);
                break;
            }

            mapa.put(num,strings);
        }


    }

    private static void printMapa(Map<String, String> mapa) {
        for (Map.Entry<String,String> pair: mapa.entrySet()) {
            System.out.println( pair.getKey()+ " : " + pair.getValue());
        }
    }
}
