/**
 * nQueen
 */
public class nQueen {
    public static void nQueen(char [][] board, int row){
        int n = board.length;
        if(row==n){ //base case
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            return;
        }

        for(int col=0; col<n; col++){
            if(isSafe(board,row,col)){
                board[row][col] = 'Q';
                nQueen(board, row+1);
                board[row][col] = 'X';  //backtracking
            }
        }
    }

    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = 'X';
            }
        }

        nQueen(board,0);
    }
}