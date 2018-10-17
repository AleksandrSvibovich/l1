package Day2.task_08;

/**
 * Created by Aleksandr_Svibovich on 9/12/2018.
 */
public class Friends {

    private String name = "Pablo";
    private String gender = "Male";
    private int age = 5;

    public Friends(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Friends(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public Friends(String name) {
        this.name = name;
    }

    public Friends() {
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

}

