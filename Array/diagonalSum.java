public class diagonalSum {
    public static void sum(int arr[][]){
        int sum=0;
        int s_sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                    if(i==j){
                        sum+=arr[i][j];
                    }
                    else if(i+j==arr.length-1){
                        
                    s_sum+=arr[i][j];
                   
                }
                    
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                
                
            }
            
        }



        System.out.println("Primary diagonal sum :"+sum);
         System.out.println("Seconadary diagonal sum :"+s_sum);

        
    }
    public static void main(String[] args) {
        int arr[][]={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        sum(arr);
    }
    
}
