package javarush.second_twenty.Day25.task_01;

import static javarush.second_twenty.Day25.task_01.Building.getBuilding;
import static javarush.second_twenty.Day25.task_01.Building.getSchool;

/**
 * Created by Aleksandr_Svibovich on 9/26/2018.
 */
public class City {
    public static void main(String[] args) {
        Building s = getSchool();
        Building s1 = getBuilding();

        System.out.println(s + " " + s1);
    }
}
