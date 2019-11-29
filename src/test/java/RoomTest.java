import game.rooms.Room;
import game.rooms.TreasureTypes;
import game.rooms.enemies.Monster;
import game.rooms.enemies.MonsterTypes;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;
    Monster monster1;
    Monster monster2;
    Monster monster3;

    @Before
    public void before(){
        TreasureTypes treasure1 = TreasureTypes.GOLD;
        TreasureTypes treasure2 = TreasureTypes.GEMS;
        TreasureTypes treasure3 = TreasureTypes.ARTIFACTS;
        monster1 = new Monster(MonsterTypes.GOBLIN);
        monster2 = new Monster(MonsterTypes.ORC);
        monster3 = new Monster(MonsterTypes.SKELETON);
        ArrayList<Monster> enemies = new ArrayList<Monster>();
        ArrayList<TreasureTypes> treasures = new ArrayList<TreasureTypes>();
        enemies.add(monster1);
        enemies.add(monster2);
        enemies.add(monster3);
        treasures.add(treasure1);
        treasures.add(treasure2);
        treasures.add(treasure3);

        this.room = new Room(enemies, treasures);
    }

    @Test
    public void canTakeTreasure(){
        TreasureTypes foundTreasure = room.takeTreasure();
        assertEquals(TreasureTypes.GOLD, foundTreasure);
    }

    @Test
    public void hasEnemies() {
        assertEquals(3, room.getMonsters().size());
    }

    @Test
    public void hasTreasure(){
        assertEquals(3, room.getTreasure().size());
    }

    @Test
    public void canRemoveEnemy(){
        room.removeEnemy(monster1);
        assertEquals(2, room.getMonsters().size());
    }

    @Test
    public void roomIsComplete(){
        room.removeEnemy(monster1);
        room.removeEnemy(monster2);
        room.removeEnemy(monster3);
        room.takeTreasure();
        room.takeTreasure();
        room.takeTreasure();
        assertEquals(true, room.IsRoomComplete());
    }


}
