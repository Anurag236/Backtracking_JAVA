/**
 * RatMazeA-> count no. of ways if he can move R and D to reach destination;
 *    sr -> starting row
 *    er -> ending row
 *    sc -> starting column
 *    ec -> end column
 *    (backtracking)
 */
import java.util.*;
public class RatMazeA {
    public static int maze(int sr, int sc, int er, int ec){
        if(sr>er || sc>ec) return 0;
        if(sr==er && sc==ec) return 1;

        int downways = maze(sr+1,sc,er,ec);
        int rightways = maze(sr,sc+1,er,ec);

        int totalways = rightways + downways;
        return totalways;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int count = maze(1,1,rows,cols);
        System.out.println(count);
    }
}