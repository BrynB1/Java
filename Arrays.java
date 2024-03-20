package Junior;

import java.util.Random;

public class Arrays {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100) + 1;
        }
        int[] frequency = new int[100];
        for (int number : numbers) {
            frequency[number - 1]++;
        }
        for (int i = 0; i < frequency.length; i++) {
            System.out.println("Number " + (i + 1) + " appears " + frequency[i] + " times.");
        }
    }
}
