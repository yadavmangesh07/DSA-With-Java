// import java.util.Arrays;

public class transposeMatrix {
    public static void transpose(int ar[][]){
        
        int transpose_m [][]=new int[ar[0].length][ar.length];
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[0].length; j++) {
                transpose_m[j][i]=ar[i][j];
                
            }
            
           
           
            
        }
        for (int i = 0; i < transpose_m.length; i++) {
            for (int j = 0; j < transpose_m[0].length; j++) {
                System.out.print(transpose_m[i][j]+" ");
            }
            System.out.println();
            
        }
        
       
    }
    public static void main(String[] args) {
        int arr[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
            
        };
        transpose(arr);
    }
    
}
