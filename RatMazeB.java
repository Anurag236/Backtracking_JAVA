import java.util.Scanner;

/**
 * RatMazeB -> print the POSITION like RRDD, DDRR etc
 */

public class RatMazeB{
    public static void print(int sr, int sc, int er, int ec, String s){
        if(sr>er || sc>ec) return;
        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }

        //go right
        print(sr,sc+1,er,ec,s+"R");

        //go down
        print(sr+1,sc,er,ec,s+"D");


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        print(1,1,rows,cols,"");
    }
}
