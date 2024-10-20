package LeetCode;

import java.util.ArrayList;
import java.util.Stack;

public class ParsingBooleanExpression_1106 {
    
    public static boolean parseBoolExpr(String expression) {
        Stack<Character> st = new Stack<>();
       
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == ')') {
                ArrayList<Character> ls = new ArrayList<>();
                while (st.peek() != '(') {
                    ls.add(st.pop());
                }
                st.pop();// remove closing bracket
                char op = st.pop();
                st.push(evaluate(ls,op));
                
            } else if(c!=',') {
                st.push(c);
                

            }
            
        }
        return st.peek()=='t';
    }

    public static char evaluate(ArrayList<Character> ls, char op) {
        if (op == '|') {
            if (ls.contains('t')) {
               return 't';
            } else {
                return 'f';     
                   }
        } else if (op == '&') {
            if (ls.contains('f')) {
                return 'f';
            } 
            else {
                return 't';
            }
        } 
        else {
            if (ls.get(0) == 'f') {
                return 't';
            } 
            else {

                return 'f';
            }
        }
    }
    public static void main(String[] args) {
        String expression="|(f,f,f,t)";
        System.out.println(parseBoolExpr(expression));
    }
}
    

