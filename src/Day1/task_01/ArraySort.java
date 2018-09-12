package Day1.task_01;

import java.util.ArrayList;

/**
 * Created by Aleksandr_Svibovich on 9/11/2018.
 */
public class  ArraySort {

    public static ArrayList<ArrayList<Integer>> sortArray(int[] nums) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        ArrayList<Integer> listOther = new ArrayList<Integer>();

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]%3==0){
                list3.add(nums[i]);
            }
            if(nums[i]%2==0){
                list2.add(nums[i]);
            }
            if(nums[i]%2!=0 && nums[i]%3!=0){
                listOther.add(nums[i]);
            }
        }

        list.add(list3);
        list.add(list2);
        list.add(listOther);

        return list;
    }
}
