package Strings;

import java.util.ArrayList;

class Solution {
    public static boolean checkInclusion(String s1, String s2) {
       ArrayList<String> m1=permutation(s1,"",new ArrayList<>());
       ArrayList<String> m2=permutation(s2,"",new ArrayList<>());
       for (int i = 0; i < m1.size(); i++) {
        for (int j = 0; j < m2.size(); j++) {
            if(m1.get(i)==m2.get(j)){
                return true;

            }
            
        }
        
       }

        return false;
        
    }
    public static ArrayList<String> permutation(String s,String ans,ArrayList<String> mlist){
        if(s.length()==0){
            mlist.add(ans);
            
        }
        for (int i = 0; i < s.length(); i++) {
            // char current=s.charAt(i);
            String q=s.substring(0, i)+s.substring(i+1);
            permutation(q, ans, mlist);
            
        }
        return mlist;


    }
    public static ArrayList<String> subStringS2(String s,int i,String ans,ArrayList<String> mylist){
        if(i==s.length()){
             mylist.add(ans);
             
             
            
                
            
            
            
        }
        //yes participation choice
        subStringS2(s, i+1, ans+s.charAt(i), mylist);
        //no participation choice
        subStringS2(s, i+1, ans,mylist);
        return mylist;
        
    }
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidboaoo";
        System.out.println(checkInclusion(s1, s2));
    }
    
}
