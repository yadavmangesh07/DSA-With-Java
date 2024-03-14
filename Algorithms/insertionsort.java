import java.util.Arrays;

public class insertionsort {
    static void Innerinsertionsort (int[] arr){
        //we will run i from 0 to 2 last index as last index will be occupied by j
        for (int i = 0; i <arr.length-1; i++) {
            //j should be always >0 and 1 more than i and should decrement by 1 always
            for (int j = i+1; j >0; j--) {
                if (arr[j-1]>arr[j]) {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    
                }
                else{
                    break;
                }
                
                
            }
            

            
        }
        // return Arrays.toString(arr);
        
    
        
    }
    public static void main(String[] args) {
        int[] ar={6,1,9,2,12,0};
        Innerinsertionsort(ar);
        System.out.println(Arrays.toString(ar));
    }
    
}
