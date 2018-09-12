package Day2.task_09;

/**
 * Created by Aleksandr_Svibovich on 9/12/2018.
 */
public class Rectangle {
    private int top;
    private int left;
    private int width;
    private int height;
    private Rectangle rectangle;

    public void initialize() {
    }

    public void initialize(int top) {
        this.top = top;
    }

    public void initialize(int top, int left) {
        this.top = top;
        this.left = left;
    }

    public void initialize(int top, int left, int width) {
        this.top = top;
        this.left = left;
        this.width = width;
    }

    public void initialize(int top, int left, int width, int height) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public void initialize(Rectangle rectangle) {
        this.rectangle = rectangle;
    }


}
