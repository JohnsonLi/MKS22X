public class QueenBoard{

    private int[][] board;
    
    public QueenBoard(int size){
        board = new int[size][size];
    }
    
    private boolean addQueen(int r, int c){
        if (board[r][c] == 0){     
            board[r][c] = -1;  
            updateThreatened(r, c, 1); 
            return true;
        }
        return false;
    }

    private boolean removeQueen(int r, int c){
        if (board[r][c] == -1){     
            board[r][c] = 0;
            updateThreatened(r, c, -1);  
            return true;
        }
        return false;
    }

    public void updateThreatened(int r, int c, int inc){
        for (int i = c + 1; i < board.length; i++){
            board[r][i] += inc;
        }
        for (int i = 1; r + i < board.length && c + i < board.length; i++){
            board[r + i][c + i] += inc;
        }
        for (int i = 1;   c + i < board.length && r - i >= 0  ; i++){
            board[r - i][c + i] += inc;
        }
    }

    public String toString(){
        String strBoard = "";
        for (int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                if (board[i][j] < 0){
                    strBoard += "Q ";
                /*} else if (board[i][j] > 0){
                    strBoard += "x ";*/
                } else if (board[i][j] >= 0){
                    strBoard += "_ ";
                }
            }
            strBoard += "\n";
        }
        return strBoard;
    }

    public void checkException(){
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board.length; j++){
                if (board[i][j] != 0){
                    throw new IllegalStateException();
                }
            }
        }
    }

    public boolean solve(){
        checkException();
        return solveHelper(0);
   }

   public boolean solveHelper(int c){
       if (c >= board.length){
           return true; 
       }
       for (int i = 0; i < board.length; i++){
           if (addQueen(i, c)){
               if(solveHelper(c + 1)){
                   return true;
               }
               removeQueen(i, c);
           }
       }
       return false;
   }

    public static void main(String[] args){
        QueenBoard board = new QueenBoard(8);
        //board.addQueen(0, 0);
        //board.addQueen(1, 4);
        //board.addQueen(7,3);
        //board.addQueen(7,3);
        //board.addQueen(6, 4);
        if (board.solve()){
            System.out.println("hi");
        }
        System.out.println(board);
    }
    
}
