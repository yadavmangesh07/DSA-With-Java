package HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class linkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>();
        lhm.put("India", 500);
        lhm.put("China", 750);
        lhm.put("Indonesia",350);
        lhm.put("Russia",1000);

        System.out.println(lhm);
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("India", 500);
        hm.put("China", 750);
        hm.put("Indonesia",350);
        hm.put("Russia",1000);
        System.out.println(hm);
        
    }
    
}
