package SecondTwenty.Day24.task_03;

/**
 * Created by Aleksandr_Svibovich on 9/25/2018.
 */
public class Person implements RepkaItem{
    public Person(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void pull(Person person) {
        System.out.println(getName() + " za " + person.getName());
    }

    @Override
    public void grab() {
        System.out.println("Virosla repka!!!");
    }
}
