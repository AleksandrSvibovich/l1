package Day3.task_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ChangeFunctionality {
    public static void main(String[] args) throws IOException {
        ArrayList l2 = readStrings();
        ArrayList<String> list = changeList(l2);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static public ArrayList<String> readStrings() throws IOException {
        ArrayList<String> list = new ArrayList<>();
        int count = 0;
        while (true){
            String s = br.readLine();
            if(s.isEmpty()){
                break;
            }
            list.add(s);
        }
        return list;
    }

    static public ArrayList<String> changeList(ArrayList<String> arrayList) {
        ArrayList<String> ls = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).length() % 2 == 0) {
                String result = arrayList.get(i) + " " + arrayList.get(i);
                ls.add(i, result);
            } else if(arrayList.get(i).length() % 2 == 1){
                String result = arrayList.get(i) + " " + arrayList.get(i) + " " + arrayList.get(i);
                ls.add(i, result);
            }
        }
        return ls;
    }
}
