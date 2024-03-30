import java.util.Scanner;

/**
 * RatMazeB -> print the POSITION like RRDD, DDRR etc when we can 
 *             move all 4 direction L,R,U,D
 */

public class RatMazeC{
    public static void print(int sr, int sc, int er, int ec, String s, boolean[][] isVisited){
        if(sr>er || sc>ec) return;
        if(sc<0 || sr<0) return;
        if(isVisited[sr][sc]==true) return;    //phle aa chuke ko ->niklo
        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }

        isVisited[sr][sc] = true;    //maine visit krlia hai
        //go right
        print(sr,sc+1,er,ec,s+"R",isVisited);

        //go down
        print(sr+1,sc,er,ec,s+"D",isVisited);

        //go up
        print(sr-1,sc,er,ec,s+"U",isVisited);

        //go left
        print(sr,sc-1,er,ec,s+"L",isVisited);

        //backtrack
        isVisited[sr][sc] = false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        boolean isVisited[][] =  new boolean[rows][cols];
        print(0,0,rows-1,cols-1,"",isVisited);
    }
}
