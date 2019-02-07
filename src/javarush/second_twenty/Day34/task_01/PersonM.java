package javarush.second_twenty.Day34.task_01;

import java.util.ArrayList;

/**
 * Created by Aleksandr_Svibovich on 10/2/2018.
 */
public class PersonM {
    private ArrayList<Money> allMoney = new ArrayList<>();

    public PersonM(){
        this.allMoney = new ArrayList<>();
        allMoney.add(new USD(25.0));
        allMoney.add(new Hrivna(12));
    }
}
