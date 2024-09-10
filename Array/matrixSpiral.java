// import java.util.ArrayList;

// public class matrixSpiral {
//     static ArrayList<Integer> spiral(int[][] arr,int m,int n){
//         ArrayList <Integer> arrlist= new ArrayList<>();
//         int rowstart=0;
//         int colstart=0;
//         int rowend=m-1;
//         int colend=n-1;
//         while(rowstart<=rowend && colstart<=colend){
//             for (int i = colstart; i <=colend; i++) {
//                 arrlist.add(arr[rowstart][i]);

                
//             }
//             rowstart++;
//             for (int i = rowstart; i <=rowend; i++) {
//                 arrlist.add(arr[i][colend]);
                
//             }
//             colend--;
//             if(rowstart<=rowend && colstart<=colend){
//                 for (int i = colend; i>=colstart; i--) {
//                     arrlist.add(arr[rowend][i]);
                    
//                 }

//             }
//             rowend--;
//             if(rowstart<=rowend && colstart<=colend){
//                 for (int i = rowend; i >=rowstart; i--) {
//                     arrlist.add(arr[i][colstart]);
                    
//                 }
//             }
//             colstart++;
//         }
//         return arrlist;
//     }
//     public static void main(String[] args) {
//         int[][] matrix={
//             {1,2,3,4},
//             {5,6,7,8},
//             {9,10,11,12},
//             {13,14,15,16}
//         };
//         System.out.println(spiral(matrix,matrix.length,matrix[0].length));
        

//     }
    
// }

import java.util.ArrayList;

class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public static void sort012(ArrayList<Integer> arr) {
        // code here
        int countZero=0;
        int countOne=0;
       
        
        for(int i:arr){
            if(i==1) countOne++;
            else if(i==0) countZero++;
           
            
        }
        for(int i=0;i<arr.size();i++){
            if(i<countZero){
                arr.set(i,0);
            }
            else if( i<countOne+countZero){
                arr.set(i,1);
            }
            else{
                arr.set(i,2);
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> ls=new ArrayList<>();
        ls.add(0);
        ls.add(2);
        ls.add(1);
        ls.add(2);
        ls.add(0);
        sort012(ls);
        for (int object : ls) {
            System.out.print(object);
            
        }
    }
}