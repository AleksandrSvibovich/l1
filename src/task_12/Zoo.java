package task_12;

/**
 * Created by Aleksandr_Svibovich on 9/11/2018.
 */
public class Zoo {
    public static void main(String[] args) {
        Cat one = new Cat();
        System.out.println("Adres " + one.getAdress() + " Name " + one.getName()  + " Color " + one.getColor()
                + " Age " + one.getAge()
                + " Weight " + one.getWeight());
        Cat two = new Cat("Tolja",6,2.5,"ginger","Saratov");
        System.out.println("Adres " + two.getAdress() + " Name " + two.getName()  + " Color " + two.getColor()
                + " Age " + two.getAge()
                + " Weight " + two.getWeight());
    }
}
