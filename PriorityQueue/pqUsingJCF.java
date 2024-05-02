package PriorityQueue;

import java.util.PriorityQueue;

public class pqUsingJCF {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        // pq.offer(30);
        // pq.offer(13);
        // pq.offer(32);
        // pq.offer(23);
        // pq.offer(3);
        // while (!pq.isEmpty()) {
        //     System.out.print(pq.peek()+" ");
        //     pq.poll();
            
        // }
        pq.add(30);
        pq.add(13);
        pq.add(32);
        pq.add(23);
        pq.add(3);
        while (!pq.isEmpty()) {
            System.out.print(pq.peek()+" ");
            pq.remove();
            
        }
    }
    
}
