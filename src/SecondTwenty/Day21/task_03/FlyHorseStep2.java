package SecondTwenty.Day21.task_03;

import SecondTwenty.Day21.task_02.FlyHorse;

/**
 * Created by Aleksandr_Svibovich on 9/25/2018.
 */
public class FlyHorseStep2 {

    public  interface Fly {
        void fly();
    }

    public static class Horse {
        public void run() {
        }
    }

    public static class Pegas extends FlyHorse.Horse implements FlyHorse.Fly {
        public void fly() {
        }
    }

    public static abstract class SwimPegas extends FlyHorse.Pegas {
        public abstract void swim();
    }
}
