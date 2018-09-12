package Day1.task_12;

/**
 * Created by Aleksandr_Svibovich on 9/11/2018.
 */
public class Cat {


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private int age = 2;
    private double weight = 3;
    private String name = null;
    private String adress = null;
    private String color = "gray";

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat(String name, int age, double weigth) {
        this.name = name;
        this.age = age;
        this.weight = weigth;
    }

    public Cat(String color, String adress, double weigth) {
        this.weight = weigth;
        this.color = color;
        this.adress = adress;
    }

    public Cat(String name, int age, double weigth, String color, String adress) {
        this.name = name;
        this.age = age;
        this.weight = weigth;
        this.color = color;
        this.adress = adress;
    }

    public Cat(String name, int age, double weigth, String color) {
        this.name = name;
        this.age = age;
        this.weight = weigth;
        this.color = color;
    }

    public Cat() {
        super();
    }
}
