package SecondTwenty.Day24.task_02;

/**
 * Created by Aleksandr_Svibovich on 9/25/2018.
 */
public class Screen {


    public interface Updatable{
        void update();
    }

    public class Monic implements Updatable{
        @Override
        public void update() {
            System.out.println("up");
        }
    }
}
