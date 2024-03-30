package Recursion;

public class firstOccurence {
    // public static int findex(int arr[],int i,int key){

    //     if(i==arr.length){
    //         System.out.println("element not found");
    //         return -1;


    //     }
    //     if(arr[i]==key){
            
    //         return i;
            
    //     }
    //     return findex(arr, i+1,key);
        
        
      
    // }
    public static int lastindex(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key && lastindex(arr, key, i+1)==-1){
           return i;

        }
        return lastindex(arr, key, i+1);
        

    }
    public static void main(String[] args) {
        int arr[]={8,3,6,9,9,10,2,5,3};
        System.out.println(lastindex(arr, 9, 0));
    }
    
}
