package SnakeLadderGame.Products;
import java.util.concurrent.ThreadLocalRandom;

import SnakeLadderGame.Model.*;
public class Board {
    Cell cells[][];

    Board(int boardSize, int snakes, int ladders){
         initializeBoard(boardSize);
         initiateSnakeLadders(cells, snakes, ladders);
    }

    private void initializeBoard(int boardSize){
        cells = new Cell[boardSize][boardSize];

        for(int i=0;i<boardSize;i++){
            for(int j=0; j<boardSize;j++){
                Cell cellObj = new Cell();
                cells[i][j] = cellObj;
            }
        }
        return;

    }

    private void initiateSnakeLadders(Cell cells[][], int snakes, int ladders){
        while(snakes>0){
            int head = ThreadLocalRandom.current().nextInt(1, cells.length*cells.length-1);
            int tail = ThreadLocalRandom.current().nextInt(1, cells.length*cells.length-1);
            if(head>tail){
                Jump snakeObj = new Jump();
                snakeObj.start = head;
                snakeObj.end = tail;
                Cell cell = getCell(head);
                cell.jump = snakeObj;
                snakes--;
            }
        }


        while(ladders>0){
            int bottom = ThreadLocalRandom.current().nextInt(1, cells.length*cells.length-1);
            int top = ThreadLocalRandom.current().nextInt(1, cells.length*cells.length-1);
            if(top>bottom){
                Jump ladderObj = new Jump();
                ladderObj.start = bottom;
                ladderObj.end = top;
                Cell cell = getCell(bottom);
                cell.jump = ladderObj;
                ladders--;
            }
        }
        return;
    }
    Cell getCell(int playerPosition) {
        int boardRow = playerPosition / cells.length;
        int boardColumn = (playerPosition % cells.length);
        return cells[boardRow][boardColumn];
    }
}
