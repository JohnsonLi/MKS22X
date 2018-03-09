import java.util.*;
import java.io.*;

public class USACO{

    public static int bronze(String filename){
        int row = 0, col = 0, e = 0, n = 0;
        int[][] field = new int[row][col];
        Scanner in = null;

        try {
            File f = new File(filename);
            in = new Scanner(f);

            row = Integer.parseInt(in.next()); 
            col = Integer.parseInt(in.next());
            e = Integer.parseInt(in.next());
            n = Integer.parseInt(in.next());

            // System.out.println(row + " " + col);
            field = new int[row][col];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    field[i][j] = Integer.parseInt(in.next());
                }
            }
        }catch (FileNotFoundException error) {
            System.out.println("FILE NOT FOUND");
            System.exit(1);
        }

        for(int i = 0; i < n; i++){
            int r_s = Integer.parseInt(in.next()) - 1; 
            int c_s = Integer.parseInt(in.next()) - 1; 
            int d_s = Integer.parseInt(in.next()); 

            int tallest = 0;
            for(int j = 0; j < 3 && j + r_s < field.length; j++){
                for(int k = 0; k < 3 && k + c_s < field[0].length; k++){
                    if(field[r_s + j][c_s + k] > tallest){
                        tallest = field[r_s + j][c_s + k];
                    }
                }
            }
            int newD = tallest - d_s;
            for(int j = 0; j < 3 && j + r_s < field.length; j++){
                for(int k = 0; k < 3 && k + c_s < field[0].length; k++){
                    if(field[r_s + j][c_s + k] > newD){
                        field[r_s + j][c_s + k] = newD;
                    }
                }
            }
        }

        int totalStomped = 0;
        for(int i = 0; i < field.length; i++){
            for(int j = 0; j  < field[0].length; j++){
                if(field[i][j] < e){
                    totalStomped += e - field[i][j];
                }
            }
        }

        //System.out.println(field[0][2]);
        in.close();
        return totalStomped * 72 * 72;
    }


    // public static int silver(String filename){

    // }


    public static void main(String[] args) {
       System.out.println( USACO.bronze("makelake.in"));
    }
}