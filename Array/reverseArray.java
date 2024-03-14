public class reverseArray {
    public static void reverse(int arr[]){
        int start=0;
        int end=arr.length-1;
        while (start<end) {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
            
        }
    }
    
     
    public static void main(String[] args) {
        int array1[]={5,4,3};
        reverse(array1);
        for (int i : array1) {
            System.out.print(i+" ");
        }
        
    }
    
}
