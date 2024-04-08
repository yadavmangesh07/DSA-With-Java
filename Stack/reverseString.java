package Stack;
import java.util.*;

public class reverseString {
    public static void reverse(String s){
        Stack<Character> st=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            st.push(s.charAt(i));
        }
        StringBuilder sb=new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            sb.append(st.pop());
        }
        System.out.println(sb);
    }
    public static void main(String[] args) {
        String s="MANGESH";
        reverse(s);        

    }
    
}
