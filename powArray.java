package Sophmore;

import java.util.Scanner;
public class powArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number = sc.nextInt();
        int squared=number*number;
        System.out.println("Please enter a power:");
        int power = sc.nextInt();
        System.out.println(squared);
        System.out.println(Math.pow(number,power));
    }
}
