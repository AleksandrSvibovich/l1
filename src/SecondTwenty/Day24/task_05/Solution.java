package SecondTwenty.Day24.task_05;

/**
 * Created by Aleksandr_Svibovich on 9/26/2018.
 */
public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println(Dream.HOBBIE.toString());
        System.out.println(new Hobbie().INDEX);
    }

    interface Desire {
    }

    interface Dream {
        Hobbie HOBBIE = new Hobbie();
    }

    static class Hobbie implements Desire, Dream {
        static int INDEX = 1;

        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }
}
