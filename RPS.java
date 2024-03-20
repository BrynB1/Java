package Junior;

import java.util.Scanner;
import java.util.Random;

class RockPaperScissors {

    public static void main(String[] args) {
        playRockPaperScissors();
    }

    private static void playRockPaperScissors() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to Rock-Paper-Scissors game!");
        System.out.println("Enter your choice: rock, paper, or scissors");

        while (true) {
            System.out.print("Your choice: ");
            String playerChoice = scanner.next().toLowerCase();

            if (!isValidChoice(playerChoice)) {
                System.out.println("Invalid choice. Please choose rock, paper, or scissors.");
                continue;
            }

            int computerChoiceIndex = random.nextInt(3);
            String computerChoice = getChoiceFromIndex(computerChoiceIndex);

            System.out.println("Computer chooses: " + computerChoice);
            determineWinner(playerChoice, computerChoice);

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next().toLowerCase();
            if (!playAgain.equals("yes")) {
                break;
            }
        }

        System.out.println("Thanks for playing! Goodbye!");
        scanner.close();
    }

    private static boolean isValidChoice(String choice) {
        return choice.equals("rock") || choice.equals("paper") || choice.equals("scissors");
    }

    private static String getChoiceFromIndex(int index) {
        switch (index) {
            case 0:
                return "rock";
            case 1:
                return "paper";
            case 2:
                return "scissors";
            default:
                return "";
        }
    }

    private static void determineWinner(String playerChoice, String computerChoice) {
        if (playerChoice.equals(computerChoice)) {
            System.out.println("It's a tie!");
        } else if (
                (playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                        (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                        (playerChoice.equals("scissors") && computerChoice.equals("paper"))
        ) {
            System.out.println("Congratulations! You win!");
        } else {
            System.out.println("Sorry, you lose. Try again!");
        }
    }
}
