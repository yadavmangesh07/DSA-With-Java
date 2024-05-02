package HashMap;

import java.util.HashMap;
import java.util.Map;

public class createHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();

        //insertion in hashmap
        hm.put("India", 250);
        hm.put("China", 500);
        hm.put("USA", 200);
        hm.put("Bhutan", 20);
        hm.put("India", 1000);

        //print hm
        System.out.println(hm);

        //oprations--> all the functions works in the O(1) time complexity
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.get("China"));
        System.out.println(hm.get("Russia"));
        System.out.println(hm.remove("Bhutan"));
        for (Map.Entry<String, Integer> temp :hm.entrySet() ) {
            System.out.println("Key :"+temp.getKey()+","+ "Value :"+temp.getValue());
            
        }

        //isEmpty
        System.out.println(hm.isEmpty());

        //clear
        hm.clear();
        System.out.println(hm);



    }
    
}
