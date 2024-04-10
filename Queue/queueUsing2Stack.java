package Queue;

import java.util.Stack;

public class queueUsing2Stack {
    public static class Queue {
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();
        public boolean isEmpty(){
            return s1.isEmpty();

        }
        //to implement add func ==>O(n)
        public void add(int data){
            if(s1.isEmpty()){
                s1.push(data);
                return;

            }
            while(!s1.isEmpty()){
                s2.push(s1.peek());
                s1.pop();
            }
            s1.add(data);
            while (!s2.isEmpty()) {
                s1.push(s2.peek());
                s2.pop();
                
            }
        }
        //remove func=>O(1)
        public int remove(){
            if(s1.isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return s1.pop();
        }
        public void print(){
            if(s1.isEmpty()){
                System.out.println("Queue is empty");
                return;
            }
            while (!s1.isEmpty()) {
                System.out.println(s1.peek());
                s1.pop();
                
            }
        }
    
        
    } 
    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        
        q.remove();
        q.print();
        
    }
    
}
