package Part3;

import java.util.Scanner;

public class HorseRace {
    static final int horses = 10;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance: ");
        FinishingLine finishingLine = new FinishingLine();
        int distance = input.nextInt();
        for (int i = 0; i < horses; i++) {
            Horse horse = new Horse(("horse " + (i + 1)), finishingLine, distance);
            horse.start();
        }
    }
}
