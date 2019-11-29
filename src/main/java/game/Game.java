package game;

import game.players.Player;
import game.rooms.Room;
import game.rooms.TreasureTypes;
import game.rooms.enemies.Monster;
import game.rooms.enemies.MonsterTypes;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {

    private ArrayList<Player> players;
    private ArrayList<Room> rooms;
    private int difficulty;
    private int numberOfPlayers;

    public Game(){
        this.players = new ArrayList<Player>();
        this.rooms = new ArrayList<Room>();
        this.difficulty = 1;
        this.numberOfPlayers = 1;
    }

    // GETTERS

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    // SETTERS

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    // GAME SETUP

    private void generateRooms() {
        int loopCount = 0;
        while(loopCount < difficulty)
        {
            Room room = new Room();
            rooms.add(room);
            loopCount ++;
        }
    }

    public Monster randomMonster() {
        MonsterTypes[] monsterArray = MonsterTypes.values();
        Random random = new Random();
        int index = random.nextInt(monsterArray.length);
        MonsterTypes randomMonsterType = monsterArray[index];
        return new Monster(randomMonsterType);
    }

    private TreasureTypes randomTreasure() {
        TreasureTypes[] treasureArray = TreasureTypes.values();
        Random random = new Random();
        int index = random.nextInt(treasureArray.length);
        return treasureArray[index];

    }

    public void addMonsterToRoom(Room room) {
        int loopCount = 0;
        while(loopCount < difficulty)
        {
        room.addMonster(randomMonster());
        loopCount ++;
        }
    }

    public void addTreasureToRoom(Room room) {
        int loopCount = 0;
        while(loopCount < difficulty)
        {
        room.addTreasure(randomTreasure());
            loopCount ++;
        }
    }

    public void setupGame(){
    Scanner inputScanner = new Scanner(System.in);

        System.out.println("Number of players?");
        String inputNumberOfPlayers = inputScanner.next();
        System.out.println("You have entered "+ inputNumberOfPlayers +" players.");
        System.out.println("Difficulty lever?");
        String inputDifficulty = inputScanner.next();
        System.out.println("Difficulty set to "+ inputDifficulty +".");

        this.difficulty = Integer.parseInt(inputDifficulty);
        this.numberOfPlayers = Integer.parseInt(inputNumberOfPlayers);
        generateRooms();
    }

}
