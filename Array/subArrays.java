public class subArrays {
    public static void sub(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                System.out.print("[");
                for (int j2= i; j2 <=j; j2++) {
                    System.out.print(" "+arr[j2]+" ");
                    
                }
                System.out.print("]");
            }
            System.out.println();
            
        }
    }
    public static void main(String[] args) {
        int ara[]={1,2,3,4,5,6,7};
        sub(ara);
        
    }
    
}
