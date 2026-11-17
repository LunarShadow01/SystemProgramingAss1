// Name: איליי בנזינו  ID: 326476827
// Name: גל אור ID: 213308232

package Part1;

public class Game {
    public static void main(String[] args) {
        Item i1 = new Item("ice sword", 100, true);
        Item i2 = new Item("rock", 1, false);
        Item i3 = new Item("gem", 50, false);
        Player p1 = new Player("Sir penguin", 10, 3);
        Player p2 = new Player("Mr fenêtre", 10, 1);
        p1.addItem(i1);
        p1.addItem(i3);
        p2.addItem(i2);
        p2.addItem(i3);
        Enemy e1 = new Enemy("Sam altman", 5, 2, 1);
        Player[] players = {p1, p2};
        Enemy[] enemies = {e1};
        GameWorld world = new GameWorld("Tech world", players, enemies, 3);
        world.printAllPlayers();
        for (Player player : players) {
            System.out.println(player.getName() + " total inventory value: " + player.calculateInventoryValue());
        }
        simulateBattle(p1, e1);
        simulateBattle(p2, e1);
    }

    public static void simulateBattle(Player player, Enemy enemy) {
        System.out.println(player.getName() + " VS " + enemy.getName());
        if (player.getLevel() > enemy.getLevel()) {
            System.out.println(player.getName() + " wins");
            player.levelUp();
        } else if (player.getLevel() < enemy.getLevel()) {
            System.out.println(enemy.getName() + " wins");
            enemy.levelUp();
        } else {
            int coin_toss = (int)(Math.random() * 2);
            if (coin_toss == 0) {
                System.out.println(player.getName() + " wins");
                player.levelUp();
            } else {
                System.out.println(enemy.getName() + " wins");
                enemy.levelUp();
            }
        }
    }
}
