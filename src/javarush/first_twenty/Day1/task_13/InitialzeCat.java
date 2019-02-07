package Day1.task_13;

/**
 * Created by Aleksandr_Svibovich on 9/11/2018.
 */
public class InitialzeCat {
 // Инициализатор, что это???????????

    private String name = null;
    private String adress = null;
    private String color;
    private int age;
    private double weight;

    {
         age = 2;
         weight = 3;
         color = "gray";
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public String getColor() {
        return color;
    }
}
