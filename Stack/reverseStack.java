package Stack;

import java.util.Stack;
//with constant space complexity
public class reverseStack {
    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverse(s);
        pushAtBottom(s,top);
    }

    private static void pushAtBottom(Stack<Integer> s, int top) {
        if (s.isEmpty()) {
            s.push(top);
            return;
            
        }
        int val=s.pop();
        pushAtBottom(s, top);
        s.push(val);


    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        reverse(st);
        while (!st.isEmpty()) {
            System.out.println(st.pop());
            
            
        }

    }
    
}
