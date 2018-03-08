import java.util.*;
import java.io.*;

public class USACO{

    public static int bronze(String filename){
        int row = 0, col = 0, e,n;
        int[][] map = new int[row][col];
        
        try {
            File f = new File(filename);
            Scanner in = new Scanner(f);

            row = Integer.parseInt(in.next()); 
            col = Integer.parseInt(in.next());
            e = Integer.parseInt(in.next());
            n = Integer.parseInt(in.next());

            // System.out.println(row + " " + col);
            map = new int[row][col];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    map[i][j] = Integer.parseInt(in.next());
                }
            }
        }catch (FileNotFoundException error) {
            System.out.println(error);
            System.exit(1);
        }

        // for(int i = 0; i < e; i++){

        // }


        System.out.println(map[0][1]);
        return 0;
    }


    // public static int silver(String filename){

    // }


    public static void main(String[] args) {
        USACO.bronze("makelake.in");
    }

}