// Name: איליי בנזינו  ID: 326476827
// Name: ______  ID: ______

package Part1;

import java.util.Arrays;

public class Player extends Character {
    private Item[] inventory;

    public Player(String name, int health, int level) {
        super(name, health, level);
        inventory = new Item[10];
    }

    public Player(String name, int health, int level, Item[] inventory) {
        super(name, health, level);
        this.inventory = inventory;
    }

    public void addItem(Item item) {
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] == null) {
                inventory[i] = item;
                break;
            }
        }
    }

    public int calculateInventoryValue() {
        int total = 0;
        for (Item item : inventory) {
            if (item != null) {
                total += item.getValue();
            }
        }
        return  total;
    }

    public boolean hasMagicalItem() {
        boolean has = false;
        for (Item item : inventory) {
            has = has || item.isMagical();
        }
        return has;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name: " + getName() +
                " health: " + getHealth() +
                " level: " + getLevel() +
                " inventory=" + Arrays.toString(inventory) +
                '}';
    }
}
