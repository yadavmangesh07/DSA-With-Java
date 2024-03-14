import java.util.Arrays;

public class countingSort {
    public static String sort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest=Math.max(largest, arr[i]);
            
        }
        int count[]=new int[largest+1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;}
        System.out.println(Arrays.toString(count));   
        int a=0;
        for (int k = 0; k < count.length; k++) {
            while(count[k]>0){
                arr[a]=k;
                a++;
                count[k]--;

            }
            
        }
        return Arrays.toString(arr);

    }
    public static void main(String[] args) {
        int arr[]={3,3,3,3,6,6,1,2,2,2,7};
        System.out.println(sort(arr));

        
    }
    
}
