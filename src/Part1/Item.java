// Name: איליי בנזינו  ID: 326476827
// Name: גל אור ID: 213308232

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
        setValue(value);
        this.isMagical = isMagical;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if (value < 0) {
            this.value = 0;
        } else {
            this.value = value;
        }
    }

    public String getName() {
        return name;
    }

    public boolean isMagical() {
        return isMagical;
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
