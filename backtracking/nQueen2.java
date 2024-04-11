package backtracking;
//to 
public class nQueen2
{
    public static void main(String[] args) {
        int n = 4;
        char chessBoard[][] = new char[n][n];
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard.length; j++) {
                chessBoard[i][j] = '*';
            }
        }
        if(nQueenFunc(chessBoard, 0)){
            System.out.println("One Possible Solution :");
            printBoard(chessBoard);
        }
        else{
            System.out.println("No Possible Solution");
        }

    }

    public static boolean nQueenFunc(char chessBoard[][], int row) {
        // base case
        if (chessBoard.length == row) {
            // printBoard(chessBoard);
            return true;
        }
        // recursion
        for (int i = 0; i < chessBoard.length; i++) {
            if (isSafeToPlace(chessBoard, row, i)) {
                chessBoard[row][i] = 'Q';
                if(nQueenFunc(chessBoard, row + 1)){
                    return true;
                    
                }
                chessBoard[row][i] = '*';// work to perform in backtracking steps
        }
    }
    return false;
}

    public static boolean isSafeToPlace(char chessBoard[][], int row, int col) {
        // vertically up where col remains same but row decreases by 1
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

    public static void printBoard(char chessBoard[][]) {
        System.out.println("<---------chessboard----------->");
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard.length; j++) {
                System.out.print(chessBoard[i][j] + " ");

            }
            System.out.println();
        }
    }
    
}
