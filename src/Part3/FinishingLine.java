// Name: איליי בנזינו  ID: 326476827
// Name: ______  ID: ______

package Part3;

public class FinishingLine {
    int placement = 1;

    public synchronized void arrive(Horse h) {
        if (placement != 1) {
            synchronized (System.out) {
                System.out.println(h.getHorseName() + ": has finished in " + placement + "-th place");
            }
        } else {
            synchronized (System.out) {
                System.out.println("=======================");
                System.out.println(h.getHorseName() + ": has finished first!");
                System.out.println("=======================");
            }
        }
        placement++;
    }
}
