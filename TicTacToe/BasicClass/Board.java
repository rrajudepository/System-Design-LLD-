package TicTacToe.BasicClass;

public class Board {
    public int size;
    public PlayingPiece board[][];

    public Board(int size){
        this.size=size;
        board = new PlayingPiece[size][size];
    }

    public boolean addPiece(int row, int col, PlayingPiece playingPiece){
        if(board[row][col]!=null){
            return false;
        }
        board[row][col]=playingPiece;
        return true;
    }

    public void printBoard(){
        System.out.println("\n");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==null){
                    System.out.print("__  ");
                } else {
                    System.out.print(board[i][j].pieceType + "   ");
                }
            }
            System.out.println();
        }
        System.out.println("\n");
    }

    public boolean checkFreeCell(){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==null){
                    return true;
                }
            }
        }
        return false;
    }
    
}
