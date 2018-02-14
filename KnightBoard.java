public class KnightBoard{
    private int[][] board;


    public KnightBoard(int startingRows, int startingCols){
        board = new int[startingRows][startingCols];
    }

    public String toString(){
        String strBoard = "";
        for (int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                if (board[i][j] == 0){
                    strBoard += "_ ";                
                }                
                if (board[i][j] < 10){
                    strBoard += " " + board[i][j] + " ";
                } else {
                    strBoard += board[i][j] + " ";
                } 
            }
            strBoard += "\n";
        }
        return strBoard;
    }


    public static void main(String[] args){
        KnightBoard board = new KnightBoard(10, 10);
        System.out.println(board);    
    }    

}
