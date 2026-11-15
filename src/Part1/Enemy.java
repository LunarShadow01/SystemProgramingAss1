package Part1;

public class Enemy extends Character {
    private int damage;

    public Enemy(String name, int health, int level, int damage) {
        super(name, health, level);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    @Override
    public String toString() {
        return "Enemy{" +
                "name: " + getName() +
                " health: " + getHealth() +
                " level: " + getLevel() +
                " damage=" + damage +
                '}';
    }
}
