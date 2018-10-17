package JR.SecondTwenty.Day36.task_01;

/**
 * Created by Aleksandr_Svibovich on 10/3/2018.
 */
public class Solution {
    public static void main(String[] args) {
        Goose g = new Goose();
        System.out.println(g.getSize());
        Dragon d = new Dragon();
        System.out.println(d.getSize());
    }

    public static class Goose extends SmallAnimal{
        public String getSize(){
            return "Гусь маленький, " + super.getSize();
        }

    }

    public static class Dragon extends BigAnimal{
        public String getSize(){
            return "Дракон большой, " + super.getSize();
        }
    }
}
