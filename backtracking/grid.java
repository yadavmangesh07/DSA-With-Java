package backtracking;

public class grid {
    public static int gridWays(int n,int m,int i,int j){
        //base case1
        if(i==n-1 && j==m-1){//on the target
            return 1;
        }
        else if (i==n || j==m) {//out of the grid
            return 0;
            
        }
        int rightways=gridWays(n, m, i, j+1);
        int downways=gridWays(n, m, i+1, j);
        return rightways+downways;
        }
        
    
    public static void main(String[] args) {
        int row=3;
        int col=3;
        System.out.println(gridWays(row, col, 0, 0));
    }
    
}
