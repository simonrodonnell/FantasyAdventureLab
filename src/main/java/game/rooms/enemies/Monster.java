package game.rooms.enemies;

public class Monster {

    private MonsterTypes type;
    private int hitPoints;

    public Monster(MonsterTypes type){
        this.type = type;
        this.hitPoints = type.getHitPoints();
    }

    public MonsterTypes getType() {
        return type;
    }

    public void setType(MonsterTypes type) {
        this.type = type;
        this.hitPoints = type.getHitPoints();
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public String takeDamage(int damage) {
        hitPoints -= damage;
        if(hitPoints <= 0){
            return "You killed the "+ type.getName() +"!";
        } else {
            return "You hit the "+ type.getName() +"!";
        }
    }
}
