// package Algorithms;
import java.util.Arrays;

public class selectionSortAlgo {
    public static void sort(int arr[]){
        int smallest=0;
        int index=0;
        for (int i = 0; i < arr.length-2; i++) {
            smallest=arr[i];
            index=i;
            for (int j = i+1; j < arr.length; j++) {
               if(arr[j]<smallest){
                index=j;
                smallest=arr[j]; 
               }
            }
           int temp=arr[i];
           arr[i]=arr[index];
           arr[index]=temp;
           System.out.println(Arrays.toString(arr));
            
        }
        
        
    }
    public static void main(String[] args) {
        int arr1[]={5,4,1,99,33,101,22,121,3,2};
        sort(arr1);
        
    }
    
}
