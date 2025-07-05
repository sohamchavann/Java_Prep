//Print only one solution of n-queens
package BackTracking;

public class nQueensEasy {
    public static boolean nQueens(char board[][], int row){
        //base case
        if(row==board.length){
            //printBoard(board);
            //count++; //to count no of solutions
            return true;
        }
        //column loop
        for(int j = 0; j<board.length;j++){
            if(isSafe(board, row, j)) {
                board[row][j] = 'Q';// to place the queen on baord
                if(nQueens(board, row + 1)){
                    return true;
                }// func call
                board[row][j] = 'X';//backtracking step of deletion
            }
        }
        return false;
    }
    public static boolean isSafe(char board[][], int row, int col){//to check whether it is safe to place the queen
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
        System.out.println("------ChessBaord---------");
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
        if(nQueens(board , 0)){
            System.out.println("Solution is possible");
            printBoard(board);
        }
        else System.out.println("Cannot Solve");
    }
}

