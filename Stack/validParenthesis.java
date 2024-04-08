package Stack;

import java.util.Stack;

public class validParenthesis {
    public static boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            //check for opening brackets
            if(c=='(' ||c=='{'||c=='['){
                st.push(c);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
            //checking for opening and closing pairs
                if((c==')' && st.peek()=='(') ||(c=='}' && st.peek()=='{') || (c==']' && st.peek()=='[')){
                    st.pop();

                }
                else{
                    return false;
                }
            }
        }
        if(st.isEmpty()){
            return true;
        }
        else if(!st.isEmpty()){
            return false;
        }
        return true;
        
    }
    public static void main(String[] args) {
        String s="((((}))))";
        System.out.println(isValid(s));
    }
    
}
