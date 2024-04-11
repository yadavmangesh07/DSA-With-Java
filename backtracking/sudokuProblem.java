package backtracking;

public class sudokuProblem {
    public static boolean sudokuSolver(int sudoku[][],int row,int col){
        //base case
        if(row==9 && col==0){
            printSudoku(sudoku);
            return true;
        }
        else if(row==9){
            return false;//no solution exists because we got out of the sudoku
        }

        //recursion
        int nextrow=row,nextcol=col+1;
        if(col+1==9){//when first row is iterated successfully
            nextrow=row+1;
            nextcol=0;
        }
        if(sudoku[row][col]!=0){//if a digit other than zero already exists at that place
            return sudokuSolver(sudoku, nextrow, nextcol);
        }
        for (int digit = 1; digit <=9; digit++) {
            if(isSafeToPlace(sudoku,row,col,digit)){
                sudoku[row][col]=digit;
                if (sudokuSolver(sudoku, nextrow, nextcol)) {//solution exists
                    return true;//one solution 
                    
                }
                else{
                    sudoku[row][col]=0;//do not want to place the digit in the sudoku
                }
            }
            
            
            
            
        }
        return false;
    }

    private static boolean isSafeToPlace(int[][] sudoku, int row, int col, int digit) {
        //vertically downward
        for (int i = 0; i <=8; i++) {
            if(sudoku[i][col]==digit){
                return false;
            }
            
        }
        //right
        for (int i = 0; i <=8; i++) {
            if(sudoku[row][i]==digit){
                return false;
            }
            
        }
        
        //in same grid
        int startingRow=(row/3)*3;//to get grid no. in the 9x9 grid
        int startingcol=(col/3)*3;//to get grid no. in the 9x9 grid
        for (int i = startingRow; i <startingRow+3; i++) {
            for (int j = startingcol; j <startingcol+3; j++) {
                if(sudoku[i][j]==digit){
                    return false;
                }
                
            }
            
        }
        return true;

    }
    public static void printSudoku(int sudoku[][]){
        for (int i = 0; i <9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j]+"  ");
                
            }
            System.out.println();
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int sudoku[][]={
             {3, 0, 6, 5, 0, 8, 4, 0, 0},
        {5, 2, 0, 0, 0, 0, 0, 0, 0},
        {0, 8, 7, 0, 0, 0, 0, 3, 1},
        {0, 0, 3, 0, 1, 0, 0, 8, 0},
        {9, 0, 0, 8, 6, 3, 0, 0, 5},
        {0, 5, 0, 0, 9, 0, 6, 0, 0}, 
        {1, 3, 0, 0, 0, 0, 2, 5, 0},
        {0, 0, 0, 0, 0, 0, 0, 7, 4},
        {0, 0, 5, 2, 0, 6, 3, 0, 0},
        { 5, 3, 0, 0, 7, 0, 0, 0, 0 },
        
     };
       
        sudokuSolver(sudoku, 0, 0);
    }
    
    
}
