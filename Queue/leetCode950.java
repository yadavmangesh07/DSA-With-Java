package Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class leetCode950 {
    
        public static int[] deckRevealedIncreasing(int[] deck) {
            Arrays.sort(deck);
    
            int n = deck.length;
            Queue<Integer> indexQueue = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                indexQueue.offer(i); // Enqueue the indices of the deck
            }
    
            int[] result = new int[n];
            for (int card : deck) {
                result[indexQueue.poll()] = card; // Reveal the card
                System.out.println(result.toString());
                if (!indexQueue.isEmpty()) {
                    indexQueue.offer(indexQueue.poll()); // Move the next top card to the bottom
                }
                    System.out.println(indexQueue.toString());
                    
                
            }
    
            return result;
            
        
    }
    public static void main(String[] args) {
        int deck[]={17,13,11,2,3,5,7};
        // System.out.println(deckRevealedIncreasing(arr));
        Arrays.sort(deck);
    
            int n = deck.length;
            Queue<Integer> indexQueue = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                indexQueue.offer(i); // Enqueue the indices of the deck
            }
    
            int[] result = new int[n];
            for (int card : deck) {
                result[indexQueue.poll()] = card; // Reveal the card
                System.out.println(result.toString());
                if (!indexQueue.isEmpty()) {
                    indexQueue.offer(indexQueue.poll()); // Move the next top card to the bottom
                }
                    System.out.println(indexQueue.toString());
                    
                
            }
        
        
    }
    
}
