package Part1;

public class Character {
    private String name;
    private int health;
    private int level;

    public Character() {
        name = "Unknown";
        health = 0;
        level = 0;
    }

    public Character(String name, int health, int level) {
        this.name = name;
        this.health = health;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getLevel() {
        return level;
    }

    public void levelUp() {
        this.level++;
        this.level = Math.clamp(this.level, 0, 5);
    }

    public void heal(int amount) {
        this.health += amount;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", level=" + level +
                '}';
    }
}
