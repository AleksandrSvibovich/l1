package Day7.task_03;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Aleksandr_Svibovich on 9/16/2018.
 */
public class RemoveSetOverTen {
    public static void main(String[] args) {
        Set<Integer> nums = new HashSet<>();
        for (int i = 0; i <20; i++) {
            nums.add(i);
        }

        RemoveSetOverTen r = new RemoveSetOverTen();
        r.removeOverTen(nums);
    }

    private void removeOverTen(Set<Integer> nums) {
        Set<Integer> newS = new HashSet<>();
        newS.addAll(nums);
        for (Integer i: nums) {
            if(i>10){
                newS.remove(i);
            }
        }

        for (Integer i:newS) {
            System.out.println(i);
        }
    }


}
