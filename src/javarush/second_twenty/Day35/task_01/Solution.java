package javarush.second_twenty.Day35.task_01;

/**
 * Created by Aleksandr_Svibovich on 10/2/2018.
 */
public class Solution {

    public interface Movable {
        boolean getAllowedAction(String name);
    }

    public interface Sellable {
        boolean getAllowedAction(String name);
    }

    public interface Discountable {
        Object getAllowedAction();
    }

    public static class Clothes implements Sellable, Discountable,Movable {
        @Override
        public Object getAllowedAction() {
            return null;
        }

        @Override
        public boolean getAllowedAction(String name) {
            return false;
        }
    }
}

