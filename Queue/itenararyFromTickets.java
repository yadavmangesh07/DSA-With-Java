package Queue;

import java.util.HashMap;
import java.util.Set;

public class itenararyFromTickets {
    public static String helper(HashMap<String,String> hm){
        HashMap<String,String> hm1=new HashMap<>();
        Set<String> s= hm.keySet();
        for (String string : s) {
            hm1.put(hm.get(string), string);
            
        }
        for (String keyString : s) {
            if(!hm1.containsKey(keyString)){
                return keyString;
            }
        }
        return null;

    }
    public static void main(String[] args) {
        HashMap<String,String> hm=new HashMap<>();
        hm.put("Chennai","Bengaluru");
        hm.put("Mumbai", "Delhi");
        hm.put("Goa", "Chennai");
        hm.put("Delhi", "Goa");
        String startPoint=helper(hm);
        System.out.print(startPoint);
        // for (String string : hm.keySet()) {
        //     System.out.print("=>"+hm.get(startPoint));
        //     startPoint=hm.get(startPoint);

            
        // }
        int s=hm.size();
        while(s!=0){
            System.out.print("=>"+hm.get(startPoint));
            startPoint=hm.get(startPoint);
            s--;

        }
    }
    
}
