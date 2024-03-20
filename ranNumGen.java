package Junior;

import java.util.Random;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ranNumGen {
    public static void main(String[] args) {
        Random random = new Random();
        Node head;
        Node tail;

        int rand1 = random.nextInt(100);
        int rand2 = random.nextInt(100);

        while (getNumDigits(rand1) != getNumDigits(rand2)) {
            rand1 = random.nextInt(100);
            rand2 = random.nextInt(100);
        }

        head = new Node(rand1);
        tail = head;
        tail.next = new Node(rand2);
        tail = tail.next;

        System.out.println("Random numbers with the same length:");
        System.out.println("Number 1: " + head.data);
        System.out.println("Number 2: " + tail.data);
    }

    private static int getNumDigits(int number) {
        if (number == 0) {
            return 1;
        }

        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }

        return count;
    }
}
