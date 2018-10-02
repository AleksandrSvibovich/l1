package SecondTwenty.Day29.task_02;

/**
 * Created by Aleksandr_Svibovich on 10/1/2018.
 */
public class Compucter {


    private static Keyboard keybord;
    private static Mouse mouse;
    private static Monitor monic;

    public Compucter() {
        this.keybord = new Keyboard();
        this.monic = new Monitor();
        this.mouse = new Mouse();
    }

    public static Keyboard getKeyboard() {
        return keybord;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public Monitor getMonitor() {
        return monic;
    }
}
