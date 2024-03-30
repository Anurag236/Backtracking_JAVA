/**
 * nQueen
 */
public class nQueen {
    public static boolean isSafe(char[][] board, int row, int col){
        int n = board.length;

        //check row -> East-West
        for(int i=0;i<n;i++){
            if(board[row][i]=='Q') return false;  //only col changing
        }

        //check col -> North-South
        for(int i=0;i<n;i++){
            if(board[i][col]=='Q') return false; //only row changing
        }

        //check North-East
        int i = row;
        int j = col;
        while(i>=0 && j<n){
            if(board[i][j]=='Q') return false;
            i--;
            j++;
        }

        //check South-East
        i = row;
        j = col;
        while(i<n && j<n){
            if(board[i][j]=='Q') return false;
            i++;
            j++;
        }

        //check South-West
        i = row;
        j = col;
        while(i<n && j>=0){
            if(board[i][j]=='Q') return false;
            i++;
            j--;
        }

        //check North-West
        i = row;
        j = col;
        while(i>=0 && j>=0){
            if(board[i][j]=='Q') return false;
            i--;
            j--;
        }
        return true;
    }

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