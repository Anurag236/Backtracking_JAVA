/**
 * RatMazeE  When we have given some Restrictions (daed cells)
 *             in 2D matrix and we can move all L, R, U, D ;
 */
import java.util.*;
public class RatMazeE {
    public static void print(int sr, int sc, int er, int ec, String s,int [][] maze, boolean[][] isVisited){
        if(sr<0 || sc<0) return;
        if(sr>er || sc>ec) return;
        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        if(isVisited[sr][sc] == true) return;  //phle visit kr chuke hai

        //check
        isVisited[sr][sc] = true;    //jb visit kroge

        //restriction
        if(maze[sr][sc]==0) return;   //nhi jana

        //go right
        print(sr,sc+1,er,ec,s+"R",maze,isVisited);

        //go down
        print(sr+1,sc,er,ec,s+"D",maze,isVisited);

        //go up
        print(sr-1,sc,er,ec,s+"U",maze,isVisited);

        //go left
        print(sr,sc-1,er,ec,s+"L",maze,isVisited);

        //backtrack
        isVisited[sr][sc] = false;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = 3;
        int cols = 4;
        int maze[][] = {{1,0,1,1},
                        {1,1,1,1},
                        {1,1,0,1}};
        
        boolean isVisited[][] =  new boolean[rows][cols];

        print(0,0,rows-1,cols-1,"",maze,isVisited);
    }   
};