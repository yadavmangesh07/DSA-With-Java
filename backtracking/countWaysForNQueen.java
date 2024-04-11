package backtracking;

public class countWaysForNQueen {
    public static int nQueenFunc(int n){
        char board[][]=new char[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j]='*';
            }
            
        }
       
        
        nQueen(board,0);
        return count;

    }
    static int count=0;
    public static void nQueen(char board[][],int row){
        if(row==board.length){
            count++;
            
            return ;
        }
       
        for (int i = 0; i < board.length; i++) {
            if(isSafePlace(board,row,i)){
                board[row][i]='Q';
                nQueen(board, row+1);
                board[row][i]='*';
                
            }
            
        }
        
    }
    private static boolean isSafePlace(char[][] chessBoard, int row, int col) {
        for (int i = row - 1; i >= 0; i--) {
            if (chessBoard[i][col] == 'Q') {
                return false;
            }

        }
        // left diaonally where row and col both decreases by 1
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (chessBoard[i][j] == 'Q') {
                return false;
            }

        }
        // right diagonally where row decreases by 1 but col increases by 1
        for (int i = row - 1, j = col + 1; i >= 0 && j < chessBoard.length; i--, j++) {
            if (chessBoard[i][j] == 'Q') {
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        int s=5;
        System.out.println("Total Number Of Ways to Place "+s+" Queens in "+s+" rows are :"+nQueenFunc(s));
    }
}
