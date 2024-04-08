package Stack;

import java.util.Stack;

public class duplicateParentheses {

    
    public static boolean isDuplicate(String s){
        Stack<Character> st=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            if(c!=')' && c!='}' && c!=']'){
                st.push(c);
            }
            else if (c==')' || c==']' || c=='}') {
                int count=0;
                while((c==')' && st.peek()!='(') ||(c=='}' && st.peek()!='{') || (c==']' && st.peek()!='[')){
                    st.pop();
                    count++;
                }
                st.pop();
                
                if(count==0){
                    return true;
    
                }
            }

                
            
            
        }
        return false;
    }
    public static void main(String[] args) {
        String s="((a+b)+{{}})";
        System.out.println(isDuplicate(s));
    }
    
}
