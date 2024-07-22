import java.util.Arrays;

public class BinaryArraySort {
    public static String sort(byte arr[]){
        
        int low=0;
        int high=arr.length-1;
        while(low<high){
            if(arr[low]==1){
                if(arr[high]==0){
                    byte temp=arr[low];
                    arr[low]=arr[high];
                    arr[high]=temp;
                    low++;
                    high--;
                }
                else{
                    high--;
                }
            }
            else{

                low++;
            }
            
            
        }
        return Arrays.toString(arr);

    }
    public static void main(String[] args) {
        System.out.println(sort(new byte[] {0,1,0,1,0,1,1,0}));
        
    }
    
}
