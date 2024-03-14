import java.util.Arrays;

public class mergeSortedArray {
    public static void merge(int arr1[],int arr2[]){
        int i=arr1.length-1;
        int j=arr2.length-1;
        while(j>=0){
            arr1[i]=arr2[j];
            i--;
            j--;

        }
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        


    }
    public static void main(String[] args) {
        int arr1[]={4,5,6,0,0,0};
        int arr2[]={1,2,3};
       merge(arr1, arr2);

    }
    
}
