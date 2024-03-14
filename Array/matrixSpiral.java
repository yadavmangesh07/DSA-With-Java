import java.util.ArrayList;

public class matrixSpiral {
    static ArrayList<Integer> spiral(int[][] arr,int m,int n){
        ArrayList <Integer> arrlist= new ArrayList<>();
        int rowstart=0;
        int colstart=0;
        int rowend=m-1;
        int colend=n-1;
        while(rowstart<=rowend && colstart<=colend){
            for (int i = colstart; i <=colend; i++) {
                arrlist.add(arr[rowstart][i]);

                
            }
            rowstart++;
            for (int i = rowstart; i <=rowend; i++) {
                arrlist.add(arr[i][colend]);
                
            }
            colend--;
            if(rowstart<=rowend && colstart<=colend){
                for (int i = colend; i>=colstart; i--) {
                    arrlist.add(arr[rowend][i]);
                    
                }

            }
            rowend--;
            if(rowstart<=rowend && colstart<=colend){
                for (int i = rowend; i >=rowstart; i--) {
                    arrlist.add(arr[i][colstart]);
                    
                }
            }
            colstart++;
        }
        return arrlist;
    }
    public static void main(String[] args) {
        int[][] matrix={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        System.out.println(spiral(matrix,matrix.length,matrix[0].length));

    }
    
}
