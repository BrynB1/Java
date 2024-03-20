package Sophmore;

import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 1 + (int)(100 * Math.random());
        int K = 5;
        int i, guess;
        System.out.println("Guess a number between 1 and 100 in 5 tries.");
        for (i = 0; i < K; i++) {
            System.out.println("Guess the number:");
            guess = sc.nextInt();
            if (number == guess) {
                System.out.println("Congratulations!" + " You guessed the number.");
                break;
            }
            else if (number > guess
                    && i != K - 1) {
                System.out.println("The number is " + "greater than " + guess);
            }
            else if (number < guess && i != K - 1) {
                System.out.println("The number is" + " less than " + guess);
            }
        }
        if (i == K) {
            System.out.println("You have run out of tries!");
            System.out.println("The number was " + number);
        }
    }
}

