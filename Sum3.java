package Junior;

import java.util.Scanner;

public class Sum3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("Enter a number (-1 to stop): ");
            int number = scanner.nextInt();

            if (number == -1) {
                break;
            }

            if (number % 2 == 0) {
                sum += number;
            }
        }

        System.out.println("Sum: " + sum);
    }
}
