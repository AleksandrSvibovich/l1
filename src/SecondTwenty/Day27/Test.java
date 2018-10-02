package SecondTwenty.Day27;

/**
 * Created by Aleksandr_Svibovich on 9/27/2018.
 */
public class Test {
    public static void main(String[] args) {
        Bridge bridge = new WaterBridge();
        println(bridge);
    }

    public static void println(Bridge bridge){
        System.out.println(bridge.getCarsCount());
    }
}
