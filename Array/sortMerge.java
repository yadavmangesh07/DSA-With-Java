import java.util.Arrays;

public class sortMerge {
    public static void recursionFunc(int arr[],int s,int e){
        if(s>=e){
            return;
        }
        int m=s+(e-s)/2;
        recursionFunc(arr,s,m);
        recursionFunc(arr,m+1,e);
        mergeSort(arr, s,m, e);
    }

    private static void mergeSort(int[] arr, int s,int m, int e) {
        int temp[]=new int[e-s+1];
        int k=0;
        int i=s;
        int j=m+1;
        while(i<=m && j<=e){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
                
            }
            else{
                temp[k]=arr[j];
                j++;
                
            }
            k++;
        }
        while(i<=m){
            temp[k++]=arr[i++];
        }
        while(j<=e){
            temp[k++]=arr[j++];
        }
        for (int j2 = 0,l=s; j2 < temp.length; j2++,l++) {
            arr[l]=temp[j2];
            
        }
    }
    public static void printArray(int arr[]){
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        recursionFunc(arr, 0, arr.length-1);
        printArray(arr);
    }
    
}
