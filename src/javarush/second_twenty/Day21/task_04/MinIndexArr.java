package javarush.second_twenty.Day21.task_04;

/**
 * Created by Aleksandr_Svibovich on 9/25/2018.
 */
public class MinIndexArr {
    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, -77, 5, 5};
        System.out.println(findMinAndIndex(data));
    }

    private static String findMinAndIndex(int[] data) {
        String result = "";
        int min = Integer.MAX_VALUE;
        int position = -1;
        for (int i = 0; i <data.length ; i++) {
            if(data[i]<min){
                min = data[i];
                position = i;
            }
        }
        result = min + " " + position;
        return result;
    }
}
