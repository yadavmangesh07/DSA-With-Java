package HashMap;

import java.util.HashMap;
import java.util.Set;

public class iterationOnHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<> ();
        hm.put("India",250);
        hm.put("Indonesia",60);
        hm.put("China",500);
        hm.put("Nepal",40);
        hm.put("SriLanka",45);

        Set<String> keys=hm.keySet();
        System.out.println(keys);
        for (String key : keys) {
            System.out.println(key+":"+hm.get(key));
            
        }
        
    }
    
}
