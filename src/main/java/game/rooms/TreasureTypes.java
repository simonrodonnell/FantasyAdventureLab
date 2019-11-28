package game.rooms;

public enum TreasureTypes {

    GOLD (5),
    GEMS (10),
    ARTIFACTS (2);

    private int goldValue;

    private TreasureTypes(int goldValue){
        this.goldValue = goldValue;
    }

    public int getGoldValue() {
        return goldValue;
    }
}


