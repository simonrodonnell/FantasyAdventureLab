package game.rooms;

import game.rooms.enemies.Enemy;

import java.util.ArrayList;

public class Room {

    private ArrayList<Enemy> enemies;
    private ArrayList<TreasureTypes> treasure;

    public Room(ArrayList<Enemy> enemies, ArrayList<TreasureTypes> treasure){
        this.enemies = enemies;
        this.treasure = treasure;
    }

    public ArrayList<Enemy> getEnemies() {
        return enemies;
    }

    public ArrayList<TreasureTypes> getTreasure() {
        return treasure;
    }

    public TreasureTypes takeTreasure(){
        TreasureTypes foundTreasure = treasure.get(0);
        treasure.remove(0);
        return foundTreasure;
    }

    public void removeEnemy(Enemy enemy){
        int index = enemies.indexOf(enemy);
        enemies.remove(index);

    }

    public boolean IsRoomComplete() {
        return (enemies.isEmpty() && treasure.isEmpty());
    }
}
