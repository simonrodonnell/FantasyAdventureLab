import game.rooms.Room;
import game.rooms.TreasureTypes;
import game.rooms.enemies.Enemy;
import game.rooms.enemies.EnemyTypes;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;
    Enemy enemy1;
    Enemy enemy2;
    Enemy enemy3;

    @Before
    public void before(){
        TreasureTypes treasure1 = TreasureTypes.GOLD;
        TreasureTypes treasure2 = TreasureTypes.GEMS;
        TreasureTypes treasure3 = TreasureTypes.ARTIFACTS;
        enemy1 = new Enemy(EnemyTypes.GOBLIN);
        enemy2 = new Enemy(EnemyTypes.ORC);
        enemy3 = new Enemy(EnemyTypes.SKELETON);
        ArrayList<Enemy> enemies = new ArrayList<Enemy>();
        ArrayList<TreasureTypes> treasures = new ArrayList<TreasureTypes>();
        enemies.add(enemy1);
        enemies.add(enemy2);
        enemies.add(enemy3);
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
    public void canRemoveEnemy(){
        room.removeEnemy(enemy1);
        assertEquals(2, room.getEnemies().size());
    }

    @Test
    public void roomIsComplete(){
        room.removeEnemy(enemy1);
        room.removeEnemy(enemy2);
        room.removeEnemy(enemy3);
        room.takeTreasure();
        room.takeTreasure();
        room.takeTreasure();
        assertEquals(true, room.IsRoomComplete());
    }


}
