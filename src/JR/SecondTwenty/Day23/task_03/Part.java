package JR.SecondTwenty.Day23.task_03;

/**
 * Created by Aleksandr_Svibovich on 9/25/2018.
 */
public class Part {
    final static Part HEAD = new Part("Head");
    final static Part TAIL = new Part("Tail");
    final static Part BODY = new Part("Body");
    final static Part PAW = new Part("Paw");

    private String partOfBody;

    public Part(String part) {
        this.partOfBody = part;
    }

    public String toString() {
        return this.partOfBody;
    }

}
