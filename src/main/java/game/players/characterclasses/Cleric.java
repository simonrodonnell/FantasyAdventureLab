package game.players.characterclasses;

import game.behaviours.Dice;
import game.behaviours.IAttack;
import game.players.Player;
import game.players.characterclasses.types.HealingTool;
import game.players.characterclasses.types.WeaponTypes;
import game.rooms.enemies.Enemy;

public class Cleric extends CharacterClass implements IAttack {

    private HealingTool healingTool;
    private WeaponTypes weapon;

    public Cleric(HealingTool healingTool){
        this.healingTool = healingTool;
        this.weapon = WeaponTypes.STAFF;
    }

    public void setHealingTool(HealingTool healingTool) {
        this.healingTool = healingTool;
    }

    public String healPlayer(Player player){
        player.heal(healingTool.getHealingFactor());
        return player.getName() + " has been healed by " + healingTool.getHealingFactor() + " points";
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
