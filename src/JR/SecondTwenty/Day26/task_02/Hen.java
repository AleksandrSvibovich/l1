package JR.SecondTwenty.Day26.task_02;

/**
 * Created by Aleksandr_Svibovich on 9/27/2018.
 */
public abstract class Hen {
    abstract int getCountOfEggsPerMounth();

    public String getDescription(){
        return "I'm Hen!";
    }

    public String getCountry(){
        return "I'm Hen of World";
    }

    public String toString(){
        return getCountry();
    }
}
