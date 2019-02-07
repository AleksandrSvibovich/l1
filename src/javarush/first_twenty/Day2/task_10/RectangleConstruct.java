package Day2.task_10;

/**
 * Created by Aleksandr_Svibovich on 9/12/2018.
 */
public class RectangleConstruct {
    private int top;
    private int left;
    private int width;
    private int height;


    public RectangleConstruct(int top, int left, int width, int height) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public RectangleConstruct(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public RectangleConstruct() {
    }
}
