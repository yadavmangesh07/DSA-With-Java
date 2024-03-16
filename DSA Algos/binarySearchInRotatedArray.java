//modified binary search
public class binarySearchInRotatedArray {
    public static int  search(int arr[],int s,int e,int target){
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if(arr[m]==target){
            return m;

        }
        if(arr[s]<=arr[m]){
            //case1;
            if(arr[s]<=target && arr[m]>=target){
                return search(arr, s, m-1, target);

            }
            else{
                return search(arr, m+1, e, target);
            }
        }
        else{
            if(arr[m]<=target && arr[e]>=target){
                return search(arr, m+1, e, target);

            }
            else{
                return search(arr, s, m-1, target);
            }
            
        }

        
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        System.out.println(search(arr, 0, arr.length-1, 0));
    }
    
}
