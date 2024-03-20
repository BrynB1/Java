package Junior;

import java.util.Random;

class Number {
    private final int num;

    public Number(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

}

public class Array2 {
    public static void main(String[] args) {
        Number[] numbers = new Number[100];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            int num = random.nextInt(100) + 1;
            numbers[i] = new Number(num);
        }

        int[] frequency = new int[100];
        for (Number number : numbers) {
            int num = number.getNum();
            frequency[num - 1]++;
        }

        for (int i = 0; i < frequency.length; i++) {
            System.out.println("Number " + (i + 1) + " appears " + frequency[i] + " times.");
        }
    }
}
