import game.players.characterclasses.Warrior;
import game.players.characterclasses.types.WarriorTypes;
import game.players.characterclasses.types.WeaponTypes;
import game.rooms.enemies.Enemy;
import game.rooms.enemies.EnemyTypes;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarriorTest {

    Warrior warrior;
    Enemy enemy;

    @Before
    public void before(){
        warrior = new Warrior(WarriorTypes.KNIGHT, WeaponTypes.BOW);
        enemy = new Enemy(EnemyTypes.GOBLIN);
    }

    @Test
    public void canAttack(){
        String result = warrior.attack(enemy);
        assertEquals("You hit the enemy!", result);
        assertEquals(3, enemy.getHitPoints());

    }
}
