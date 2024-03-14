// import java.util.Arrays;

// public class BubbleSort {
//     public static void main(String[] args) {
//         int[] arr={8,3,6,-1,-69,92};
//         int t=arr.length;
//         boolean swap=false;

//         while(t!=0){
//             for (int i = 0; i < arr.length-1; i++) {
//             if(arr[i]>arr[i+1]){
//                 int temp=arr[i];
//                 arr[i]=arr[i+1];
//                 arr[i+1]=temp;
//                 swap=true;

//             }
//             //loop to see the internal working
//             for (int j : arr) {
//                     System.out.print(j+" ");
//                 }
//                 System.out.println();

//         }
//         if(swap==false){
//             System.out.println("Array is already sorted");
//             break;
//         }
//         t--;

//         }
//         System.out.println(Arrays.toString(arr));

//     }

// }
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        
        boolean swap=false;
        
        for (int j = 0; j < arr.length; j++) {
            for (int i = 1; i < arr.length-j; i++) {
                if(arr[i]<arr[i-1]){
                    int temp=arr[i];
                    arr[i]=arr[i-1];
                    arr[i-1]=temp;
                    swap=true;
                }
            }
             if(swap==false){
            System.out.println("Array is already sorted");
            break;

        }
       }
       System.out.println(Arrays.toString(arr));
    }
}

