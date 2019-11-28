package game.behaviours;

import java.util.Random;

public class Dice {

    private int numberOfSides;

    public Dice(){
        this.numberOfSides = 20;
    }

    public int rollDice(){
        Random dice = new Random();
        int randomInt = dice.nextInt(numberOfSides) + 1;
//        System.out.println(randomInt);
        return randomInt;
    }

}
