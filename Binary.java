package Junior;

import java.util.PriorityQueue;
import java.util.Comparator;

public class Binary {
    public static void main(String[] args) {
        int[] numbers = {9, 12, 21, 30, 4, 19};
        PriorityQueue<Integer> binaryPriorityQueue = new PriorityQueue<>(Comparator.comparingInt(Integer::bitCount));
        for (int num : numbers) {
            binaryPriorityQueue.offer(num);
        }

        System.out.println("Numbers sorted by the count of ones in their binary representation:");
        while (!binaryPriorityQueue.isEmpty()) {
            int number = binaryPriorityQueue.poll();
            String binary = Integer.toBinaryString(number);
            System.out.println(number + " -> " + binary + " (Number of Ones: " + Integer.bitCount(number) + ")");
        }
    }
}



