package model;
import java.util.Random;

public class Dice {
    private int numberOfDice;
    Random random;

    public Dice(int numberOfDice){
        random = new Random();
        this.numberOfDice = numberOfDice;
    }
    public  int getDiceOutput(){
        return random.nextInt(this.numberOfDice*6)+1;
    }
}
