package Deque;
import java.util.*;

public class stackUsingDeque {
    public static void push(Deque<Integer> dq,int data){
        dq.addLast(data);
    }
    public static int pop(Deque<Integer> dq){
        if(dq.isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        return dq.removeLast();
    }
    public static int peek(Deque<Integer> dq){
        if(dq.isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        return dq.getLast();
    }
    public static void print(Deque<Integer> dq){
        if(dq.isEmpty()){
            System.out.println("Stack is Empty");
            return;
        }
        while(!dq.isEmpty()){
            System.out.print(dq.removeLast()+" ");

        }

    }
    public static void main(String[] args) {
        Deque<Integer>dq=new LinkedList<>();
        push(dq, 0);
        push(dq, 1);
        push(dq, 2);
        push(dq, 3);
        push(dq, 4);
        push(dq, 5);
        System.out.println(pop(dq));
       
    }
    
}
