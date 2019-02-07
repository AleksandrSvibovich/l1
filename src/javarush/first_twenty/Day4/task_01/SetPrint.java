package Day4.task_01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetPrint {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        s.add("add");
        s.add("me");
        s.add("here");
        s.add("here");
        s.add("here2");

        Iterator<String> iterator = s.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
