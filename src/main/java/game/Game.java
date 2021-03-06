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

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    // GAME SETUP

    public Monster randomMonster() {
        MonsterTypes[] monsterArray = MonsterTypes.values();
        Random random = new Random();
        int index = random.nextInt(monsterArray.length);
        MonsterTypes randomMonsterType = monsterArray[index];
        return new Monster(randomMonsterType);
    }

    public TreasureTypes randomTreasure() {
        TreasureTypes[] treasureArray = TreasureTypes.values();
        Random random = new Random();
        int index = random.nextInt(treasureArray.length);
        return treasureArray[index];

    }

    public void addMonsterToRoom(Room room) {
        int loopCount = 0;
        int combinedDifficulty = difficulty * numberOfPlayers;
        while(loopCount < combinedDifficulty)
        {
        room.addMonster(randomMonster());
        loopCount ++;
        }
    }

    public void addTreasureToRoom(Room room) {
        int loopCount = 0;
        int combinedDifficulty = difficulty * numberOfPlayers;
        while(loopCount < combinedDifficulty)
        {
        room.addTreasure(randomTreasure());
            loopCount ++;
        }
    }

    public void generateRooms() {
        int loopCount = 0;
        int combinedDifficulty = difficulty * numberOfPlayers;
        while(loopCount < combinedDifficulty)
        {
            Room room = new Room();
            rooms.add(room);
            loopCount ++;
        }
        for(Room room : rooms){
        addMonsterToRoom(room);
        addTreasureToRoom(room);
        }
    }

    public void setupGame(){
    Scanner inputScanner = new Scanner(System.in);
        System.out.println("Welcome to CodeClan Fantasy Adventure");
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

    public void quest(){
        int roomIndex = 0;
        while(roomIndex < getRooms().size()){
            Room room = rooms.get(roomIndex);
            // fight monsters & get treasure
            room.killAllMonsters(); //for test
            room.removeAllTreasure(); //for test
            roomIndex ++;
        }
        System.out.println("Well done, you have completed the quest!");
    }

    public void fightAllMonsters(Room room){
        int fightIndex = 0;
        while(fightIndex < room.getMonsters().size()){
            Monster monster = room.getMonsters().get(fightIndex);
            fight(players, monster);
            fightIndex ++;
        }
    }

    public void fight(ArrayList<Player> players, Monster monster) {
        int playerIndex = 0;
        while(playerIndex < players.size()){
            Player player = players.get(playerIndex);
            String result = player.getCharacterClass().attack(monster);
            playerIndex ++;
            System.out.println(result);
        }
    }

}
