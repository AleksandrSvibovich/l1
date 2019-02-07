package javarush.second_twenty.Day23.task_01.pack131105;

/**
 * Created by Aleksandr_Svibovich on 9/25/2018.
 */
public class User implements DBObject {
    public static void main(String[] args) {
        User user = new User("Alex",23);
        user.initializeIdAndName();
    }

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    String name = "Default";
    int id;

    @Override
    public void initializeIdAndName() {
        System.out.println("User has name " + getName() + ", id = " + getId());
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
