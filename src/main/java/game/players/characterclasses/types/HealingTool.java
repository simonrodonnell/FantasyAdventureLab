package game.players.characterclasses.types;

public enum HealingTool {

    POTIONS (20),
    HERBS (15),
    OINTMENTS (10),
    MAGICPIPES (50);

    private int healingFactor;

    private HealingTool(int healingFactor){
        this.healingFactor = healingFactor;
    }

    public int getHealingFactor() {
        return healingFactor;
    }
}
