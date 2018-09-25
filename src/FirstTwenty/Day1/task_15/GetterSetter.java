package Day1.task_15;

/**
 * Created by Aleksandr_Svibovich on 9/11/2018.
 */
public class GetterSetter {
    public static int getCatCount() {
        return catCount;
    }

    public static void setCatCount(int catCount) {
        GetterSetter.catCount = catCount;
    }

    private static int catCount = 0;

    public GetterSetter(){
        catCount++;
    }
}
