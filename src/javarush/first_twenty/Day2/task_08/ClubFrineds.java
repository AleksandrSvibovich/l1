package Day2.task_08;

/**
 * Created by Aleksandr_Svibovich on 9/12/2018.
 */
public class ClubFrineds {
    public static void main(String[] args) {
        Friends m = new Friends("Misha","Female",26);
        Friends f = new Friends();
        System.out.println(m.getAge() + "; " + m.getName()  + "; " +  m.getGender());
        System.out.println(f.getAge() + "; " + f.getName()  + "; " +  f.getGender());
    }
}
