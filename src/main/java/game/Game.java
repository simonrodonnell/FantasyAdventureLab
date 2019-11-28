package game;

import com.sun.org.apache.xpath.internal.operations.Bool;
import game.players.Player;
import game.rooms.Room;

import java.util.ArrayList;

public class Game {

    private ArrayList<Player> players;
    private ArrayList<Room> rooms;

    public Game(){
        this.players = new ArrayList<Player>();
        this.rooms = new ArrayList<Room>();
    }


}
