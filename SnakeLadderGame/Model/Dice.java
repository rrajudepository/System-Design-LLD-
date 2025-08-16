package SnakeLadderGame.Model;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    int diceCount;
    int first = 1;
    int last = 6;

    public Dice(int diceCount){
        this.diceCount = diceCount;
    }

    public int rollDice(){
        int totalSum = 0;
        int diceUsed = 0;
        while(diceUsed < diceCount){
            totalSum += ThreadLocalRandom.current().nextInt(first, last+1);
            diceUsed++;
        }
        return totalSum;
    }
}
