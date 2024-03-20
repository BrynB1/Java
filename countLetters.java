package Junior;

import java.util.Scanner;

class Test {
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedList {
        Node head;

        void add(char data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }
    }

    static class Frequency {
        char letter;
        int count;

        Frequency(char letter, int count) {
            this.letter = letter;
            this.count = count;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toLowerCase();
        scanner.close();

        LinkedList linkedList = new LinkedList();
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                linkedList.add(c);
            }
        }

        Frequency[] frequencies = new Frequency[26];
        Node current = linkedList.head;
        while (current != null) {
            int index = current.data - 'a';
            if (frequencies[index] == null) {
                frequencies[index] = new Frequency(current.data, 1);
            } else {
                frequencies[index].count++;
            }
            current = current.next;
        }

        System.out.println("Letter Frequency:");
        for (Frequency freq : frequencies) {
            if (freq != null) {
                System.out.println(freq.letter + ": " + freq.count);
            }
        }
    }
}
