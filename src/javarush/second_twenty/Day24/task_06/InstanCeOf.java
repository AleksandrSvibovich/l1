package javarush.second_twenty.Day24.task_06;

/**
 * Created by Aleksandr_Svibovich on 9/26/2018.
 */
public class InstanCeOf {
    public static void main(String[] args) {
        Object o = new Tiger();
        boolean isCat = o instanceof Cat;
        boolean isTiger = o instanceof Tiger;
        boolean isPet = o instanceof Pet;
        printResults(isCat, isTiger, isPet);
    }

    private static void printResults(boolean cat, boolean tiger, boolean pet) {
        if (cat && tiger && pet) System.out.println("Bingo!");
    }

    static class Pet {
    }

    static class Cat extends Pet {
    }

    static class Tiger extends Cat {
    }
}
