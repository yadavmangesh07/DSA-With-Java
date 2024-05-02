package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hm1=new HashMap<>(); 
        HashMap<Integer,Integer> hm2=new HashMap<>(); 
        for (int i : nums1) {
            hm1.put(i, hm1.getOrDefault(i,0)+1);
            
        }
        for (int i : nums2) {
            hm2.put(i, hm2.getOrDefault(i,0)+1);
            
        }
        if(hm1.size()>hm2.size()){
            Set<Integer> hs=hm1.keySet();
            for (Integer key : hs) {
                if(!hm2.containsKey(key)){
                    hm1.remove(key);
                }
                
            }
            
            
        }
        else{
            Set<Integer> hs=hm2.keySet();
            for (Integer key : hs) {
                if(!hm1.containsKey(key)){
                    hm2.remove(key);
                }
                
            }

        }
        ArrayList<Integer> ls=new ArrayList<>();
        Set<Integer> fs=hm1.keySet();
        for (Integer key : fs) {
            int fr=Math.min(hm1.get(key), hm2.get(key));
            for (int i = 0; i < fr; i++) {
                ls.add(key);
                
            }
            
            
            
        }
        int arr[]=new int[ls.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=ls.get(i);
            
        }
        return arr;
            
                        

       
        
        
        
        


                       
        
        
    }
}