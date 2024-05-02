package Greedy;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public static ArrayList<ArrayList<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        int min = Integer.MAX_VALUE;
        for(int i = 1; i< n;i++){
            min = Math.min(min, arr[i]-arr[i-1]);
        }
        
        int i=0;
        int j=1;
        ArrayList<ArrayList<Integer>> totalList=new ArrayList<>();

        while(j<n){
            if(Math.abs(arr[i]-arr[j])==min){
                ArrayList<Integer> list = new ArrayList<>();
                list.add(arr[i]);
                list.add(arr[j]);
                totalList.add(list);                      
            }
            i++;
            j++; 
        }
        return totalList;
    }
    public static void main(String[] args) {
        int arr[]={4,2,1,3};
        System.out.println(minimumAbsDifference(arr));
    }
}