package game.players.characterclasses;

import game.behaviours.Dice;
import game.behaviours.IAttack;
import game.players.characterclasses.types.WeaponTypes;
import game.players.characterclasses.types.WarriorTypes;
import game.rooms.enemies.Enemy;

public class Warrior extends CharacterClass implements IAttack {

    private WarriorTypes type;
    private WeaponTypes weapon;

    public Warrior(WarriorTypes type, WeaponTypes weapon){
        this.type = type;
        this.weapon = weapon;
    }

    public WarriorTypes getType() {
        return type;
    }

    public WeaponTypes getWeapon() {
        return weapon;
    }

    public void changeWeapon(WeaponTypes newWeapon){
        this.weapon = newWeapon;
    }

    public String attack(Enemy enemy){
        Dice dice = new Dice();
        int playerAttacks = dice.rollDice();
        int enemyDefends = dice.rollDice();
        if(playerAttacks > enemyDefends){
            return enemy.takeDamage(weapon.getDamage());
        } else {
            return "You missed!";
        }
    }
}
