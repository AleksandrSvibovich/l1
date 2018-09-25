package Day2.task_11;

/**
 * Created by Aleksandr_Svibovich on 9/12/2018.
 */
public class FriendsInitializer {
    private String name = "Pablo";
    private String gender = "Male";
    private int age = 5;

    public void initialize() {
    }

    public void initialize(String name) {
        this.name = name;
    }

    public void initialize(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public void initialize(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
}
