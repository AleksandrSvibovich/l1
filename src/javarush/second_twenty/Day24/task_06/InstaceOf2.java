package javarush.second_twenty.Day24.task_06;

/**
 * Created by Aleksandr_Svibovich on 9/26/2018.
 */
public class InstaceOf2 {
    public static void main(String[] args) {
        Cat o = new TomCat();
        boolean isCat = o instanceof Cat;
        boolean isMoveable = o instanceof Moveable;
        boolean isTom = o instanceof TomCat;
        if (isCat && isMoveable && isTom) System.out.println("Bingo!");
    }

    interface Moveable {
    }

    static class Cat {
    }

    static class TomCat extends Cat implements Moveable {
    }
}