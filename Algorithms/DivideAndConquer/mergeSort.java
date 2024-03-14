package DivideAndConquer;

public class mergeSort {
    public static void mergeSortAlgo(int arr[],int s,int e){
        if(s>=e){
            return;
        }
        int m=s+(e-s)/2;
        mergeSortAlgo(arr, s,m);
        mergeSortAlgo(arr, m+1,e);
        merge(arr,s,m,e);
        
    }

    public static void merge(int[] arr, int s, int m, int e) {
        int temp[]=new int[e-s+1];
        int k=0;
        int i=s;
        int j=m+1;
        while(i<=m && j<=e){
            if(arr[i]>arr[j]){
                temp[k]=arr[j];
                j++;
            }
            else{
                temp[k]=arr[i];
                i++;
            }
            k++;
        }
        while(i<=m){
            temp[k++]=arr[i++];
        }
        while(j<=e){
            temp[k++]=arr[j++];
        }
        
        for (int j2 = 0,g=s; j2 < temp.length; j2++,g++) {
            arr[g]=temp[j2];
            
        }
        
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i+" ");
            
        }
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8,-2,4};
        mergeSortAlgo(arr, 0, arr.length-1);
        printArray(arr);
    }
    
}
