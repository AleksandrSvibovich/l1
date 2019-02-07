package javarush.second_twenty.Day30.task_02;

/**
 * Created by Aleksandr_Svibovich on 10/1/2018.
 */
public class Apt2room extends Appartments {
    @Override
    public void cleanAllAppartments() {
        cleanTwoRoom();
    }

    private void cleanTwoRoom(){
        System.out.println("Two room cleaned");
    }
}
