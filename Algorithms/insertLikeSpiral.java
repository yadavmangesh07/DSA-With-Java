public class insertLikeSpiral {
    
        public int[][] generateMatrix(int k) {
            int [][] arr=new int[k][k];
            int m=arr.length;
            int n=arr[0].length;
            int rowstart=0;
            int colstart=0;
            int rowend=m-1;
            int colend=n-1;
            int a=1;
            while(rowstart<=rowend && colstart<=colend){
                for (int i = colstart; i <=colend; i++) {
                    arr[rowstart][i]=a;
                    a++;
    
                    
                }
                rowstart++;
                for (int i = rowstart; i <=rowend; i++) {
                    arr[i][colend]=a;
                    a++;
                    
                }
                colend--;
                if(rowstart<=rowend && colstart<=colend){
                    for (int i = colend; i>=colstart; i--) {
                        arr[rowend][i]=a;
                        a++;
                        
                    }
    
                }
                rowend--;
                if(rowstart<=rowend && colstart<=colend){
                    for (int i = rowend; i >=rowstart; i--) {
                        arr[i][colstart]=a;
                        a++;
                        
                    }
                }
                colstart++;
            }
            return arr;
            
            
        }
    }

