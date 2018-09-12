package Day2.task_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Aleksandr_Svibovich on 9/12/2018.
 */
public class BackOrderNum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = new int[10];
        int[] nums2 = new int[10];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < nums.length; i++) {
            nums2[i] = nums[nums.length - i - 1];
        }

        for (int i = 0; i < nums2.length; i++) {
            System.out.println("Back order : " + nums2[i]);
        }
    }
}
