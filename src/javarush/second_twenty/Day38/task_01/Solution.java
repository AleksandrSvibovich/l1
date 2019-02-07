package javarush.second_twenty.Day38.task_01;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Aleksandr_Svibovich on 10/8/2018.
 */
public class Solution {
    public static void main(String[] args) {
        List<Book> books = new LinkedList<Book>();
        books.add(new MarkTwainBooj("Tom Sawyer"));
        System.out.println(books);
    }
}
