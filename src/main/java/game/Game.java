package game;

import game.players.Player;
import game.rooms.Room;
import game.rooms.enemies.Monster;
import game.rooms.enemies.MonsterTypes;

import java.util.ArrayList;
import java.util.Random;

public class Game {

    private ArrayList<Player> players;
    private ArrayList<Room> rooms;
    private int difficulty;

    public Game(){
        this.players = new ArrayList<Player>();
        this.rooms = new ArrayList<Room>();
        this.difficulty = 1;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public Monster randomMonster() {
        MonsterTypes[] monsterArray = MonsterTypes.values();
        Random dice = new Random();
        int index = dice.nextInt(monsterArray.length) + 1;
        MonsterTypes randomMonsterType = monsterArray[index];
        return new Monster(randomMonsterType);
    }

    public void addMonsterToRoom(Room room) {
        room.addMonster(randomMonster());
    }
}
