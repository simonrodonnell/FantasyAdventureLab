import game.Game;
import game.behaviours.Dice;
import org.junit.Before;
import org.junit.Test;

public class DiceTest {

    Dice dice;

    @Before
    public void before(){
        this.dice = new Dice();
    }

    @Test
    public void canGenerateRandomNumber(){
        dice.rollDice();
    }

}
