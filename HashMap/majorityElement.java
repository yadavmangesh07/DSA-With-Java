package HashMap;
import java.util.*;

public class majorityElement {
    //Given an integer array of size n, find all elements that appear more than  n/3 times.
    public static String majorityElementFunction(int arr[]){
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int i : arr) {
            // if(hm.containsKey(i)){
            //     hm.put(i,hm.get(i)+1);
            // }
            // else{
            //     hm.put(i, 1);
            // }
            hm.put(i,hm.getOrDefault(i, 0)+1);
            
        }
       ArrayList<Integer> ls=new ArrayList<>();
    //    Set<Integer> s=hm.keySet();
       for (Integer key : hm.keySet()) {
            if(hm.get(key)>arr.length/3){
                ls.add(key);
            }
        
       }
       
       return ls.toString();

    }

    public static void main(String[] args) {
        int arr[]={1,3,2,5,1,3,1,5,1};
        
        System.out.println(majorityElementFunction(arr));
        

    }
    
}
