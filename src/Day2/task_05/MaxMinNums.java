package Day2.task_05;

/**
 * Created by Aleksandr_Svibovich on 9/12/2018.
 */
public class MaxMinNums {
    public static void main(String[] args) {
        int[] nums = new int[]{0,1,2,3,4,5,6,7,8,9,-100,11,12,13,14,15,16,17,18,400};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i <nums.length; i++) {
            if(nums[i]>max){
                max = nums[i];
            }
            if(nums[i]<min){
                min = nums[i];
            }
        }

        System.out.println("Max number " + max + " Min number " + min);
    }
}
