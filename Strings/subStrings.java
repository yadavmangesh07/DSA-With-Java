package Strings;

import java.util.ArrayList;
// import java.util.Stack;

// import LinkedList.LinkedList;

public class subStrings {
    public static int subStr(String s){
        ArrayList<String> ls=new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <=s.length(); j++) {
                ls.add(s.substring(i, j));
                
            }
            
        }
        return countPalindrome(ls);
        
    }
    public static int countPalindrome(ArrayList<String> ls){
        int count=0;
        StringBuilder sb =new StringBuilder("");
        for (String string : ls) {
            
                sb.append(string);
                
           
            if((sb.toString()).equals(sb.reverse().toString())){
                count++;
                
                
            }
            sb.setLength(0);
            
        }
        return count;
    }
    public static void main(String[] args) {
        String s="abc";
        System.out.println(subStr(s));
    }
    
}
