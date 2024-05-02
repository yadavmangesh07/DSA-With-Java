package HashMap;

import java.util.LinkedHashMap;
import java.util.Set;

public class leetCode2053 {
    public String kthDistinct(String[] arr, int k) {
        LinkedHashMap<String,Integer>  hm=new LinkedHashMap<>();
        for(String s:arr){
            hm.put(s,hm.getOrDefault(s,0)+1);

        }
        Set<String> hs=hm.keySet();
        int count=0;
        for(String key:hs){
            if(hm.get(key)==1){
                if(count==k-1){
                    return key;
                }
                else{
                    count++;
                }
            }
        }
        return "";
        

        
    }
    
}
