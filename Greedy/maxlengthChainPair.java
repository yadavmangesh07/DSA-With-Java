package Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class maxlengthChainPair {

    public static int maxLenChainPair(int arr[][]){//O(nlogn)
        int count=1;
        Arrays.sort(arr,Comparator.comparingDouble(o->o[1]));//sorting on the basis of end time

        int lastEndTime=arr[0][1];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i][0]>lastEndTime){
                count++;
                lastEndTime=arr[i][1];
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[][]={
            {5,24},
            {39,60},
            {5,28},
            {27,40},
            {50,90},
        };
        System.out.println(maxLenChainPair(arr));
    }
    
}
