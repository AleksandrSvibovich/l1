package javarush.second_twenty.Day25.task_01;

/**
 * Created by Aleksandr_Svibovich on 9/26/2018.
 */
public class Building {

    public String toString() {
        return "Building";
    }

    public static Building getSchool(){
        return new School();
    }

    public static Building getBuilding(){
        return new Building();
    }
}
