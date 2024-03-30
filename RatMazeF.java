/**
 * RatMazeF -> Optimized Version of RatMazeE
 *             Here we dont use extra 2D Matrix
 *     1 ko -1 kr denge
 *    -1 -> means visited
 *     1 -> means unvisited
*/ 

import java.util.*;
public class RatMazeF {
    public static void print(int sr, int sc, int er, int ec, String s,int [][] maze){
        if(sr<0 || sc<0) return;
        if(sr>er || sc>ec) return;
        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        if(maze[sr][sc] == -1) return;  //phle visit kr chuke hai // -1 means visited
        //restriction
        if(maze[sr][sc]==0) return;   //nhi jana

        //check
        maze[sr][sc] = -1;    //jb visit kroge  //  1 ko -1 krdia

        
        //go right
        print(sr,sc+1,er,ec,s+"R",maze);

        //go down
        print(sr+1,sc,er,ec,s+"D",maze);

        //go up
        print(sr-1,sc,er,ec,s+"U",maze);

        //go left
        print(sr,sc-1,er,ec,s+"L",maze);

        //backtrack
        maze[sr][sc] = 1;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = 3;
        int cols = 4;
        int maze[][] = {{1,0,1,1},
                        {1,1,1,1},
                        {1,1,0,1}};

        print(0,0,rows-1,cols-1,"",maze);
    }   
};
