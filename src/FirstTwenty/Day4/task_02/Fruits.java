package Day4.task_02;

import java.util.HashSet;
import java.util.Set;

public class Fruits {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Watermelon");
        set.add("Strawberry");
        set.add("Apple");
        set.add("Orange");
        set.add("Pineapple");

        for (String t:set ) {
            System.out.println(t);
        }
    }
}
