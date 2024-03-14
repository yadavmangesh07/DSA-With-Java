import java.util.Arrays;

public class sortInsertion {
    public static void sort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j>0; j--) {
                if(arr[j]<arr[j-1]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
                else{break;}//reduces the no. of iterations
                System.out.println(Arrays.toString(arr));
                
            }
            
            
        }
        
    }
    public static void main(String[] args) {
        int arr1[]={5,4,1,3,2};
        sort(arr1);
        
    }
    
}
