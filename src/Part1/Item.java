package Part1;

public class Item {
    private String name;
    private int value;
    private boolean isMagical;

    public Item() {
        name = "Unknown";
        value = 0;
        isMagical = false;
    }

    public Item(String name, int value, boolean isMagical) {
        this.name = name;
        this.value = value;
        this.isMagical = isMagical;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Part1.Item{" +
                "name='" + name + '\'' +
                ", value=" + value +
                ", isMagical=" + isMagical +
                '}';
    }
}
