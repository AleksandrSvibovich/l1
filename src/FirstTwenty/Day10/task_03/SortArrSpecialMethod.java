package Day10.task_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by Aleksandr_Svibovich on 9/17/2018.
 */
public class SortArrSpecialMethod {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sort(br);
    }

    private static void sort(BufferedReader br) throws IOException {
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(nums);
        for (int i = 0; i <5; i++) {
            System.out.println(nums[i]);
        }
    }
}
