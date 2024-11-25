package SnakeIMPL;

import java.util.Random;

public class NormalDice implements DiceStrategy{
    private Random random;

    public NormalDice(){
        this.random = new Random();
    }

    @Override
    public int rollDice() {
        return random.nextInt(6)+1;
    }
}

