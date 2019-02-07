package javarush.second_twenty.Day24.task_03;

/**
 * Created by Aleksandr_Svibovich on 9/25/2018.
 */
public class FairTail {
    public static void main(String[] args) {
        Person repa = new Person("Repka");
        Person ded = new Person("Ded");
        Person baba = new Person("Baba");
        Person vnuchka = new Person("Vnuchka");
        ded.grab();
        ded.pull(repa);
        baba.pull(ded);
        vnuchka.pull(baba);
    }
}
