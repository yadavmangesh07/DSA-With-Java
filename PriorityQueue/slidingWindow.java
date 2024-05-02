package PriorityQueue;

import java.util.Arrays;
import java.util.PriorityQueue;

public class slidingWindow {
    public static class pair implements Comparable<pair>{
        int indx;
        int val;
        pair(int val, int indx){
            this.val = val;
            this.indx = indx;
        }
        
        @Override
        public int compareTo(pair obj){
            return Integer.compare(obj.val, this.val);
        }
    }
    
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<pair> pq = new PriorityQueue<>();
        int arr[] = new int[nums.length - k + 1];

        // for the first window
        for(int i = 0; i < k; i++) {
            pq.add(new pair(nums[i], i));
        }
        arr[0] = pq.peek().val;
        for(int i = k; i < nums.length; i++) {
            // removing elements from the pq which were in the last window
            while(pq.size() > 0 && pq.peek().indx <= (i - k)){
                pq.remove();
            }
            // adding remaining element of new window
            pq.add(new pair(nums[i], i));
            // storing max in the resultant arr
            arr[i - k + 1] = pq.peek().val;
        }
        return arr;
    }

    public static void main(String[] args) {
        slidingWindow sw = new slidingWindow();
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] result = sw.maxSlidingWindow(nums, k);
        System.out.println("Maximum elements in sliding windows of size " + k + ": " + Arrays.toString(result));
    }
}
