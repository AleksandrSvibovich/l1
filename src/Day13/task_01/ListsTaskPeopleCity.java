package Day13.task_01;

import java.util.ArrayList;

/**
 * Created by Aleksandr_Svibovich on 9/19/2018.
 */
public class ListsTaskPeopleCity {
    public static void main(String[] args) {
        ArrayList<String> familias = new ArrayList<>();
        ArrayList<String> cities = new ArrayList<>();

        familias.add("Ivanovi");
        familias.add("Petrovi");
        familias.add("Sidorovi");

        cities.add("Moscow");
        cities.add("SPB");
        cities.add("Ekaterinburg");

        for (int i = 0; i <cities.size(); i++) {
            System.out.println(cities.get(i) + " : " + familias.get(i));
        }


    }
}
