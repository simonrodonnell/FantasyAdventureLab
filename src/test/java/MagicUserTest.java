import game.players.characterclasses.types.SpellType;
import game.players.characterclasses.MagicUser;
import game.players.characterclasses.types.Creature;
import game.players.characterclasses.types.MagicUserType;
import game.rooms.enemies.Monster;
import game.rooms.enemies.MonsterTypes;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MagicUserTest {

    MagicUser magicUser;
    Monster monster;

    @Before
    public void before(){
        magicUser = new MagicUser(MagicUserType.WARLOCK, SpellType.FIREBALL, Creature.YOSHI);
        monster = new Monster(MonsterTypes.GOBLIN);
    }

    // N.B. GOBLIN HAS 3 HP
    // N.B. FIREBALL DOES 15 DAMAGE

    @Test
    public void canAttack(){
        String result = magicUser.attack(monster);
        assertEquals("You killed the Goblin!", result);
        assertEquals(-12, monster.getHitPoints() );
    }

}
