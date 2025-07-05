//Place N Queens on N*N Chessboard such that no 2 queens can attack each other
//Count total number of ways in which we can solve this problem
//Print only one solution of n-queens
package BackTracking;

public class nQueens {
    public static void nQueens1(char board[][], int row){
         //base case
        if(row==board.length){
            printBoard(board);
            count++; //to count no of solutions
            return;
        }
        //column loop
        for(int j = 0; j<board.length;j++){
            if(isSafe(board, row, j)) {
                board[row][j] = 'Q';// to place the queen on board
                nQueens1(board, row + 1);// func call
                board[row][j] = 'X';//backtracking step of deletion
                }
            }
    }
    public static boolean isSafe(char board[][], int row, int col){//to check whether it is safe to place the queen on the baord
        //straight up check
        for(int i = row-1;i>=0;i--){
            if (board[i][col]=='Q'){
                return false;
            }
        }
        //diagonal left check
        for(int i = row-1, j=col-1;i>=0&&j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //diagonal right check
        for (int i= row-1, j=col+1;i>=0&&j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static int count;
    public static void printBoard(char board[][]){
        System.out.println("------ChessBoard---------");
        for(int i =0;i<board.length;i++){
            for(int j = 0; j<board[0].length;j++){
                System.out.print(board[i][j] + " " );
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        for(int i = 0; i<n; i++){
            for(int j = 0;j<n;j++){
                board[i][j] = 'X';
            }
        }
        nQueens1(board , 0);
        System.out.println("total ways to solve n queens " +count);
    }
}

