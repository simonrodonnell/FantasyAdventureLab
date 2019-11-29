package game.rooms.enemies;

public enum MonsterTypes {

    DRAGON(25),
    TROLL(15),
    ORC(10),
    SKELETON(10),
    GOBLIN(5);

    private int hitPoints;

    MonsterTypes(int hitPoints){
        this.hitPoints = hitPoints;
    }

    public int getHitPoints() {
        return hitPoints;
    }
}
