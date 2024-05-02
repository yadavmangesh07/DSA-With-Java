package Greedy;

import java.util.Arrays;

public class minAbsoluteDifference {
    public static int minAbsDiffer(int []arr1,int arr2[]){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int result=0;
        for (int i = 0; i < arr2.length; i++) {
            result=Math.abs(arr1[i]-arr2[i]);

            
        }
        return result;
    }
    public static void main(String[] args) {
        int arr1[]={1,2,3};
        int arr2[]={2,1,3};
        System.out.println(minAbsDiffer(arr1, arr2));
    }
    
}
