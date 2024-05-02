package HashMap;

import java.util.TreeMap;

public class TreeHashMap {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        //treemap sorts key on increasing order either its string or integer
        @SuppressWarnings("rawtypes")
        TreeMap <String,Integer> tm=new TreeMap();
        tm.put("India", 500);
        tm.put("China", 750);
        tm.put("Indonesia",350);
        tm.put("Russia",1000);
        System.out.println(tm);
        @SuppressWarnings({ "rawtypes" })
        TreeMap <Integer,Integer> tm2=new TreeMap();
        tm2.put(10, 100);
        tm2.put(2, 100);
        tm2.put(31, 100);
        tm2.put(4, 100);
        System.out.println(tm2);




    }
    
}
