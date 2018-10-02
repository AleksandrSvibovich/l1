package SecondTwenty.Day24.task_02;

/**
 * Created by Aleksandr_Svibovich on 9/25/2018.
 */
public class StringObjectTest {

    public static void main(String[] args) throws Exception {
        SimpleObject<String> stringObject = new StringObject();
    }

    interface SimpleObject<t> {
        SimpleObject<t> getInstance();
    }

    static class StringObject implements SimpleObject<String> {
        @Override
        public SimpleObject<String> getInstance() {
            return this;
        }
    }


}
