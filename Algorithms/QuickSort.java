
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
    public static void main(String[] args) {
        int arr[]={9,8,3,9,1,6,2,7,4,5};
        quickSortFunction(arr, 0, arr.length-1);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    
}
