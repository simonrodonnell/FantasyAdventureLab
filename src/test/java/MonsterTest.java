import game.rooms.enemies.Monster;
import game.rooms.enemies.MonsterTypes;
import org.junit.Before;
import org.junit.Test;

public class MonsterTest {

    Monster monster;

    @Before
    public void before(){
        monster = new Monster(MonsterTypes.GOBLIN);
    }

    @Test
    public void changeType(){

    }
}
