import game.players.characterclasses.types.SpellType;
import game.players.characterclasses.MagicUser;
import game.players.characterclasses.types.Creature;
import game.players.characterclasses.types.MagicUserType;
import game.rooms.enemies.Enemy;
import game.rooms.enemies.EnemyTypes;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MagicUserTest {

    MagicUser magicUser;
    Enemy enemy;

    @Before
    public void before(){
        magicUser = new MagicUser(MagicUserType.WARLOCK, SpellType.FIREBALL, Creature.YOSHI);
        enemy = new Enemy(EnemyTypes.GOBLIN);
    }

    @Test
    public void canAttack(){
        String result = magicUser.attack(enemy);
        assertEquals("You killed the enemy!", result);
        assertEquals(-15, enemy.getHitPoints() );
    }

}
