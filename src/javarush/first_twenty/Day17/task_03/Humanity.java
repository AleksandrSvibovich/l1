package Day17.task_03;

/**
 * Created by Aleksandr_Svibovich on 9/24/2018.
 */
public class Humanity {
    private String name;
    private Integer height;
    private String lastName;
    private String middleName;
    private Integer age;
    private Integer weight;

    public Humanity() {
    }

    public Humanity(Integer height,Integer age,String name,String lastName,String middleName,Integer weight) {
        this.name = name;
        this.lastName = lastName;
        this.middleName = middleName;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public Humanity(Integer age,String name,String lastName,String middleName,Integer weight) {
        this.name = name;
        this.lastName = lastName;
        this.middleName = middleName;
        this.age = age;
        this.weight = weight;
    }

    public Humanity(String name,String lastName,String middleName,Integer age, Integer weight) {
        this.name = name;
        this.lastName = lastName;
        this.middleName = middleName;
        this.age = age;
        this.weight = weight;
    }

    public Humanity(String name,String lastName,String middleName,Integer age) {
        this.name = name;
        this.lastName = lastName;
        this.middleName = middleName;
        this.age = age;
    }

    public Humanity(String name,String lastName,String middleName) {
        this.name = name;
        this.lastName = lastName;
        this.middleName = middleName;
    }

    public Humanity(String name,String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public Humanity(String lastName) {
        this.lastName = lastName;
    }

}
