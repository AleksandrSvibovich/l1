package Day1.task_01;

import static Day1.task_01.ArraySort.sortArray;
import static Day1.task_01.EnterText.getNumArray;
import static Day1.task_01.PrintList.printList;

/**
 * Created by Aleksandr_Svibovich on 9/11/2018.
 */
public class Runner {
    public static void main(String[] args) {
        printList(sortArray(getNumArray(6)));
    }
}
