import java.util.HashMap;

class LongestPalindromicSubstring {
    public static String longestPalindrome(String s) {
        if(s.length()==1){
            return s;
        }
        HashMap<String,Boolean> hm=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String k = s.substring(i, j);
               
                if(k.length()!=1){
                    if(checkPalindrome(k)){
                        hm.put(k, true);
                    }
                    

                }
                
                
            }
        }
       
        String max="";
        for (String key : hm.keySet()) {
           
                if(key.length()>max.length()){
                    max=key;
                }
           
        }
        return max.length()!=0?max:Character.toString(s.charAt(0));
        
    }

    public static Boolean checkPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;

        
    }
    public static void main(String[] args) {
        String s="babad";
        System.out.println(longestPalindrome(s));
    }
}