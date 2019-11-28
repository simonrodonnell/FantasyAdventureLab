package game.players.characterclasses;

import game.players.Player;
import game.players.characterclasses.types.HealingTool;

public class Cleric extends CharacterClass {

    private HealingTool healingTool;

    public Cleric(HealingTool healingTool){
        this.healingTool = healingTool;
    }

    public void setHealingTool(HealingTool healingTool) {
        this.healingTool = healingTool;
    }

    public String healPlayer(Player player){
        player.heal(healingTool.getHealingFactor());
        return player.getName() + " has been healed by " + healingTool.getHealingFactor() + " points";
    }
}
