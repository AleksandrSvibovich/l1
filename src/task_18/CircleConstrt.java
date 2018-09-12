package task_18;

/**
 * Created by Aleksandr_Svibovich on 9/12/2018.
 */
public class CircleConstrt {
    private int centerX;
    private int centerY;
    private int radius;
    private int width = 0;
    private String color = "green";

    public CircleConstrt(int centerX, int centerY, int radius, int width, String color) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }

    public CircleConstrt(int centerX, int centerY, int radius, int width) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;

    }

    public CircleConstrt(int centerX, int centerY, int radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

}
