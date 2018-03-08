import java.util.*;
import java.io.*;

public class USACO{

    public static int bronze(String filename){


        try {

            File f = new File(filename);
            Scanner in = new Scanner(f);

            r = in.next(); c = in.next(); e = in.next(); n = in.next();
            map = new int[r][c];
            for (int i = 0; i < r; i++) {
                for (int a = 0; a < c; a++) {
                    map[i][a] = in.next();
                }
            }
        }catch (FileNotFoundException e) {
            System.out.println(e);
            System.exit(1);
        }



    }


    public static int silver(String filename){

    }

    public static void main(String[] args) {
        
    }

}