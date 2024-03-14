public class binarySearch {
    public static int search(int arr[], int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            }
            else if (target<arr[mid]) {
                end=mid-1;

                
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // int arr1[] = new int[7];
        int arr1[]={1,2,3,4,5,6,7,8};
        System.out.println(search(arr1, 7));
        
        
    }
    
}
