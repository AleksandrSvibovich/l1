package JR.SecondTwenty.Day30.task_02;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aleksandr_Svibovich on 10/1/2018.
 */
public class Solution {
    public static void main(String[] args)
    {
        List<Appartments> apartaments = new ArrayList<Appartments>();
        apartaments.add(new Apt1room());
        apartaments.add(new Apt2room());
        cleanAllApartaments(apartaments);
    }

    private static void cleanAllApartaments(List<Appartments> apartaments) {
        for (Appartments app:apartaments) {
            app.cleanAllAppartments();
        }
    }

}
