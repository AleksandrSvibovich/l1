package Day20.task_01;

/**
 * Created by Aleksandr_Svibovich on 9/24/2018.
 * Написать метод, который возвращает минимальное и максимальное числа в массиве.
 */
public class FindMinMax {
    public static void main(String[] args) {
        int[] arr = new int[4];
        arr[0] = 7;
        arr[1] = -7;
        arr[2] = 17;
        arr[3] = 99;
        System.out.println(findMin(arr)+ " -mi  : max " + findMax(arr));
    }

    private static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    private static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
}
