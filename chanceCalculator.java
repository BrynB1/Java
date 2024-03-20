package Junior;

import java.util.Scanner;

class ChanceCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Chance Calculator!");

        int score = 0;
        int totalQuestions = 5;

        // Question 1
        System.out.println("\nQuestion 1: Do you share common interests? (1 for Yes, 0 for No)");
        score += scanner.nextInt();

        // Question 2
        System.out.println("\nQuestion 2: Have you been friends for a long time? (1 for Yes, 0 for No)");
        score += scanner.nextInt();

        // Question 3
        System.out.println("\nQuestion 3: Have you gone on casual outings together? (1 for Yes, 0 for No)");
        score += scanner.nextInt();

        // Question 4
        System.out.println("\nQuestion 4: Is there mutual attraction? (1 for Yes, 0 for No)");
        score += scanner.nextInt();

        // Question 5
        System.out.println("\nQuestion 5: Do you communicate often? (1 for Yes, 0 for No)");
        score += scanner.nextInt();

        scanner.close();

        // Calculate chance percentage
        double chancePercentage = (double) score / totalQuestions * 100;

        // Display result
        System.out.println("\nCalculating...");
        System.out.println("The chance of the girl going out with you is: " + chancePercentage + "%");
    }
}
