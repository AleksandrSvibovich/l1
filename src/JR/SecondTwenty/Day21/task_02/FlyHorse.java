package JR.SecondTwenty.Day21.task_02;

/**
 * Created by Aleksandr_Svibovich on 9/25/2018.
 */
public class FlyHorse {
    public static void main(String[] args) {
        Horse horse = new Pegas();
        horse.run();
    }

    public  interface Fly {
        void fly();
    }

    public static class Horse {
        public void run() {
        }
    }

    public static class Pegas extends Horse implements Fly {
        public void fly() {
        }
    }

    public static abstract class SwimPegas extends Pegas {
        public abstract void swim();
    }

}
