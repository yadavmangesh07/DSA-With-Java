package ArrayList;

import java.util.*;

public class maxElement {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(12);
        list.add(10);
        list.add(19);
        list.add(-11);
        list.add(0);
        int max=list.get(0);
        for (int i = 1; i < list.size(); i++) {
            max=Math.max(max, list.get(i));
            
        }
        
        System.out.println(max);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
    
}
