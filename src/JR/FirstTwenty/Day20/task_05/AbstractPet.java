package Day20.task_05;

/**
 * Created by Aleksandr_Svibovich on 9/24/2018.
 */
public abstract class AbstractPet {
    private String name;

    public void setName(String name) {
        {
            this.name = name;
        }
    }

    public String getName(){
        return "Smurfik";
    }

    public abstract Boolean getTrue();
}
