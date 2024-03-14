package DivideAndConquer;

import java.util.Arrays;

public class divideAndConquer {
    public static void quickSort(int arr[],int s,int e){
        if(s>=e){
            return;
        }
        int pvtIndex=pivotIndexFunction(arr,s,e);//getting the correct index of pivot element
        quickSort(arr, s, pvtIndex-1);//left part to pivot
        quickSort(arr, pvtIndex+1,e);//right part to pivot
    }

    private static int pivotIndexFunction(int[] arr, int s, int e) {
        int pivot=arr[e];//pivot value
        int i=s-1;//to make place for values smaller than pivot
        for (int j = s; j < e; j++) {
            
            if(arr[j]<=pivot){
                i++;
                //swap
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
            
        }
        i++;
        //swapping the value of pivot with the last element 
        int temp=pivot;
        arr[e]=arr[i];
        arr[i]=temp;
        return i;//returning the index of pivot element

    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8,-2,4};
        quickSort(arr, 0, arr.length-1);
        
        System.out.println(Arrays.toString(arr));

    }
    
}
