package task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(-6);
        list.add(4);
        list.add(5);
        list.add(3);
        list.add(4);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(7);



        HashMap map = new HashMap();
        int temp;
         for (Integer i :list) {
            if(map.containsKey(i)){
                temp = (int)map.getOrDefault(i,-1);
                map.put(i,temp+1);
            }else {
                map.put(i,1);
            }
        }

        System.out.println(map.entrySet());
    }
}
