package Sophmore;

public class Test{
    public static void main(String[] args) {
        int[] intArray;
        intArray = new int[0];
        int left = 1;
        int right =22;
        for (int i = left; i <= right; i++) {
            int val = i;
            while (val > 0) {
                int digit = val % 10;
                if (digit == 0 || i % digit != 0) {
                    break;
                }
                val /= 10;
            }
            if (val == 0) {
                //intArray.add(i);
            }
        }
    }
}