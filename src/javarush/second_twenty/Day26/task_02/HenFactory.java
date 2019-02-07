package javarush.second_twenty.Day26.task_02;

/**
 * Created by Aleksandr_Svibovich on 9/27/2018.
 */
public class HenFactory {

    public static void main(String[] args) {
        Hen one = new RussianHen();
        Hen two = new UkranianHen();
        System.out.println(one.getDescription());
        System.out.println(two.getDescription());
        System.out.println(getHen(one));
        System.out.println(getHen(two));
    }

    public static String getHen(Hen exaple){
        return exaple.toString() + " sort hen!";
    }
}
