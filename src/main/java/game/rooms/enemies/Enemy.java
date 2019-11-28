package game.rooms.enemies;

public class Enemy {

    private EnemyTypes type;
    private int hitPoints;

    public Enemy(EnemyTypes type){
        this.type = type;
        this.hitPoints = type.getHitPoints();
    }

    public EnemyTypes getType() {
        return type;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public String takeDamage(int damage) {
        hitPoints -= damage;
        if(hitPoints <= 0){
            return "You killed the enemy!";
        } else {
            return "You hit the enemy!";
        }
    }
}
