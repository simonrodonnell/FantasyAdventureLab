package game.rooms.enemies;

public enum EnemyTypes {

    DRAGON(25),
    TROLL(15),
    ORC(10),
    SKELETON(10),
    GOBLIN(5);

    private int hitPoints;

    EnemyTypes(int hitPoints){
        this.hitPoints = hitPoints;
    }

    public int getHitPoints() {
        return hitPoints;
    }
}
