// Name: איליי בנזינו  ID: 326476827
// Name: ______  ID: ______

package Part1;

public class GameWorld {
    private String name;
    private Player[] players;
    private Enemy[] enemies;
    private int difficulty;

    public GameWorld() {
        players = new Player[10];
        enemies = new Enemy[10];
        difficulty = 1;
        name = "Crystalpath";
    }

    public GameWorld(String name, Player[] players, Enemy[] enemies, int difficulty) {
        this.name = name;
        this.players = players;
        this.enemies = enemies;
        this.difficulty = difficulty;
    }

    public void addPlayer(Player player) {
        for (int i = 0; i < players.length; i++) {
            if (players[i] == null) {
                players[i] = player;
                break;
            }
        }
    }

    public void printAllPlayers() {
        int c = 1;
        for (int i = 0; i < players.length; i++) {
            if (players[i] != null) {
                System.out.println("-------player " + (c++) + "-------");
                System.out.println(players[i]);
            }
        }
    }

    public int getTotalValueOfWorld() {
        int total = 0;
        for (Player player : players) {
            if (player != null) {
                total += player.calculateInventoryValue();
            }
        }
        return  total;
    }

    private int countPlayers() {
        int total = 0;
        for (Player player : players) {
            if (player != null) {
                total++;
            }
        }
        return  total;
    }

    @Override
    public String toString() {
        return "GameWorld{" +
                "difficulty=" + difficulty + "\n" +
                "number of players=" + countPlayers() + "\n" +
                "name='" + name + '\'' +
                '}';
    }
}
