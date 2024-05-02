package Deque;
import java.util.*;

public class queueUsingDeque {
    public static void add(Deque<Integer> dq,int val){
        dq.addLast(val);


    }
    public static int remove(Deque<Integer> dq){
        if(dq.isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return dq.removeFirst();


    }
    public static int peek(Deque<Integer> dq){
        if(dq.isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return dq.getFirst();


    }
    public static void print(Deque<Integer> dq){
        while(!dq.isEmpty()){
            System.out.print(dq.removeFirst()+" ");
        }

    }
    public static void main(String[] args) {
        Deque<Integer> dq=new LinkedList<>();
        add(dq, 0);
        add(dq, 1);
        add(dq, 2);
        add(dq, 3);
        add(dq, 4);
        System.out.println(peek(dq));
    }
    
}
