package javarush.second_twenty.Day25.task_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Aleksandr_Svibovich on 9/26/2018.
 * 1. Считывать строки(параметры) с консоли, пока пользователь не введет пустую строку(Enter).
 * 2. Каждый параметр соответствует имени кота.
 * Для каждого параметра:
 * 3. Создать объект cat класса Cat, который равен коту из getCatByKey(String параметр).
 * 4. Вывести на экран cat.toString().
 */
public class ZooCat {
    public static void main(String[] args) {

        try {
            ArrayList<String> list = makeCateVon();
            action(list);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void action(ArrayList<String> list) {
        ArrayList<Cat> cats = new ArrayList<>();
        for (int i = 0; i <list.size() ; i++) {
            cats.add(new Cat(list.get(i)));
        }
        for (int i = 0; i <cats.size(); i++) {
            getCatByKey(cats.get(i).toString());
        }

    }

    private static void getCatByKey(String s) {
        System.out.println(s);
    }

    private static ArrayList<String> makeCateVon() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String mess = br.readLine();
            if (mess.equalsIgnoreCase("")) {
                break;
            } else {
                list.add(mess);
            }
        }
        return list;

    }
}
