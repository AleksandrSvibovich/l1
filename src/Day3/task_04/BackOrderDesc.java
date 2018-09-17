package Day3.task_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

public class BackOrderDesc{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();

//        firstVar(br,list);
        secondVar(br);
    }

    private static void secondVar(BufferedReader br) {
        int[] nums = new int[3];
        for (int i = 0; i <nums.length; i++) {
            try {
                nums[i] = Integer.parseInt(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        int temp;

        for (int i = 0; i <nums.length; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                if(nums[i]<nums[j]){
                    temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }


        for (int i = 0; i < nums.length; i++) {
            System.out.println("Desc order : " + nums[i]);
        }
    }

    private static void firstVar(BufferedReader br, ArrayList<Integer> list) throws IOException {


        for (int i = 0; i < 5; i++) {
            list.add(i,Integer.parseInt(br.readLine()));
        }

        Comparator<Integer> c = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        };

        list.sort(c);

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Desc order : " + list.get(i));
        }
    }

}
