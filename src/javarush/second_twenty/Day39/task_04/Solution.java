package javarush.second_twenty.Day39.task_04;

/**
 * Created by Aleksandr_Svibovich on 10/8/2018.
 */
public class Solution {

    public static void main(String[] args) {
        Man m = new Man();
        Woman w = new Woman();

        printName(m);
        printName(w);
    }

    private static void printName(Human w) {
        System.out.println (w.getClass().getSimpleName());
    }
}

