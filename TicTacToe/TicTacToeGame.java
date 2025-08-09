package TicTacToe;
import TicTacToe.BasicClass.*;
import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;


public class TicTacToeGame {
    Queue<Players> players;
    Board board;

    public void initializeGame(){
        players = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("This game is build for two players \n\n");
        System.out.print("tell me the name of first player: ");
        String playerfirst = sc.nextLine();
        System.out.println("Game symbol of player name " + playerfirst + " is: X \n");
        System.out.print("tell me the name of Second player: ");
        String playersecond = sc.nextLine();
        System.out.println("Game symbol of player name " + playersecond + " is: O \n");

        Players first = new Players(playerfirst, new PieceX());
        Players second = new Players(playersecond, new PieceO());
        players.add(first);
        players.add(second);

        System.out.print("Tell me the size of the board : ");
        int size = sc.nextInt();
        board = new Board(size);
        System.out.println();
        System.out.println();
        // do not close here; keep System.in open for startGame()

    }

    public void startGame(){
        Scanner sc = new Scanner(System.in);

        System.out.println("The Game is started .................................... \n");
        boolean noWinner = true;
        while(noWinner){
            Players currPlayer = players.remove();
            board.printBoard();

            if(!board.checkFreeCell()){
                noWinner = false;
                System.out.println("The game is Tie between Players");
                continue;
            }

            System.out.print("Player name: "+ currPlayer.name+ " => Enter row column: ");
            int row = sc.nextInt();
            int col = sc.nextInt();

            boolean placeAvailable = board.addPiece(row, col, currPlayer.playingPiece);
            while(!placeAvailable){
                System.out.println("This place is already filled. Try again vacant place. ");
                System.out.print("Player name : "+ currPlayer.name+ " => Enter row column ");
                row = sc.nextInt();
                col = sc.nextInt();
                placeAvailable = board.addPiece(row, col, currPlayer.playingPiece);
            }
            boolean winner = checkWinner(row, col, currPlayer.playingPiece);
            if(winner){
                System.out.println("Winner is : "+ currPlayer.name);
                break;
            }else{
                players.add(currPlayer);
            }

        }
        sc.close();
        return;
    }

    boolean checkWinner(int row, int col, PlayingPiece playingPiece){
        boolean rowMatch = true;
        boolean colMatch = true;
        boolean digMatch = true;
        boolean dig2Match = true;

        // row match
        for (int i = 0; i < board.size; i++) {
            if (board.board[row][i] == null || board.board[row][i].pieceType != playingPiece.pieceType) {
                rowMatch = false;
                break;
            }
        }

        // column match
        for (int i = 0; i < board.size; i++) {
            if (board.board[i][col] == null || board.board[i][col].pieceType != playingPiece.pieceType) {
                colMatch = false;
                break;
            }
        }

        // main diagonal
        if (row == col) {
            for (int i = 0; i < board.size; i++) {
                if (board.board[i][i] == null || board.board[i][i].pieceType != playingPiece.pieceType) {
                    digMatch = false;
                    break;
                }
            }
        } else {
            digMatch = false;
        }

        // anti-diagonal
        if (row + col == board.size - 1) {
            for (int i = 0; i < board.size; i++) {
                int j = board.size - 1 - i;
                if (board.board[i][j] == null || board.board[i][j].pieceType != playingPiece.pieceType) {
                    dig2Match = false;
                    break;
                }
            }
        } else {
            dig2Match = false;
        }

        return rowMatch || colMatch || digMatch || dig2Match;
    }
}
