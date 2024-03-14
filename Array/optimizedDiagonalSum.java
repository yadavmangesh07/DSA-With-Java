public class optimizedDiagonalSum {
    public static void sum(int arr[][]){
        int p_sum=0;
        int s_sum=0;
        for (int i = 0; i < arr.length; i++) {
            p_sum+=arr[i][i];
            s_sum+=arr[arr.length-1-i][i];

            
        }
        System.out.println("Primary diagonal sum :"+p_sum);
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
