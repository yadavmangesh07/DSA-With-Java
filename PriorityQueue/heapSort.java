package PriorityQueue;

public class heapSort {
    public static void heapify(int arr[],int i,int size){
        int left=2*i+1;
        int right=2*i+2;
        int maxIndx=i;

        if(left<size && arr[left]>arr[maxIndx]){
            maxIndx=left;
        }
        if(right<size && arr[right]>arr[maxIndx]){
            maxIndx=right;
        }
        if(maxIndx!=i){

            int temp=arr[i];
            arr[i]=arr[maxIndx];
            arr[maxIndx]=temp;

            heapify(arr, maxIndx, size);
        }

    }
    public static void heapSortFunc(int arr[]){
        //build max heap 
        int n=arr.length;
        for (int j = n/2; j >=0; j--) {
            heapify(arr, j,n);
            
        } 
        //push largest at end since it is a max heap ,therefor all the elements in the array will be in a decreasing order
        for (int i =arr.length-1; i >0; i--) {

            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;

            //calling heapify from root to maintain the max heap property
            heapify(arr,0,i);

        }




    }
    public static void main(String[] args) {
        int arr[]={1,2,4,5,3};
        heapSortFunc(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }

    }
    
}
