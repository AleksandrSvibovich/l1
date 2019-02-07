package javarush.second_twenty.Day21.task_01;

/**
 * Created by Aleksandr_Svibovich on 9/25/2018.
 */
public class Pet {
    public Pet(String name) {
        this.name = name;
    }

    public Pet() {
        this.name = "Ace";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
}
