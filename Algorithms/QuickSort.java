
public class QuickSort {
    public static void quickSortFunction(int arr[],int start,int end){
        if(start<end){

            int pivotIndex=findPivotElement(arr,start,end);
            quickSortFunction(arr, start,pivotIndex-1 );
            quickSortFunction(arr, pivotIndex+1,end );
        }
        
    }
    private static int findPivotElement(int[] arr, int start, int end) {
        int pivot=arr[start];
        int i=start;
        int j=end;
        while(i<j){
            while (i <= end && arr[i] <= pivot) {
                i++;
            }
            while (j >= start && arr[j] > pivot) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        arr[start]=arr[j];
        arr[j]=pivot;

        return j;

    }
    static void quickSort(int arr[], int low, int high)
    {
       if(low<high){
           int pivotIndex=partition(arr,low,high);
           quickSort(arr,low,pivotIndex-1);
           quickSort(arr,pivotIndex+1,high);
       }
    }
    public static void swap(int arr[],int a ,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
       
    }
    static int partition(int arr[], int low, int high)
    {
       int pivot=arr[low];
       int i=low+1;
       int j=high;
       while(i<j){
           while(arr[i]<=pivot && i<high){
               i++;
           }
           while(arr[j]>pivot && j>=low){
               j--;
               
           }
           if(i<j){
               
           swap(arr,i,j);
           }
           
       }
       swap(arr,low,j);
       
       return j;
    } 
    public static void main(String[] args) {
        int arr[]={24,18,38,43,14 ,40, 1, 54};
        quickSortFunction(arr, 0, arr.length-1);
        for (int i : arr) {
            System.out.print(i+" ");
        }
        

    }
    
}
