import java.util.Arrays;

public class bubblSortDSA {
    public static String sort(int arr[]){
        boolean swap=false;
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 1; j < arr.length-i; j++) {
                        if(arr[j]<arr[j-1]){
                        int temp=arr[j];
                        arr[j]=arr[j-1];
                        arr[j-1]=temp;
                        swap=true;

                }
            
                        
                    }
                    if(swap==false){
                        break;
                    }
                
           
            
        }
           
        
        String arrayString=Arrays.toString(arr);
        return arrayString;
    }
    public static void main(String[] args) {
        int arr1[]={5,4,3,2,1};
        System.out.println(sort(arr1));

    }
    
}
