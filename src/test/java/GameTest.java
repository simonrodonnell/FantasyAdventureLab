import game.Game;
import game.players.Player;
import game.players.characterclasses.CharacterClass;
import game.players.characterclasses.Warrior;
import game.players.characterclasses.types.WarriorTypes;
import game.players.characterclasses.types.WeaponTypes;
import game.rooms.Room;
import game.rooms.TreasureTypes;
import game.rooms.enemies.Monster;
import game.rooms.enemies.MonsterTypes;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Game game;
    Room room;
    Player player;

    @Before
    public void before(){

        game = new Game();

        ArrayList<Monster> monsters = new ArrayList<Monster>();
        ArrayList<TreasureTypes> treasures = new ArrayList<TreasureTypes>();

        TreasureTypes treasure1 = TreasureTypes.GOLD;
        TreasureTypes treasure2 = TreasureTypes.GEMS;
        TreasureTypes treasure3 = TreasureTypes.ARTIFACTS;

        Monster monster1 = new Monster(MonsterTypes.GOBLIN);
        Monster monster2 = new Monster(MonsterTypes.ORC);
        Monster monster3 = new Monster(MonsterTypes.SKELETON);

        monsters.add(monster1);
        monsters.add(monster2);
        monsters.add(monster3);
        treasures.add(treasure1);
        treasures.add(treasure2);
        treasures.add(treasure3);

        room = new Room(monsters, treasures);

        CharacterClass characterClass = new Warrior(WarriorTypes.KNIGHT, WeaponTypes.BOW);
        player = new Player("Eric", characterClass);

    }

    @Test
    public void addMonsters() {
        game.addMonsterToRoom(room);
        assertEquals(4, room.getMonsters().size());
    }
}
