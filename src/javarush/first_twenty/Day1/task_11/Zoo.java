package Day1.task_11;

/**
 * Created by Aleksandr_Svibovich on 9/11/2018.
 */
public class Zoo {
    public static void main(String[] args) {
        Cat a = new Cat();
        Cat a1 = new Cat();
        Cat a2 = new Cat();
        Cat a3 = new Cat();
        System.out.println(a3.getCatsCount());
        a2.setCatsCount(9);
        System.out.println(a3.getCatsCount());
        a2.setName("Basik","Kotjasik");
        System.out.println(a2.getName());
    }
}
