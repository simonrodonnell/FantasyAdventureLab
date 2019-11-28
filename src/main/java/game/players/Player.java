package game.players;

import game.players.characterclasses.CharacterClass;

public class Player {

    private String name;
    private int hitPoints;
    private int gold;
    private CharacterClass characterClass;
    private int maxHitPoints = 20;

    public Player(String name, CharacterClass characterClass){
        this.name = name;
        this.characterClass = characterClass;
        this.hitPoints = maxHitPoints;
        this.gold = 0;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getGold() {
        return gold;
    }

    public CharacterClass getCharacterClass() {
        return characterClass;
    }

    public void heal(int healingFactor) {
        this.hitPoints += healingFactor;
        if(hitPoints > maxHitPoints){
            hitPoints = maxHitPoints;
        }
    }
}
