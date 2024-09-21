package Striver_Recursion;

import java.util.ArrayList;

public class subsequence {
    public static void printSubsequence(int arr[],int start,ArrayList<Integer> ls){
        if(start==arr.length){
            System.out.print(ls);
            return;

        }
        ls.add(arr[start]);
        printSubsequence(arr, start+1, ls);
        ls.remove(ls.size()-1);
        printSubsequence(arr, start+1, ls);
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        ArrayList<Integer> ls=new ArrayList<>();
        printSubsequence(arr, 0, ls);
    }
    
}
