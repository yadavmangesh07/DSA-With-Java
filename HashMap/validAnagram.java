package HashMap;

import java.util.HashMap;

public class validAnagram {

    public static boolean validityFunction(String s,String t){
        HashMap<Character,Integer> hm=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0)+1);
            
        }
        for (int i = 0; i < t.length(); i++) {
            if(hm.get(t.charAt(i))==1){
                hm.remove(t.charAt(i));
            }
            else{
                hm.put(t.charAt(i), hm.getOrDefault(t.charAt(i), 0)-1);

            }
            
        }
        return hm.isEmpty()?true:false;
        
        


    }
    public static void main(String[] args) {
        String s="care";
        String t="race";
        System.out.println(validityFunction(s, t));
        
    }
    
}
