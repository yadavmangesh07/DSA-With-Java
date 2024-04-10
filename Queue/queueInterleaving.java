package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class queueInterleaving {
    public static void interleave(Queue<Integer> q1){
        int size=q1.size();
        Queue<Integer> q2=new LinkedList<>();
      
        for (int i = 0; i < size/2; i++) {
            q2.add(q1.peek());
            q1.remove();
        }
        while (!q2.isEmpty()) {
            q1.add(q2.peek());
            q2.remove();
            q1.add(q1.peek());
            q1.remove();

            
        }
    }
    public static void print(Queue<Integer> q1){
        while(!q1.isEmpty()){
            System.out.print(q1.peek()+" ");
            q1.remove();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        // print(q);
        interleave(q);
        print(q);
        
    }
    
}
