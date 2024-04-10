package Queue;

import java.util.*;

public class stackUsing2Queue {
    public static class Stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2=new LinkedList<>();

        public boolean isEmpty(){
            return q1.isEmpty() && q2.isEmpty();
        }

        public void push(int data) {
            if (q1.isEmpty()) {
                q2.add(data);
                return;
            }

            q1.add(data);

        }
        public int pop(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            int top=0;
            //case1
            if(q1.isEmpty()){
                while(!q2.isEmpty()){
                    top=q2.remove();
                    if(q2.isEmpty()){//as we get the last el in the queue 
                        break;
                    }
                    q1.add(top);
                }
                
            }
            //case2
            else{
                while(!q1.isEmpty()){
                    top=q1.remove();
                    if(q1.isEmpty()){
                        break;
                    }
                    q2.add(top);
                }
            }
            return top;
            
            
            



        }
        public int peek(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            int top=0;
            //case1
            if(q1.isEmpty()){
                while(!q2.isEmpty()){
                    top=q2.remove();
                    
                    q1.add(top);
                }
                
            }
            //case2
            else{
                while(!q1.isEmpty()){
                    top=q1.remove();
                    
                    q2.add(top);
                }
            }
            return top;
            
            
            



        }
    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(0);
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
        
    }

}
