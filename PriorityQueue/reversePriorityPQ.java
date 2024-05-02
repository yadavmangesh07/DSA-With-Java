package PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class reversePriorityPQ {
        public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
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
