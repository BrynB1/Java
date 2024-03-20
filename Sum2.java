package Junior;

public class Sum2 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                continue;
            }
            sum += i;
        }

        System.out.println("Sum - multiples of 5: " + sum);
    }
}

