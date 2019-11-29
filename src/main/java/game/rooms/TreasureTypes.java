package game.rooms;

public enum TreasureTypes {

    GEMS ("Gems", 10),
    GOLD ("Gold",5),
    ARTIFACTS ("Artifacts",2),
    COINS ("Coins",1);

    private final int goldValue;
    private final String name;

    private TreasureTypes(String name, int goldValue){
        this.goldValue = goldValue;
        this.name = name;
    }

    public int getGoldValue() {
        return goldValue;
    }

    public String getName() {
        return name;
    }
}


