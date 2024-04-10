package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class leetcode1700 {
    public static int helperFunction(int students[],int sandwiches[]){
        Queue<Integer> q=new LinkedList<>();
         Stack<Integer> st=new Stack<>();
        for (Integer integer : students) {
            q.add(integer);
            
        }
        for(int i=sandwiches.length-1;i>=0;i--){
            st.push(sandwiches[i]);
        }
        
       
        return helper(q,st);
        
    }
    public static int helper(Queue <Integer> q,Stack<Integer> st){
        int count=0;
        while(!st.isEmpty()){
            if(q.peek()!=st.peek()){
                int temp=q.remove();
                q.add(temp);
                count++;
                if(count==q.size()){
                    return q.size();
                }
            }
            else{
                q.remove();
                st.pop();
                count=0;
            }

        }
        return q.size();
    }
    public static void main(String[] args) {
        int student[]={1,1,1,0,0,1};
        int sandwiches[]={1,0,0,0,1,1};
        System.out.println(helperFunction(student, sandwiches));
    }
    
}
