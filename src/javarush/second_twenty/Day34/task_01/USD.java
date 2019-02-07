package javarush.second_twenty.Day34.task_01;

/**
 * Created by Aleksandr_Svibovich on 10/2/2018.
 */
public class USD extends Money {
    public USD(double num) {
        super(num);
    }

    public String getCurrencyName(){
        return "USD";
    }
}
