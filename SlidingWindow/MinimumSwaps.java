package SlidingWindow;

// A swap is defined as taking two distinct positions in an array and swapping the values in them.

// A circular array is defined as an array where we consider the first element and the last element to be adjacent.

// Given a binary circular array nums, return the minimum number of swaps required to group all 1's present in the array together at any location.



public class MinimumSwaps {
    public static int minSwaps(int[] nums) {
        int n = nums.length;
        int[] arr = new int[2 * n];
        int countOne = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = nums[i];
            arr[n + i] = nums[i];
            if (nums[i] == 1) {
                countOne++;
            }
        }


        int countZero=0;
        for (int i = 0; i < countOne; i++) {
            if(arr[i]==0){
                countZero++;
            }
        }
       if(countZero==0)return 0;
      
        int minSwap = Integer.MAX_VALUE;
        int p1=1;
        int p2=countOne-1;
        while(p1<arr.length && p2<arr.length-1){
            if(arr[p1-1]==0){
                countZero--;

            }
            if(arr[p2+1]==0){
                countZero++;
            }
            minSwap=Math.min(minSwap, countZero);
            p1++;
            p2++;

        }

        return minSwap;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 1, 0, 0, 1, 1, 0};
        int res = minSwaps(arr);
        System.out.println("Minimum swaps required: " + res);
    }
}
