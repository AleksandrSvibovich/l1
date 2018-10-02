package SecondTwenty.Day26.task_02;

/**
 * Created by Aleksandr_Svibovich on 9/27/2018.
 */
public class UkranianHen extends Hen {
    @Override
    int getCountOfEggsPerMounth() {
        return 20;
    }

    public String getDescription(){
        String result ="";
        result = super.getDescription() + " My Country is " + getCountry() + ". And i bring a " + getCountOfEggsPerMounth() + " eggs per month";

        return result;
    }

    public String getCountry(){
        return "Ukraine";
    }
}
