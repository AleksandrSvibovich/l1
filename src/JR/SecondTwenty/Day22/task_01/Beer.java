package JR.SecondTwenty.Day22.task_01;

/**
 * Created by Aleksandr_Svibovich on 9/25/2018.
 */
public class Beer implements Alcohol {
    public static void main(String[] args) {
        Beer b = new Beer();
        b.minusHealth();
        System.out.println(b.isReadyToGoHome());
        b.minusHealth();
        System.out.println(b.isReadyToGoHome());
        b.minusHealth();
        System.out.println(b.isReadyToGoHome());
    }
    private static int health = 100;
    public final static boolean READY_TO_GO_HOME = true;

    @Override
    public void minusHealth() {
        health = health - 20;
    }

    public boolean isReadyToGoHome() {
        if(health<=60){
            return READY_TO_GO_HOME;
        }else {
            return false;
        }

    }

    @Override
    public boolean isAlco() {
        if (health<100){
            return true;
        }
        return false;
    }
}
