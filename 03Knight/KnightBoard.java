public class KnightBoard{
    private int[][] board;
    private int rows;
    private int cols;

    public KnightBoard(int startingRows, int startingCols){ 
        checkException();
        board = new int[startingRows][startingCols];
        rows = startingRows;
        cols = startingCols;
    }

    public String toString(){
        String strBoard = "";
        for (int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                if (board[i][j] == 0){
                    strBoard += "_ ";                
                }                
                else if (board[i][j] < 10){
                    strBoard += " " + board[i][j] + " ";
                } else {
                    strBoard += board[i][j] + " ";
                } 
            }
            strBoard += "\n";
        }
        return strBoard;
    }

    public void checkException(){
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board.length; j++){
                if (board[i][j] != 0 || startingRows < 0 || startingCols < 0){
                    throw new IllegalStateException();
                }
            }
        }
    }

    

    public boolean solve(int row, int col){
        checkException();
        return solveH(row, col, 1);
    }

    public boolean solveH(int row, int col, int level){
        if (level == rows * cols){
            return true;
        }
        
        

    }


    public static void main(String[] args){
        KnightBoard board = new KnightBoard(7, 7);
        System.out.println(board);    
    }    

}






/*
,d88b.d88b,
88888888888
`Y8888888Y'
  `Y888Y'
    `Y'
*/





