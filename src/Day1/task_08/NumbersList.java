package Day1.task_08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Aleksandr_Svibovich on 9/11/2018.
 */
public class NumbersList {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = new int[20];
        int[] numsPart1 = new int[10];
        int[] numsPart2 = new int[10];

        for (int i = 0; i <nums.length; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i <nums.length; i++) {
            for (int j = 0; j <numsPart1.length; j++) {
                numsPart1[j] = nums[j];
            }
            for (int j = 0; j <numsPart2.length; j++) {
                numsPart2[j] = nums[10+j];
            }
        }

        for (int i = 0; i <numsPart2.length; i++) {
            System.out.println(" Nums part two " + numsPart2[i]);
        }

    }
}
