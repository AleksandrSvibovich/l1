package Day4.task_01;

import java.util.ArrayList;
import java.util.List;

public class ForEachList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("2add");
        list.add("me");
        list.add("here3");
        list.add("here");
        list.add("here2");

        for (String text:list) {
            System.out.println(text);
        }
    }
}
