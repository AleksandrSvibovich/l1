package Day7.task_04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Aleksandr_Svibovich on 9/16/2018.
 */
public class Lworld {
    public static void main(String[] args) {
        Set<String> l = new HashSet<>();
        l.add("Loop");
        l.add("Loser");
        l.add("Last");
        l.add("Life");
        l.add("Last");
        l.add("Lose");


        printThat(l);
    }

    private static void printThat(Set<String> l) {
        Iterator<String> it = l.iterator();
        while (it.hasNext()){
            System.out.println(" Ammmm... L? " + it.next());
        }

    }
}
