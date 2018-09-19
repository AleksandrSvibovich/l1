package Day10.task_05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Aleksandr_Svibovich on 9/17/2018.
 */
public class CatsSet {
    public static void main(String[] args) {

        removeOneCat(createCats());
    }

    private static void removeOneCat(Set<Cat> cats) {
        Iterator<Cat> it = cats.iterator();
        if(it.hasNext()){
            cats.remove(it.next());
        }
        Iterator<Cat> it2 = cats.iterator();
        while (it2.hasNext()){
            System.out.println(it2.next().toString());
        }

    }


    private static Set<Cat> createCats() {
        Set<Cat> catSet = new HashSet<>();
        catSet.add(new Cat());
        catSet.add(new Cat());
        catSet.add(new Cat());
        return catSet;
    }

    public static class Cat{

    }
}
