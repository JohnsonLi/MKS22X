public class QueenBoard{

    private int[][] board;
    
    public QueenBoard(int size){
        board = new int[size][size];
    }
    
    private boolean addQueen(int r, int c){
        if (board[r][c] == 0){         
            board[r][c] = -1;
            for (int i = c + 1; i < board.length; i++){
                board[r][i] += 1;
            }
            for (int i = r + 1; i < board.length; i++){
                r += 1; 
                c += 1;            
                board[r][c] += 1;
            }    
            return true;
        }
        return false;
    }

    

    public String toString(){
        String strBoard = "";
        for (int i = 0; i < board.length; i++){
            for(int ii = 0; ii < board.length; ii++){
                if (board[i][ii] == -1){
                    strBoard += "Q ";
                } else if (board[i][ii] > 0){
                    strBoard += "x ";
                } else {
                    strBoard += "_ ";
                }
            }
            strBoard += "\n";
        }
        return strBoard;
    }

    public static void main(String[] args){
        QueenBoard board = new QueenBoard(8);
        board.addQueen(0,0);
        board.addQueen(0,1);
        board.addQueen(4,4);
        System.out.println(board);
    }
    
}
