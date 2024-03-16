import java.util.ArrayList;

public class spiralMatrixDSA {
    public static ArrayList<Integer> spiral(int arr[][]){
        ArrayList<Integer> list= new ArrayList<>();
        int m=arr.length;
        int n=arr[0].length;
        int rowstart=0;
        int colstart=0;
        int rowend=m-1;
        int colend=n-1;
        while(rowstart<=rowend && colstart<=colend){
            for (int i = colstart; i <=colend; i++) {
                list.add(arr[rowstart][i]);
                
            }
            rowstart++;
            if (rowstart<=rowend && colstart<=colend) {
                for (int i = rowstart; i <=rowend; i++) {
                list.add(arr[i][colend]);
                
            }
            }
            colend--;
            if (rowstart<=rowend && colstart<=colend) {
                for (int i = colend; i>=colstart; i--) {
                list.add(arr[rowend][i]);
                
            }
            }
            rowend--;
            if (rowstart<=rowend && colstart<=colend) {
                for (int j = rowend; j>=rowstart; j--) {
                    list.add(arr[j][colstart]);
                
            }

            }
            colstart++;
        }
        return list;

    }
    public static void main(String[] args) {
        int arr1[][]={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        System.out.println(spiral(arr1));
        
    }
    
}
