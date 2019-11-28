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

}
