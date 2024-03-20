package Junior;

import java.util.Scanner;

public class makeChange {
    public static void main(String[] args) {
        int[][] dollarDenominations = {
                {20, 0}, // $20 bill
                {10, 0}, // $10 bill
                {5, 0},  // $5 bill
                {1, 0}   // $1 bill
        };

        int[][] centDenominations = {
                {25, 0}, // Quarter
                {10, 0}, // Dime
                {5, 0},  // Nickel
                {1, 0}   // Penny
        };

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount charged: $");
        double amountCharged = scanner.nextDouble();

        System.out.print("Enter the amount given: $");
        double amountGiven = scanner.nextDouble();
        double difference = amountGiven - amountCharged;
        if (difference < 0) {
            System.out.println("Insufficient amount given.");
            System.exit(0);
        }

        System.out.println("Change to be given: $" + difference);

        // Split dollars and cents
        int dollars = (int) difference;
        int cents = (int) Math.round((difference - dollars) * 100);

        calculateChange(dollars, dollarDenominations);
        calculateChange(cents, centDenominations);

        System.out.println("Change breakdown:");
        printChange(dollarDenominations);
        printChange(centDenominations);
    }

    private static void calculateChange(int change, int[][] denominations) {
        for (int[] denomination : denominations) {
            int denominationValue = denomination[0];
            int quantity = change / denominationValue;

            denomination[1] = quantity;
            change -= quantity * denominationValue;
        }
    }

    private static void printChange(int[][] denominations) {
        for (int[] denomination : denominations) {
            int denominationValue = denomination[0];
            int quantity = denomination[1];

            if (quantity > 0) {
                String unit = denominationValue >= 100 ? "bill" : "coin";
                System.out.println("$" + denominationValue + " " + unit + ": " + quantity);
            }
        }
    }
}
