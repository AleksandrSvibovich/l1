package Day4.task_01;

import java.util.HashSet;
import java.util.Set;

public class ForEachTask {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        s.add("add");
        s.add("me");
        s.add("here");
        s.add("here");
        s.add("here2");

        for (String text:s) {
            System.out.println(text);
        }
    }
}
