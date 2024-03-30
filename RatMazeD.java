import java.util.Scanner;

/**
 * RatMazeD -> When we have given some Restrictions (daed cells)
 *             in 2D matrix  and  we are permited only R and D direction.
 */
import java.util.*;
public class RatMazeD {
    public static void print(int sr, int sc, int er, int ec, String s,int [][] maze){
        if(sr>er || sc>ec) return;
        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }

        if(maze[sr][sc]==0) return;   //nhi jana
        //go right
        print(sr,sc+1,er,ec,s+"R",maze);

        //go down
        print(sr+1,sc,er,ec,s+"D",maze);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = 4;
        int cols = 6;
        int maze[][] = {{1,0,1,1,1,1},
                        {1,1,1,1,0,1},
                        {0,1,1,1,1,1},
                        {0,0,1,0,1,1}};

        print(0,0,rows-1,cols-1,"",maze);
    }   
};