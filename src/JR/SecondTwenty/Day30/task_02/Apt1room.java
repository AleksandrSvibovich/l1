package JR.SecondTwenty.Day30.task_02;

/**
 * Created by Aleksandr_Svibovich on 10/1/2018.
 */
public class Apt1room extends Appartments {
    @Override
    public void cleanAllAppartments() {
        cleanOneRoom();
    }

    private void cleanOneRoom(){
        System.out.println("one room cleaned");
    }
}
