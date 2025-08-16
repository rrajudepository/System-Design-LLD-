package SnakeLadderGame.Products;

import java.util.Deque;
import java.util.LinkedList;
import SnakeLadderGame.Model.*;

public class Game {
    Board board;
    Dice dice;
    Deque<Players> playerList = new LinkedList<>();
    Players winner;

    public Game(){
        initilizeGame();
    }

    private void initilizeGame(){
        board = new Board(10, 5, 4);
        dice = new Dice(1);
        winner = null;
        addPlayers();
    }

    private void addPlayers(){
        Players player1 = new Players("p1", 0);
        Players player2 = new Players("p2", 0);
        playerList.add(player1);
        playerList.add(player2);
    }
    public void startGame(){
        while(winner == null){
            Players playerTurn = findPlayerTurn();
            System.out.println("Player turn is: " + playerTurn.id + "Current position is: "+ playerTurn.currPosition);

            int diceNumbers = dice.rollDice();

            int playerNewPosition = playerTurn.currPosition + diceNumbers;
            playerNewPosition = jumpCheck(playerNewPosition);
            playerTurn.currPosition = playerNewPosition;

            System.out.println("player turn is: " + playerTurn.id + " new Position is: " + playerNewPosition);
             
            if(playerNewPosition >= board.cells.length * board.cells.length-1){
                winner = playerTurn;
            }

        }
        
        System.out.println("WINNER IS:" + winner.id);
    }

    private Players findPlayerTurn() {

        Players playerTurns = playerList.removeFirst();
        playerList.addLast(playerTurns);
        return playerTurns;
    }

    private int jumpCheck(int playerNewPosition) {
        if (playerNewPosition >= board.cells.length * board.cells.length) {
            return playerNewPosition;
        }
        
        Cell cell = board.getCell(playerNewPosition);
        if (cell.jump != null) {
            if (cell.jump.start < cell.jump.end) {
                System.out.println("Ladder found! Moving from " + cell.jump.start + " to " + cell.jump.end);
            } else {
                System.out.println("Snake found! Moving from " + cell.jump.start + " to " + cell.jump.end);
            }
            return cell.jump.end;
        }
        return playerNewPosition;
    }
}
