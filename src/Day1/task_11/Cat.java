package Day1.task_11;

/**
 * Created by Aleksandr_Svibovich on 9/11/2018.
 */
public class Cat {

    private static int catsCount = 0;
    private String name;
    private String fullName;

    public void setName(String nick, String fullName) {
        this.name = nick;
        this.fullName = fullName;
    }

    public String getName() {
        return name + " " + fullName;
    }

    public Cat() {
        catsCount++;
    }

    public int getCatsCount() {
        return catsCount;
    }

    public void setCatsCount(int num) {
        catsCount = num;
    }
}
