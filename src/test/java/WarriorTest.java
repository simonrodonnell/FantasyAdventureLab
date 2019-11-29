import game.players.characterclasses.Warrior;
import game.players.characterclasses.types.WarriorTypes;
import game.players.characterclasses.types.WeaponTypes;
import game.rooms.enemies.Monster;
import game.rooms.enemies.MonsterTypes;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarriorTest {

    Warrior warrior;
    Monster monster;

    @Before
    public void before(){
        warrior = new Warrior(WarriorTypes.KNIGHT, WeaponTypes.BOW);
        monster = new Monster(MonsterTypes.GOBLIN);
    }

    @Test
    public void canAttack(){
        String result = warrior.attack(monster);
        assertEquals("You hit the enemy!", result);
        assertEquals(3, monster.getHitPoints());

    }
}
