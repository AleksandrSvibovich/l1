package task_17;

/**
 * Created by Aleksandr_Svibovich on 9/12/2018.
 */
public class CircleFactory {
    public static void main(String[] args) {
        Circle r1 = new Circle();
        Circle r2 = new Circle();
        Circle r3 = new Circle();
        Circle r4 = new Circle();
        r1.initialize();
        r2.initialize(23,23,23);
        r3.initialize(5,3,6,3,"ttt");
        r4.initialize(3,2,2,2);

        System.out.println(r1.getCenterX());
        System.out.println(r2.getRadius());
        System.out.println(r3.getCenterY());
        System.out.println(r3.getColor());
        System.out.println(r4.getColor());
        System.out.println(r4.getWidth());
    }
}
