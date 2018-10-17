package Day15.task_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import static java.util.Collections.sort;


/**
 * Created by Aleksandr_Svibovich on 9/20/2018.
 */
public class SortNumWords {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        fillArray(list);
        sortSpecial(list);
    }

    private static void sortSpecial(ArrayList<String> list) {
        ArrayList<String> nums = new ArrayList<>();
        ArrayList<String> strings = new ArrayList<>();
        ArrayList<Integer> numsID = new ArrayList<>();
        ArrayList<Integer> stringsID = new ArrayList<>();
        String[] result = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            if (isNumber(list.get(i))) {
                nums.add(list.get(i));
                numsID.add(i);
            } else {
                strings.add(list.get(i));
                stringsID.add(i);
            }
        }
        sort(strings);
        sortNumsDesc(nums);

        for (int i = 0; i < strings.size(); i++) {
            result[stringsID.get(i)] = strings.get(i);
        }

        for (int i = 0; i < nums.size(); i++) {
            result[numsID.get(i)] = nums.get(i);
        }
        printArr(result);

    }

    private static void sortNumsDesc(ArrayList<String> nums) {
        String temp = "";
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (Integer.parseInt(nums.get(j)) > Integer.parseInt(nums.get(i))) {
                    temp = nums.get(j);
                    nums.set(j, nums.get(i));
                    nums.set(i, temp);
                }
            }

        }
    }

    private static boolean isNumber(String s) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            boolean b = Character.isDigit(arr[i]);
            if (!b) {
                return b;
            }
        }
        return true;
    }


    private static void fillArray(ArrayList<String> list) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int counter = 0;
            String text = br.readLine();
            if (text.equalsIgnoreCase("")) {
                break;
            }
            list.add(text);
        }
    }

    private static void printArr(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
