package task_17;

/**
 * Created by Aleksandr_Svibovich on 9/12/2018.
 */
public class Circle {
    private int centerX;
    private int centerY;
    private int radius;
    private int width;
    private String color;

    public int getCenterX() {
        return centerX;
    }

    public int getCenterY() {
        return centerY;
    }

    public int getRadius() {
        return radius;
    }

    public int getWidth() {
        return width;
    }

    public String getColor() {
        return color;
    }

    public void initialize(){
        this.centerX = 1;
        this.centerY = 1;
        this.radius = 1;
        this.width = 1;
        this.color = "Green";
    }

    public void initialize(int centerX, int centerY, int radius){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    public void initialize(int centerX, int centerY, int radius,int width){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;

    }

    public void initialize(int centerX, int centerY, int radius, int width, String color){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }


}
