package HashMap;

import java.util.HashSet;
import java.util.Iterator;

public class hashSet {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3) ;
        hs.add(1);
        hs.add(4);
        hs.add(5);
        hs.add(6);
        hs.add(7);
        System.out.println(hs);
        System.out.println(hs.size());
        System.out.println(hs.isEmpty());
        // System.out.println(hs.removeIf());
        @SuppressWarnings("rawtypes")
        Iterator it=hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        for (Integer integer : hs) {
            System.out.println(integer);
            
        }
    }
    
}
