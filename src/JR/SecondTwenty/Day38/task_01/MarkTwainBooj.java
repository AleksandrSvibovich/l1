package JR.SecondTwenty.Day38.task_01;

/**
 * Created by Aleksandr_Svibovich on 10/5/2018.
 */
public class MarkTwainBooj extends Book {
    public static String getAUTOR() {
        return AUTOR;
    }

    public static final String AUTOR = "Mark Twain";

    public String getBookName() {
        return bookName;
    }

    private String bookName = null;

    public MarkTwainBooj(String bookName) {
        this.bookName = bookName;
    }

    public String markTwainOutput() {
        return getBookName()+ " book was written by " + getAUTOR();
    }
}
