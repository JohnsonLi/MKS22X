import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Maze {
    private char[][] maze;
    private boolean animate;
    String mazeString = ""; 

    public Maze(String filename){
        int row=0, col=0; 
        String mazeString = ""; 

        try{
            File text = new File(filename);
            Scanner inf = new Scanner(text);

            if(inf.hasNextLine()){
                row = inf.nextLine().length();
            }
    
            while(inf.hasNextLine()){
                mazeString += inf.nextLine();
                col++;
            } 

            inf.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();;
        }

        maze = new char[row][col];

        int strCount = 0;
        for(int i = 0; i < maze.length; i++){
            for(int j = 0; j < maze[0].length; j++){
                maze[i][j] = mazeString.charAt(strCount);
                strCount++;
            }
        }

        
    }

    public String toString(){
        int strCount = 0;
        String str = "";
        for(int i = 0; i < maze.length; i++){
            for(int j= 0;j < maze[0].length; j++){
                str += maze[i][j];
                if(strCount % maze[0].length == 0){
                    str+= "\n";
                }
                strCount++;
            }   
        }
        return str;
    }




    public static void main(String args[]){
      Maze maze = new Maze("Maze1.txt");
      System.out.println(maze);
    }   
}