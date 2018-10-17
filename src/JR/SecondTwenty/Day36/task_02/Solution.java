package JR.SecondTwenty.Day36.task_02;

/**
 * Created by Aleksandr_Svibovich on 10/3/2018.
 */
public class Solution {
    public static void main(String[] args) {
        new Solution.LuxaryCars().printlnDesire();
        new Solution.EconomyCars().printlnDesire();
        new Solution.Ferrari().printlnDesire();
        new Solution.Lanos().printlnDesire();
    }

    public static class Ferrari extends EconomyCars {
        public void printlnDesire() {
            System.out.println("Я хочу ездить на Феррари");
        }
    }

    public static class Lanos extends LuxaryCars {
        public void printlnDesire() {
            System.out.println("Я хочу ездить на Ланосе");
        }
    }

    public static class LuxaryCars {
         void printlnDesire() {
            System.out.println("Я хочу ездить на экономной машине");
        }
    }

    public static class EconomyCars {
         void printlnDesire() {
            System.out.println("Я хочу ездить на роскошной машине");
        }
    }
}
