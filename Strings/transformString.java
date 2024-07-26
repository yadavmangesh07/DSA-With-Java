package Strings;

public class transformString {
    public static String helper(String s){
        String res="";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='a'){
                res+='b';

            }
            else if(s.charAt(i)=='b'){
                res+='a';
            }
            else{
                res+=s.charAt(i);
            }
            
        }
        return res;
    }

    public static void main(String[] args) {
        String s="abaabbcc";
        System.out.println(helper(s));
        
    }
    
}
