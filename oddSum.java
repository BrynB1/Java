package Sophmore;

public class oddSum {
    public static int oddSum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return (n % 2 != 1) ? oddSum(n - 1) : oddSum(n - 1) + n;
        }
    }

    public static void main(String[] args) {
        oddSum(13);
    }
}

