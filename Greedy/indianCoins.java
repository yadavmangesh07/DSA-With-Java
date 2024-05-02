package Greedy;

import java.util.*;

public class indianCoins {
    public static int minCoin(Integer arr[],int val){
        int coins=0;
        Arrays.sort(arr);
        // Arrays.sort(arr,Comparator.reverseOrder());
        for (int i = arr.length-1; i >=0; i--) {
            if(arr[i]<=val){
                while(arr[i]<=val){

                    coins++;
                    val-=arr[i];
                }

            }

            
        }
        return coins;

    }
    public static void main(String[] args) {
        Integer arr[]={1,2,5,10,20,50,100,500,2000};
        int val=590;
        System.out.println("Minumun Number Of Coins Required :"+minCoin(arr, val));
    }
    
}
