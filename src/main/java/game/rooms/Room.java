package game.rooms;

import game.rooms.enemies.Enemy;

import java.util.ArrayList;

public class Room {

    private ArrayList<Enemy> enemies;
    private ArrayList<TreasureTypes> treasure;
    private Boolean roomIsComplete;

    public Room(ArrayList<Enemy> enemies, ArrayList<TreasureTypes> treasure){
        this.enemies = enemies;
        this.treasure = treasure;
        this.roomIsComplete = false;
    }

    public ArrayList<Enemy> getEnemies() {
        return enemies;
    }

    public ArrayList<TreasureTypes> getTreasure() {
        return treasure;
    }

    public Boolean getRoomIsComplete() {
        return roomIsComplete;
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
}
