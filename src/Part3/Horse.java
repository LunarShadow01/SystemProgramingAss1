package Part3;

public class Horse extends Thread {
    private String name;
    private FinishingLine finishingLine;
    private int distance;

    public Horse(String name, FinishingLine finishingLine, int distance) {
        this.name = name;
        this.finishingLine = finishingLine;
        this.distance = distance;
    }

    public void run() {
        while (distance > 0) {
            try {
                System.out.println(this.getHorseName() + ": " + distance + " meters to finish");
                Thread.sleep(1000);
                distance -= (int)(Math.random() * 21);
                if (distance <= 0)
                    distance = 0;
            } catch (Exception exception) {}
        }
        finishingLine.arrive(this);
    }

    public String getHorseName() {
        return name;
    }
}
